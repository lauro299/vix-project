package com.example.vixproject.main.ui.node

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.vixproject.main.domain.model.Node
import com.example.vixproject.main.domain.model.VideoData

@Composable
fun HeroNodeComponent(node: Node, goToDetail: (VideoData) -> Unit) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(node.list) { videoData ->
            Card(modifier = Modifier
                .fillParentMaxWidth(0.9f)
                .clickable {
                    goToDetail(videoData)
                }) {
                AsyncImage(
                    model = videoData.imageUrl,
                    contentDescription = videoData.name
                )
            }
        }
    }
}