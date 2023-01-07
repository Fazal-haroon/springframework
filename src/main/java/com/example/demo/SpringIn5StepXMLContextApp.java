package com.example.demo;

import com.example.demo.xml.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIn5StepXMLContextApp {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepXMLContextApp.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
			logger.info("Beans First Loaded -> {}", applicationContext.getBeanDefinitionNames());
			logger.info("Beans List Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			XmlPersonDao bean = applicationContext.getBean(XmlPersonDao.class);
			System.out.println("bean = " + bean);
			System.out.println("bean.getXmlJdbcConn = " + bean.getXmlJdbcConnection());
			logger.info("Beans of XmlPersonDao -> {}  Beans of autowired JDBC ->  {}", bean, bean.getXmlJdbcConnection());
		}
	}

}
