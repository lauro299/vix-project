package com.example.vixproject.main.domain.useCase

import com.example.vixproject.main.domain.repository.NodeRepository
import org.koin.core.annotation.Single

@Single(binds = [GetStreamOfNode::class])
class GetStreamOfNode(
    private val repository: NodeRepository
) {
    operator fun invoke() = repository.getStreamNodes()
}