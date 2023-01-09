package com.example.demo;

import com.example.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class SpringIn5StepScopeApp {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepScopeApp.class);

	public static void main(String[] args) {
//		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepScopeApp.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepScopeApp.class);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}

}