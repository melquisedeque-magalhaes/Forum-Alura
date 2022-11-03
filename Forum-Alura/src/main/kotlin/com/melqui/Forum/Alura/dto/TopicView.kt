package com.melqui.Forum.Alura.dto

import com.melqui.Forum.Alura.model.StatusTopic
import java.time.LocalDateTime

data class TopicView (
    val id: Long?,
    val title: String,
    val message: String,
    val status: StatusTopic,
    val createdAt: LocalDateTime,
)