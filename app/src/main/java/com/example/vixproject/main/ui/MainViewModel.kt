package com.example.vixproject.main.ui

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
import com.example.vixproject.main.domain.model.Node
import com.example.vixproject.main.domain.useCase.GetNodes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.io.BufferedReader

const val LABEL_INIT = "Inicio"

class MainViewModel(
    val getNodes: GetNodes
) : ViewModel(
) {

    val getBadges by mutableStateOf(listOf<String>(LABEL_INIT, "Cine", "Novelas", "Premium"))

    var nodesFlow = getNodes()
        .flowOn(Dispatchers.Default)
        .stateIn(viewModelScope, started = SharingStarted.Eagerly, initialValue = emptyList())
    companion object {
        const val TAG = "MainViewModel"
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
                MainViewModel(
                    getNodes = GetNodes(repository = NodeRepositoryImp(result))
                )
            }
        }
    }

}