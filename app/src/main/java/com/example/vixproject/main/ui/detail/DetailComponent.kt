package com.example.vixproject.main.ui.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import coil.compose.AsyncImage
import com.example.vixproject.R
import com.example.vixproject.main.data.NodeRepositoryImp
import com.example.vixproject.main.domain.model.VideoData
import com.example.vixproject.main.domain.model.genresAsString
import com.example.vixproject.main.domain.useCase.GetDetailVideo
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import java.io.BufferedReader

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailComponent(
    detailViewModel: DetailViewModel = androidx.lifecycle.viewmodel.compose.viewModel(factory = DetailViewModel.Factory),
    id: String,
    goBack: () -> Unit
) {
    val data = detailViewModel.videoData
    Box(modifier = Modifier.fillMaxSize()) {
        AsyncImage(
            model = data.imageBackUrl,
            contentDescription = data.name,
            modifier = Modifier
                .fillMaxWidth()
                .align(
                    Alignment.TopCenter
                ),
            contentScale = ContentScale.Crop,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            MaterialTheme.colorScheme.background.copy(alpha = 0.0f),
                            MaterialTheme.colorScheme.background
                        )
                    )
                )
        ) {}
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                IconButton(onClick = { goBack() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(id = R.string.btn_watch_now),
                    )
                }
            }
            item {
                Spacer(modifier = Modifier.fillParentMaxHeight(0.3f))
            }
            item {
                Text(data.name, style = MaterialTheme.typography.headlineLarge)
            }
            item {
                Text(data.description, maxLines = 3)
            }
            item {
                Text(text = data.genresAsString())
            }
            item {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow, contentDescription = stringResource(
                            id = R.string.btn_watch_now
                        ),
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = stringResource(id = R.string.btn_watch_now),
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
            item {
                Row {
                    FilterChip(selected = false, onClick = { /*TODO*/ }, label = {
                        Text(
                            text = stringResource(
                                id = R.string.label_more
                            )
                        )
                    },
                        shape = CircleShape
                    )
                    FilterChip(selected = false, onClick = { /*TODO*/ }, label = {
                        Text(
                            text = stringResource(
                                id = R.string.label_others
                            )
                        )
                    },
                        shape = CircleShape
                    )
                    FilterChip(selected = true, onClick = { /*TODO*/ }, label = {
                        Text(
                            text = stringResource(
                                id = R.string.label_details
                            )
                        )
                    },
                        shape = CircleShape
                    )
                }
            }
            item {
                Text(text = data.description)
            }
            if (data.year.isNotEmpty()) {
                item {
                    Text(text = stringResource(id = R.string.label_release, data.year))
                }
            }
            item {
                Text(text = stringResource(id = R.string.label_director))
                Text(text = data.director.firstOrNull() ?: "")
            }
            item {
                Column {
                    Text(text = stringResource(id = R.string.label_staff))
                    data.staff.forEach {
                        Text(text = it)
                    }
                }
            }
        }
        LaunchedEffect(Unit) {
            detailViewModel.loadDetail(id)
        }
    }
}


class DetailViewModel(
    private val getDetail: GetDetailVideo
) : ViewModel() {

    companion object {
        const val TAG = "DetailViewModel"
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = checkNotNull(this[APPLICATION_KEY])
                val result: String =
                    application.applicationContext.resources.openRawResource(R.raw.inicio)
                        .use {
                            val reader = BufferedReader(it.reader())
                            val content = StringBuilder()
                            var line = reader.readLine()
                            while (line != null) {
                                content.append(line)
                                line = reader.readLine()
                            }
                            content.toString()
                        }
                DetailViewModel(
                    getDetail = GetDetailVideo(NodeRepositoryImp(result))
                )
            }
        }
    }

    var videoData: VideoData by mutableStateOf(
        VideoData(
            "",
            "",
            "",
            "",
            "",
            year = "",
            director = emptyList(),
            staff = emptyList(),
            genres = emptyList()
        )
    )
        private set
    //val id = savedStateHandle["videoId"] ?: ""

    fun loadDetail(id: String) {
        viewModelScope.launch {
            videoData = getDetail(id).first()
        }
    }

}