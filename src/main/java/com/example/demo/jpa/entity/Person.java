package com.example.demo.jpa.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "person")
public class Person {
    @Id
    private Integer id;
    @Column(name = "person_name")
    private String personName;
    @Column(name = "location")
    private String location;
    @Column(name = "birth_date")
    private Date birthDate;
}
