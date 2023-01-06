package com.example.demo;

import com.example.componentscan.ComponentDAO;
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
//@ComponentScan("com.example.demo") //by default what we are looking for
@ComponentScan("com.example.componentscan")
public class SpringIn5StepComponentScanApp {

	private static Logger LOG = LoggerFactory.getLogger(SpringIn5StepComponentScanApp.class);

	public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepComponentScanApp.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepComponentScanApp.class);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOG.info("{}", componentDAO);

	}

}
