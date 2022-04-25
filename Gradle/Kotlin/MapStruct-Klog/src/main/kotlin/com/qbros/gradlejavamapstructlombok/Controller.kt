package com.qbros.gradlejavamapstructlombok

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

const val AccountControllerURI = "/accounts"

@RestController
@RequestMapping(AccountControllerURI)
class Controller(private val accountMapper: AccountMapper) {

    @GetMapping
    fun getAccount(): AccountDto {
        val accountModel = AccountModel(123, 12.5f, "abc");
        return accountMapper.toDto(accountModel)
    }
}