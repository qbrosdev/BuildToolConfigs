package com.qbros.gradlejavamapstructlombok

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class AccountDto(val id: Long, val floatVal: Float, val name: String)
