package com.qbros.gradlejavamapstructlombok

import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AccountMapper {

    fun toDto(source: AccountModel): AccountDto
    fun toModel(source: AccountDto): AccountModel
}