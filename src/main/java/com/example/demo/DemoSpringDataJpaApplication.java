package com.example.demo;

import com.example.demo.jpa.entity.Person;
import com.example.demo.springdatajpa.repository.PersonRepositorySpringDataJpa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoSpringDataJpaApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(DemoSpringDataJpaApplication.class);

	@Autowired
	PersonRepositorySpringDataJpa personRepositorySpringDataJpa;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Person Data : {}", personRepositorySpringDataJpa.findAll());
		logger.info("User id 1 -> {}", personRepositorySpringDataJpa.findById(1));
		logger.info("Inserting 5th person : {}", personRepositorySpringDataJpa.save(new Person(5, "Abdul Hanan", "Malakand", new Date())));
		//INSERT INTO PERSON (ID, PERSON_NAME, LOCATION, BIRTH_DATE ) VALUES(2, 'Haroon', 'Islamabad', NOW());
		logger.info("Updating 2th person : {}", personRepositorySpringDataJpa.save(new Person(2, "Fazal Haroon", "Batkhela Malakand", new Date())));
		personRepositorySpringDataJpa.deleteById(3);
	}
}
