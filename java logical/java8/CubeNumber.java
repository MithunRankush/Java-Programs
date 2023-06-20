package com.java8;

import java.util.Arrays;
import java.util.List;

public class CubeNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,3,5,4,2,1,3);
		list.stream().map(n->n*n*n).filter(n->n>50).forEach(System.out::println);

	}

}
