package com.example.vixproject.main.domain.useCase

import com.example.vixproject.main.domain.repository.NodeRepository

class GetStreamOfNode(
    private val repository: NodeRepository
) {
    operator fun invoke() = repository.getStreamNodes()
}