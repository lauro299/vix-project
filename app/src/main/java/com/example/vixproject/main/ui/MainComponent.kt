package com.example.vixproject.main.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.vixproject.main.domain.useCase.GetNodes
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.vixproject.R
import com.example.vixproject.main.data.NodeRepositoryImp
import com.example.vixproject.main.ui.node.HeroNodeComponent
import com.example.vixproject.main.ui.node.NodeComponent
import java.io.BufferedReader

@Composable
fun MainComponent(
    mainViewModel: MainViewModel =viewModel(factory = MainViewModel.Factory)
) {
    val nodes by mainViewModel.getNodes().collectAsState(initial = emptyList())
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)){
        items(nodes){
            if(it.isHero())
                HeroNodeComponent(node = it)
            else
                NodeComponent(node = it)
        }
    }
}


class MainViewModel(
    val getNodes: GetNodes
):ViewModel(
){
    companion object{
        const val TAG = "MainViewModel"
        val Factory: ViewModelProvider.Factory = viewModelFactory{
            initializer {
                val application = checkNotNull(this[APPLICATION_KEY])
                val result:String = application.applicationContext.resources.openRawResource(R.raw.inicio)
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