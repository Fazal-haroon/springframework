package com.example.demo;

import com.example.demo.cdi.SomeCDI;
import lombok.extern.java.Log;
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
public class SpringIn5StepCdiApp {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepCdiApp.class);

	public static void main(String[] args) {
//		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepCdiApp.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepCdiApp.class);
		SomeCDI someCDI = applicationContext.getBean(SomeCDI.class);
		System.out.println("someCDI = " + someCDI);
		logger.info("*** {} dao - {} ", someCDI.hashCode(), someCDI.getSomeCdiDao().hashCode());
	}

}
