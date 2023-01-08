package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan
// app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepPropertiesApp {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepPropertiesApp.class)) {
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			System.out.println("someExternalService = " + someExternalService);
			System.out.println("someExternalService.returnServiceURL() = " + someExternalService.returnServiceURL());
		}

	}

}
