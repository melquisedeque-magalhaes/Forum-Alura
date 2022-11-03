package com.melqui.Forum.Alura.model

import java.time.LocalDateTime

data class Response (
    val id: Long? = null,
    val message: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val author: User,
    val topic: Topic,
    val solution: Boolean
)
