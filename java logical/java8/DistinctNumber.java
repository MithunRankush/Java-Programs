package com.java8;

import java.util.Arrays;
import java.util.List;

public class DistinctNumber {

	public static void main(String[] args) {
		List<Integer> num =  Arrays.asList(10,20,30,5,10,30,20);
					num.stream().distinct().forEach(System.out::println);

	}

}
