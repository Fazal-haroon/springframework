package com.example.demo;

import com.example.demo.impl.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int i = binarySearch.binarySearch(new int[]{12, 42, 11, 1}, 3);
//		System.out.println("i = " + i);

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl bean = applicationContext.getBean(BinarySearchImpl.class);
		int i = bean.binarySearch(new int[]{12, 42, 11, 1}, 3);
		System.out.println("i = " + i);
		//Application Context will maintain all the beans

	}

}
