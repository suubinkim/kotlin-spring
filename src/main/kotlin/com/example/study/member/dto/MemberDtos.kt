package com.example.study.member.dto

import com.example.study.common.status.Gender
import java.time.LocalDate

data class MemberDtoRequest(
        val id: Long?,
        val loginId: String,
        val password: String,
        val name: String,
        val birthDate: LocalDate,
        val gender: Gender,
        val email: String
)
