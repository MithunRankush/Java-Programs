package com.java8;

import java.util.Arrays;
import java.util.List;

public class MaxValue {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,33);
		int max = list.stream()
				.max(Integer::compare).get();
		System.out.println(max);

	}

}
