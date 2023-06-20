package com.tandemloop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		String s1 = sc.nextLine();

		char arr[] = s1.toLowerCase().toCharArray();
		char maxChar =0;
		int maxCount=0;
		Map<Character,Integer> map = new HashMap<>();
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
			if(arr[i]!='0') {
				char c = arr[i];
				map.put(c, count);
				if(maxCount<map.get(c)) {
					maxChar=c;
					maxCount=map.get(c);
				}
			}
		}
		
		System.out.println("Max reapeated char is : " + maxChar);
	}

}
