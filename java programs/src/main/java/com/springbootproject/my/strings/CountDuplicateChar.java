package com.my.strings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChar {

	public static void main(String[] args) {
		String str = "Character duplicate words example java";
		String formate = str.replaceAll("\\s+", "").toLowerCase();
		char arr[] = formate.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (Character ch : arr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println("duplicates caharcters are : ");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}

}
