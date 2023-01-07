package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.xml.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepXMLContextApp {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepXMLContextApp.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
			XmlPersonDao bean = applicationContext.getBean(XmlPersonDao.class);
			System.out.println("bean = " + bean);
			System.out.println("bean.getXmlJdbcConn = " + bean.getXmlJdbcConnection());
			logger.info("{}  --  {}", bean, bean.getXmlJdbcConnection());
		}
	}

}
