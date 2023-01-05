package com.example.demo;

import com.example.demo.impl.BinarySearchImpl;
import com.example.demo.impl.BubbleSortAlgorithm;
import com.example.demo.impl.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int i = binarySearch.binarySearch(new int[]{12, 42, 11, 1}, 3);
		System.out.println("i = " + i);

//		SpringApplication.run(DemoApplication.class, args);
	}

}
