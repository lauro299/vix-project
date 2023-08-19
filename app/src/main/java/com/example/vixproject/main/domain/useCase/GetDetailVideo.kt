package com.example.vixproject.main.domain.useCase

import com.example.vixproject.main.domain.repository.NodeRepository

class GetDetailVideo(
    val repository: NodeRepository
) {
    operator fun invoke(id:String) = repository.getDetail(id)
}