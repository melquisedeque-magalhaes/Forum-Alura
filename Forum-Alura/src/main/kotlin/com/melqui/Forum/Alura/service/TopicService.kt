package com.melqui.Forum.Alura.service

import com.melqui.Forum.Alura.dto.TopicDTO
import com.melqui.Forum.Alura.dto.TopicView
import com.melqui.Forum.Alura.mapper.TopicFormMapper
import com.melqui.Forum.Alura.mapper.TopicViewMapper
import com.melqui.Forum.Alura.model.Topic
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicService (
    private var topics: List<Topic>,

    private val topicViewMapper: TopicViewMapper,
    private val topicFormMapper: TopicFormMapper
    ) {

    fun list(): List<TopicView> {
        return topics.stream().map{topic -> topicViewMapper.map(topic)}.collect(Collectors.toList())
    }

    fun searchToId(id: Long): TopicView? {
        val topicFind:Topic =  topics.stream().filter{
            topic -> topic.id == id
        }.findFirst().get()

        return topicViewMapper.map(topicFind)
    }

    fun create(topicDto: TopicDTO): Topic {

        val newTopic:Topic = topicFormMapper.map(topicDto)

        newTopic.id = topics.size.toLong() + 1

        topics = topics.plus(newTopic)

        return newTopic
    }
}