package com.melqui.Forum.Alura.service

import com.melqui.Forum.Alura.model.User
import org.springframework.stereotype.Service

@Service
class UserService(private var users: List<User>) {
    init {
        var user = User(
            id = 1,
            name = "Melqui",
            email = "melqui.sodre@example.com"
        )

        users = users.plus(user)
    }

    fun searchById(id: Long): User {
        val findUser = users.stream().filter{
            user -> user.id == id
        }.findFirst().get()

        return findUser
    }
}