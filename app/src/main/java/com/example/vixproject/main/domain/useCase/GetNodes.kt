package com.example.vixproject.main.domain.useCase

import com.example.vixproject.main.domain.repository.NodeRepository
import org.koin.core.annotation.Single

@Single
class GetNodes(
    private val repository: NodeRepository
) {
    operator fun invoke() = repository.getNodes()
}