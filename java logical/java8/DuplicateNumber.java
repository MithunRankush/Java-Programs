package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,33,10,15,25,98,49);
		     Set<Integer> set = new HashSet<>();
		     list.stream()
                 .filter(n->!set.add(n)).forEach(System.out::println);
	}

}
