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
import com.example.vixproject.main.domain.useCase.GetStreamOfNode
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.filterNot
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.observeOn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.flow.transformLatest
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel
import java.io.BufferedReader

const val LABEL_INIT = "Inicio"

@KoinViewModel
class MainViewModel(
    val getStreamOfNode: GetStreamOfNode
) : ViewModel(
) {

    val getBadges by mutableStateOf(listOf<String>(LABEL_INIT, "Cine", "Novelas", "Premium"))
    var nodesFlow by mutableStateOf(emptyList<Node>())
        private set

    var nodesStream = getStreamOfNode()
        .filterNot {
            it.list.isEmpty()
        }
        .flowOn(Dispatchers.Default)
        .onEach {
            nodesFlow = nodesFlow + it
        }
        .flowOn(Dispatchers.Default)
        .launchIn(viewModelScope)

    //.stateIn(viewModelScope, started = SharingStarted.Eagerly, initialValue = emptyList())
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
                val nodeRepository = NodeRepositoryImp(result)
                MainViewModel(
                    getStreamOfNode = GetStreamOfNode(repository = nodeRepository)
                )
            }
        }
    }

}