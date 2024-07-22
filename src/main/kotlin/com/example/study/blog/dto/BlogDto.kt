package com.example.study.blog.dto

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class BlogDto(
    @field:NotBlank(message = "query parameter required")
    val query: String?,

    @field:NotBlank(message = "sort parameter required")
    val sort: String?,

    @field:NotNull
    @field:Max(50, message = "page is more than max")
    @field:Min(1, message = "page is less than min")
    val page: Int?,

    @field:NotNull(message = "size parameter required")
    val size: Int?,
) {
    private enum class EnumSort {
        ACCURACY,
        RECENCY
    }
}