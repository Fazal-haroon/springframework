package com.example.demo;

import com.example.demo.jdbc.dao.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJDBCApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(DemoJDBCApplication.class);

	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(DemoJDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Person Data : {}", personJdbcDao.findAll());
	}
}
