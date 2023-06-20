package com.java8;

import java.util.Arrays;
import java.util.List;

public class CountNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,33);
		list.stream().count();
		System.out.println(list);
	}

}
