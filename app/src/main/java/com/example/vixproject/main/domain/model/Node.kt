package com.example.vixproject.main.domain.model

data class Node(
    val name: String,
    val list: List<VideoData>,
    val type: NodeType
){
    fun isHero() = type == NodeType.HERO
}

data class VideoData(
    val name: String,
    val imageUrl: String,
    val description: String,
)

enum class NodeType {
    HERO,
    NORMAL
}