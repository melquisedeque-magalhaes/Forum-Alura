package com.melqui.Forum.Alura.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}