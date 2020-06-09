package com.example.retrofitlibrary.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//This class maps the json keys to the object
@Serializable
data class Question(
    @SerialName("title")
    val title: String? = null,
    @SerialName("link")
    val link: String? = null
)
