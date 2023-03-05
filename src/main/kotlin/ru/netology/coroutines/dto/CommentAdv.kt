package ru.netology.coroutines.dto

data class CommentAdv(

val id: Long,
val author: Author,
val content: String,
val published: Long,
val likedByMe: Boolean,
val likes: Int = 0,

)
