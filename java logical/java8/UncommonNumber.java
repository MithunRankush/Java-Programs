package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UncommonNumber {

	public static void main(String[] args) {
		List<Integer> num =  Arrays.asList(10,20,30,5,10,30,20);
		Set<Integer> set = new HashSet<>();
		Set<Integer> repeated = new HashSet<>();
				num.stream().filter(n->!set.add(n)).forEach(repeated::add);
		Set<Integer> uncommon = set.stream().filter(i->!repeated.contains(i)).collect(Collectors.toSet());
				uncommon.stream().forEach(System.out::println);

	}

}
