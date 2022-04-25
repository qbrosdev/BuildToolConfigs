package com.qbros.gradlejavamapstructlombok;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.qbros.gradlejavamapstructlombok.Controller.AccountControllerURI;


@RestController
@RequiredArgsConstructor
@RequestMapping(AccountControllerURI)
public class Controller {

    static final String AccountControllerURI = "/accounts";
    private final AccountMapper accountMapper;

    @GetMapping
    public AccountDto getAccount() {

        AccountModel accountModel = new AccountModel(123, 12.3f, "dfdf");
        return accountMapper.toDto(accountModel);
    }
}
