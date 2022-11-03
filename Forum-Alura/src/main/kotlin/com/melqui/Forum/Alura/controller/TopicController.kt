package com.melqui.Forum.Alura.controller

import com.melqui.Forum.Alura.dto.TopicDTO
import com.melqui.Forum.Alura.dto.TopicView
import com.melqui.Forum.Alura.model.Topic
import com.melqui.Forum.Alura.service.TopicService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/topics")
class TopicController(private val service: TopicService) {

    @GetMapping
    fun list(): List<TopicView> {
        return service.list()
    }

    @GetMapping("/{id}")
    fun searchId(@PathVariable id: Long): TopicView? {
        val topicSearch: TopicView? = service.searchToId(id)

        if(topicSearch !== null)
            return topicSearch

        return null
    }

    @PostMapping
    fun create(@RequestBody @Valid topicDTO: TopicDTO): Topic {
        return service.create(topicDTO)
    }

    @PutMapping
    fun update() {

    }

    @DeleteMapping
    fun delete() {

    }
}