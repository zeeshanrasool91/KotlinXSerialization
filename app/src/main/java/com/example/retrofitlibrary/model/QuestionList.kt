package com.example.retrofitlibrary.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class QuestionList(
    @SerialName("items")
    val items: List<Question>,
    val has_more: Boolean? = null,
    val quota_max: Long? = null,
    val quota_remaining: Long? = null
)


/*
@Serializable
class QuestionList {
    @SerialName("items")
    val items: MutableList<Question>?=null


    val has_more: Boolean? = null

    val quota_max: Long? = null

    val quota_remaining: Long? = null
}*/
