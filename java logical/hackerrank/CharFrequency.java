package com.hackerrank;

import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		String s1 = sc.nextLine();

		char arr[] = s1.toLowerCase().toCharArray();
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
			if (arr[i] != '0') {
				System.out.println(arr[i] + "-" + count);
			}
		}

	}

}
