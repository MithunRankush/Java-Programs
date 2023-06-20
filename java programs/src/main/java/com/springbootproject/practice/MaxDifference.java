package com.tandemloop;

public class MaxDifference {

	public static void main(String[] args) {
		int[] arr = { 8, 3, 7, 9, 5 };
		int maxDiff = maxDifference(arr);
		System.out.println(" max difference is : " + maxDiff);
	}

	private static int maxDifference(int[] arr) {
		int min = arr[0];
		int maxDiff = arr[1] - arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - min > maxDiff) {
				maxDiff = arr[i] - min;
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return maxDiff;
	}

}
