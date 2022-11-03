package com.melqui.Forum.Alura.mapper

import com.melqui.Forum.Alura.dto.TopicView
import com.melqui.Forum.Alura.model.Topic
import org.springframework.stereotype.Component

@Component
class TopicViewMapper: Mapper<Topic, TopicView> {
    override fun map(topic: Topic): TopicView {
        return TopicView(
            id = topic.id,
            title = topic.title,
            message = topic.message,
            status = topic.status,
            createdAt = topic.createdAt
        )
    }
}