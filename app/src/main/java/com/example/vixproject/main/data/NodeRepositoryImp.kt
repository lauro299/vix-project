package com.example.vixproject.main.data

import com.example.vixproject.main.domain.model.Node
import com.example.vixproject.main.domain.model.NodeType
import com.example.vixproject.main.domain.model.VideoData
import com.example.vixproject.main.domain.repository.NodeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

class NodeRepositoryImp(private val dataString: String): NodeRepository{

    override fun getNodes(): Flow<List<Node>> {
        return flow{
            val data = Json{
                isLenient=false
                ignoreUnknownKeys=true
                explicitNulls= false
            }.decodeFromString<VixContainer>(dataString)
            emit(data.data.uiPage.uiModules.edges.map {
                Node(
                    name = it.node.title,
                    list = it.node.contents?.edges?.map {
                        VideoData(
                            name = it.node.video?.title ?: it.node.heroTarget?.title ?: "",
                            imageUrl= it.node.image?.link ?: it.node.mobileFillImage?.link ?: "",
                            description = it.node.video?.description ?: it.node.heroTarget?.description ?: ""
                        )
                    } ?: emptyList(),
                    type = when(it.node.moduleType){
                        "HERO_CAROUSEL" -> NodeType.HERO
                        else -> NodeType.NORMAL
                    }
                )
            })
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
internal data class VixUiModules(val edges:List<VixNodeContainer>)

@Serializable
internal data class VixNodeContainer(
    val node: VixNode
)

@Serializable
internal data class VixNode(
    val moduleType:String,
    val title: String,
    val contents: VixNodeContent?
)

@Serializable
internal data class VixNodeContent(
    val edges:List<VixVideoDetail>
)
@Serializable
internal data class VixVideoDetail(
    val node: VixVideoNode
)

@Serializable
internal data class VixVideoNode(
    val mobileFillImage: VixMobileFillImage?=null,
    val heroTarget: VixVideo?=null,
    val video: VixVideo?=null,
    val image: VixMobileFillImage?=null
)

@Serializable
internal data class VixMobileFillImage(
    val link: String
)

@Serializable
internal data class VixVideo(
    val title: String,
    val description: String,
    val genres: List<String>,
    val badges: List<String>,

)