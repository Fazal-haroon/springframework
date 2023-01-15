package com.example.demo;

import com.example.demo.jpa.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJPAApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(DemoJPAApplication.class);

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoJPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 1 -> {}", personRepository.findById(1));
	}
}
