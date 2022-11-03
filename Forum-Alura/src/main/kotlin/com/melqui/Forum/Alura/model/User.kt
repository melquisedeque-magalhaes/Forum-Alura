package com.melqui.Forum.Alura.model

import java.time.LocalDateTime

data class User (
    val id: Long? = null,
    val name: String,
    val email: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
)
