package com.iosys;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number_Occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		int number = sc.nextInt();
		String num = String.valueOf(number);
		char[] c = num.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(Character x:c) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			char n = entry.getKey();
			int count = entry.getValue();
			System.out.println("Number "+n+" occurs "+count+" times");
		}

	}

}
