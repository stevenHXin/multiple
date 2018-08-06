package com.steven.springbootentity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class User implements Serializable {

    private Integer userID;
    private String username;
    private Integer age;
}
