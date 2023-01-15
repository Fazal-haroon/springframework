package com.example.demo.jdbc.dao;

import com.example.demo.jdbc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //select * from person
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
    }

    //select * from person where id = ?
    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class));
    }

    public List<Person> findByLocation(String location){
        List<Person> personList = jdbcTemplate.query("select * from Person where location=?", new Object[]{location}, new BeanPropertyRowMapper<>(Person.class));
        return personList;
    }

    public List<Person> findByName(String name){
        List<Person> personList = jdbcTemplate.query("select * from Person where PERSON_NAME=?", new Object[]{name}, new BeanPropertyRowMapper<>(Person.class));
        return personList;
    }

    public int deleteById(int id){
        return jdbcTemplate.update("delete from person where id=?", new Object[]{id});
    }

    //INSERT INTO PERSON(ID, PERSON_NAME, LOCATION, BIRTH_DATE) VALUES(?, ?, ?, ?);
    public int insert(Person person){
        return jdbcTemplate.update("insert into person(id, person_name, location, birth_date) values(?, ?, ?, ?)",
                new Object[]{person.getId(), person.getPersonName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime())});
    }

    public int update(Person person){
        return jdbcTemplate.update("update person set person_name = ?, location = ?, birth_date = ? where id = ?",
                new Object[]{person.getPersonName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId()});
    }

}
