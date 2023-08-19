package com.example.vixproject.main.domain.repository

import com.example.vixproject.main.domain.model.Node
import kotlinx.coroutines.flow.Flow

interface NodeRepository {
    fun getNodes(): Flow<List<Node>>
}