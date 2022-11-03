package com.melqui.Forum.Alura.mapper

import com.melqui.Forum.Alura.dto.TopicDTO
import com.melqui.Forum.Alura.model.Topic
import com.melqui.Forum.Alura.service.CourseService
import com.melqui.Forum.Alura.service.UserService
import org.springframework.stereotype.Component

@Component
class TopicFormMapper(
    private val courseService: CourseService,
    private val authorService: UserService
    ): Mapper<TopicDTO, Topic> {
    override fun map(topicDto: TopicDTO): Topic {
        return Topic(
            title = topicDto.title,
            message = topicDto.message,
            course = courseService.searchById(topicDto.courseId),
            author = authorService.searchById(topicDto.authorId),
        )
    }
}