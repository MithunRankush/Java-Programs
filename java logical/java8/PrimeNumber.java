package com.java8;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		int limit = 25;
		System.out.println("Prime number series are : ");
		IntStream.range(2, limit).filter(PrimeNumber::isPrime).forEach(System.out::println);

	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		return IntStream.range(2, num).noneMatch(i->num%i==0);
	}
     
}
