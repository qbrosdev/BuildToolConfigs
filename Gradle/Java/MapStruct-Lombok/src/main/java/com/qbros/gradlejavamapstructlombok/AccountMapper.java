package com.qbros.gradlejavamapstructlombok;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDto toDto(AccountModel accountModel);
}
