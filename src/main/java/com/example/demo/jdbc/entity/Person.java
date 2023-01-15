package com.example.demo.jdbc.entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private Integer id;
    private String personName;
    private String location;
    private Date birthDate;
}
