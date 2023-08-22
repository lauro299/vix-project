package com.example.vixproject.main.domain.repository

import com.example.vixproject.main.domain.model.Node
import com.example.vixproject.main.domain.model.VideoData
import kotlinx.coroutines.flow.Flow

interface NodeRepository {
    fun getNodes(): Flow<List<Node>>

    fun getStreamNodes():Flow<Node>

    fun getDetail(id:String): Flow<VideoData>
}