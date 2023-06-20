package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,33);
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("*******************************");
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
