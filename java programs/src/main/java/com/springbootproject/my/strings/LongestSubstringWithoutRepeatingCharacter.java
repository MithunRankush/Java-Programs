package com.my.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		String str = "aaccggkmrtub";
		int length = longestNonRepeatedSubstring(str);
		System.out.println("Longest without repeated substring lenght is : "+ length);
	}

	private static int longestNonRepeatedSubstring(String str) {
		Map<Character,Integer> map = new HashMap<>();
		int maxLength =0;
		int start=0;
		for(int end=0;end<str.length();end++) {
			char c= str.charAt(end);
			if(map.containsKey(c)) {
				start =Math.max(start, map.get(c)+1);
			}
			map.put(c, end);
			maxLength=Math.max(maxLength, end-start+1);
		}
		return maxLength;
	}

}
