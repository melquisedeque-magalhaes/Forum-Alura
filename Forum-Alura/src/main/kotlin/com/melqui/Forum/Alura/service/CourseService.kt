package com.melqui.Forum.Alura.service

import com.melqui.Forum.Alura.model.Course
import org.springframework.stereotype.Service

@Service
class CourseService(private var courses: List<Course>) {

    init {
        var course = Course(
            id = 1,
            name = "Kotlin",
            category = "Programação",
        )

        courses = courses.plus(course)
    }


    fun searchById(id: Long): Course {
        return courses.stream().filter { course -> course.id == id }.findFirst().get()
    }


}