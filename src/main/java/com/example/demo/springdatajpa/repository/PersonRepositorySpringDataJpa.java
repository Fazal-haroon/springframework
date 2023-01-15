package com.example.demo.springdatajpa.repository;

import com.example.demo.jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepositorySpringDataJpa extends JpaRepository<Person, Integer> {
}
