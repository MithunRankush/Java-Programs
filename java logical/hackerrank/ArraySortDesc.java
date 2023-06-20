package com.hackerrank;

import java.util.Scanner;

public class ArraySortDesc {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your data");

		int a = sc.nextInt();
		int[] num = new int[a];
		for (int i = 0; i < a; i++) {
			num[i] = sc.nextInt();
		}
		// Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
