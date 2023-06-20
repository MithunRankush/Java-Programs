package com.my.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedCharacter {

	public static void main(String[] args) {
		String str = "hello world";
		char maxRepeated = getMaxRepeated(str);
		System.out.println("Max repeated character is : " + maxRepeated);
	}

	private static char getMaxRepeated(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (Character c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		char maxRepeated = 0;
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxRepeated = entry.getKey();
			}
		}

		return maxRepeated;
	}

}
