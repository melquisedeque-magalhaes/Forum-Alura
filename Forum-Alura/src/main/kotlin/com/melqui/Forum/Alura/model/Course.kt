package com.melqui.Forum.Alura.model

import java.time.LocalDateTime

data class Course (
    val id: Long? = null,
    val name: String,
    val category: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
)
