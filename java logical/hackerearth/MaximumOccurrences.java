package com.gplaunchpad;

import java.util.Scanner;

public class MaximumOccurrences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter input");
		int testCases = scanner.nextInt();
		System.out.println("enter number of array");
		int n = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {
			System.out.println("enter size of array");
			int m = scanner.nextInt();
			int[] a = new int[m];
			int[] b = new int[m];

			System.out.println("enter elements for a :   ");
			for (int j = 0; j < m; j++) {
				a[j] = scanner.nextInt();
			}

			System.out.println("enter elemtes for b :  ");
			for (int j = 0; j < m; j++) {
				b[j] = scanner.nextInt();
			}

			int result = findMaxOccurrences(a, b);
			System.out.println(result);
		}

		scanner.close();
	}

	private static int findMaxOccurrences(int[] a, int[] b) {
		int maxOccurrences = 0;
		int maxCount = 0;

		for (int num : a) {
			int count = 0;

			for (int value : b) {
				if (value == num) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				maxOccurrences = 1;
			} else if (count == maxCount) {
				maxOccurrences++;
			}
		}

		return maxOccurrences;
	}
}
