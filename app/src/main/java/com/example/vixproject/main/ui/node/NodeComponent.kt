package com.example.vixproject.main.ui.node

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.vixproject.main.domain.model.Node

@Composable
fun NodeComponent(node: Node) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = node.name, style = MaterialTheme.typography.headlineMedium)
        LazyRow(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            items(node.list) { videoData ->
                Card(modifier = Modifier.fillParentMaxWidth(0.4f), elevation = CardDefaults.cardElevation()) {
                    AsyncImage(
                        model = videoData.imageUrl,
                        contentDescription = videoData.name,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}