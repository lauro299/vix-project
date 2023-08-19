package com.example.vixproject.main.ui.detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.vixproject.R
import com.example.vixproject.main.data.NodeRepositoryImp
import com.example.vixproject.main.domain.model.VideoData
import com.example.vixproject.main.domain.useCase.GetDetailVideo
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import java.io.BufferedReader

class DetailViewModel(
    private val getDetail: GetDetailVideo
) : ViewModel() {

    companion object {
        const val TAG = "DetailViewModel"
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application =
                    checkNotNull(this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY])
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