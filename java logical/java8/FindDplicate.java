package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDplicate {

	public static void main(String[] args) {
		List<Integer> num =  Arrays.asList(10,20,30,5,10,30,20);
		Set<Integer> duplicate = num.stream().filter(i->Collections.frequency(num, i)>1).collect(Collectors.toSet());
		System.out.println(duplicate);

	}

}
