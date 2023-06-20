package com.tandemloop;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSorting {

	public static void main(String[] args) {
		Integer[] arr = { 8, 4, 1, 6, 9, 3, 7 };
		Arrays.sort(arr);
		System.out.println("Ascending order : " + Arrays.toString(arr));
		
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println("Descending order: " + Arrays.toString(arr));
		int secondMax = arr[1];
		System.out.println("second max element is "+ secondMax);
		int max = arr[0];
		System.out.println("Max element is "+ max);
		
	}
}
