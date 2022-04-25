package com.qbros.gradlejavamapstructlombok;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountModel {

    private long id;
    private float floatVal;
    private String name;
}
