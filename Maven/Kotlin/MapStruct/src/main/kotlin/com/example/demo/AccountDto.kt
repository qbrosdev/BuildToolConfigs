package com.example.demo

import com.fasterxml.jackson.annotation.JsonInclude
import javax.validation.constraints.PositiveOrZero

@JsonInclude(JsonInclude.Include.NON_NULL)
data class AccountDto(
    val id: Long = 0,
    @field:PositiveOrZero val balance: Float
) {
}
