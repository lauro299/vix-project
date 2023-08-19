package com.example.vixproject.main.domain.model

data class Node(
    val name: String,
    val list: List<VideoData>,
    val type: NodeType
){
    fun isHero() = type == NodeType.HERO
}

data class VideoData(
    val id: String,
    val name: String,
    val imageUrl: String,
    val description: String,
    val imageBackUrl: String,
    val year: String,
    val director: List<String>,
    val staff: List<String>,
    val genres: List<String>
)

fun VideoData.genresAsString() = genres.joinToString(", ")

enum class NodeType {
    HERO,
    NORMAL
}