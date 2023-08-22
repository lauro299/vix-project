package com.example.vixproject.main.data

import com.example.vixproject.main.domain.model.Node
import com.example.vixproject.main.domain.model.NodeType
import com.example.vixproject.main.domain.model.VideoData
import com.example.vixproject.main.domain.repository.NodeRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.filterNot
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flatMap
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.flow.transformLatest
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.koin.core.annotation.Named
import org.koin.core.annotation.Singleton

private const val director = "DIRECTOR"

private const val portrait = "VERTICAL_HERO"

private const val heroType = "HERO_CAROUSEL"

@Singleton(binds = [NodeRepository::class])
class NodeRepositoryImp(
    @Named("jsonString")
    private val dataString: String
) : NodeRepository {

    private val json = Json {
        isLenient = false
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    private lateinit var listNodes: List<Node>

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun getNodes(): Flow<List<Node>> {
        return flow {
            json.decodeFromString<VixContainer>(dataString)
                .let {
                    it.data.uiPage.uiModules.edges.asFlow()
                        .flatMapLatest {
                            flow {
                                emit(
                                    Node(
                                        name = it.node.title,
                                        list = it.node.contents?.edges?.map {
                                            VideoData(
                                                id = it.node.video?.id ?: it.node.heroTarget?.id
                                                ?: "",
                                                name = it.node.video?.title
                                                    ?: it.node.heroTarget?.title
                                                    ?: "",
                                                imageUrl = it.node.image?.link
                                                    ?: it.node.mobileFillImage?.link ?: "",
                                                description = it.node.video?.description
                                                    ?: it.node.heroTarget?.description ?: "",
                                                imageBackUrl = it.node.video?.imageAssets?.find { it.imageRole == portrait }?.link
                                                    ?: it.node.heroTarget?.imageAssets?.find { it.imageRole == portrait }?.link
                                                    ?: "",
                                                year = it.node.video?.copyrightYear?.toString()
                                                    ?: "",
                                                director = it.node.video?.contributors
                                                    ?.filter {
                                                        it.roles.contains(
                                                            director
                                                        )
                                                    }
                                                    ?.map { it.name } ?: emptyList(),
                                                staff = it.node.video?.contributors
                                                    ?.filterNot {
                                                        it.roles.contains(
                                                            director
                                                        )
                                                    }
                                                    ?.map { it.name }
                                                    ?: emptyList(),
                                                genres = it.node.video?.genres ?: emptyList()
                                            )
                                        } ?: emptyList(),
                                        type = when (it.node.moduleType) {
                                            heroType -> NodeType.HERO
                                            else -> NodeType.NORMAL
                                        }
                                    )
                                )
                            }
                        }
                        .filterNot {
                            it.list.isEmpty()
                        }
                        .toList()
                        .let {
                            listNodes = it
                            emit(it)
                        }
                }
        }
    }

    override fun getStreamNodes(): Flow<Node> {
        return channelFlow {
            json.decodeFromString<VixContainer>(dataString)
                .data.uiPage.uiModules.edges
                .forEach {
                    send(
                        Node(
                            name = it.node.title,
                            list = it.node.contents?.edges?.map {
                                VideoData(
                                    id = it.node.video?.id ?: it.node.heroTarget?.id
                                    ?: "",
                                    name = it.node.video?.title
                                        ?: it.node.heroTarget?.title
                                        ?: "",
                                    imageUrl = it.node.image?.link
                                        ?: it.node.mobileFillImage?.link ?: "",
                                    description = it.node.video?.description
                                        ?: it.node.heroTarget?.description ?: "",
                                    imageBackUrl = it.node.video?.imageAssets?.find { it.imageRole == portrait }?.link
                                        ?: it.node.heroTarget?.imageAssets?.find { it.imageRole == portrait }?.link
                                        ?: "",
                                    year = it.node.video?.copyrightYear?.toString()
                                        ?: "",
                                    director = it.node.video?.contributors
                                        ?.filter {
                                            it.roles.contains(
                                                director
                                            )
                                        }
                                        ?.map { it.name } ?: emptyList(),
                                    staff = it.node.video?.contributors
                                        ?.filterNot {
                                            it.roles.contains(
                                                director
                                            )
                                        }
                                        ?.map { it.name }
                                        ?: emptyList(),
                                    genres = it.node.video?.genres ?: emptyList()
                                )
                            } ?: emptyList(),
                            type = when (it.node.moduleType) {
                                heroType -> NodeType.HERO
                                else -> NodeType.NORMAL
                            }
                        )
                    )
                }
        }
    }

    override fun getDetail(id: String): Flow<VideoData> {
        return flow {
            getNodes().first()
            listNodes.flatMap { it.list }.find { it.id == id }?.let {
                emit(it)
            }
        }
    }
}

@Serializable
internal data class VixContainer(val data: VixData)

@Serializable
internal data class VixData(val uiPage: VixUiPage)

@Serializable
internal data class VixUiPage(val uiModules: VixUiModules)

@Serializable
internal data class VixUiModules(val edges: List<VixNodeContainer>)

@Serializable
internal data class VixNodeContainer(
    val node: VixNode
)

@Serializable
internal data class VixNode(
    val moduleType: String,
    val title: String,
    val contents: VixNodeContent?
)

@Serializable
internal data class VixNodeContent(
    val edges: List<VixVideoDetail>
)

@Serializable
internal data class VixVideoDetail(
    val node: VixVideoNode
)

@Serializable
internal data class VixVideoNode(
    val mobileFillImage: VixMobileFillImage? = null,
    val heroTarget: VixVideo? = null,
    val video: VixVideo? = null,
    val image: VixMobileFillImage? = null
)

@Serializable
internal data class VixMobileFillImage(
    val link: String,
    val imageRole: String?
)

@Serializable
internal data class VixVideo(
    val id: String,
    val title: String,
    val description: String,
    val genres: List<String>,
    val badges: List<String>,
    val imageAssets: List<VixMobileFillImage>?,
    val copyrightYear: Int?,
    val contributors: List<VixContributor>?
)

@Serializable
internal data class VixContributor(
    val name: String,
    val roles: List<String>
)