package com.my.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LogestNonRepeatedSubstring {

	public static void main(String[] args) {
		String str = "java";
		lengthofLogestSubString(str);
	}

	private static void lengthofLogestSubString(String str) {
		String logestSubstring = "";
		int longestSubstrinlegth=0;
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		char [] arr = str.toLowerCase().toCharArray();
		for(int i=0;i<arr.length;i++) {
			char c = arr[i];
			if(!map.containsKey(c)) {
				map.put(c, i);
			}else {
				i=map.get(c);
				map.clear();
			}
			if(map.size()>longestSubstrinlegth) {
				longestSubstrinlegth=map.size();
				logestSubstring=map.keySet().toString();
			}
		}
		System.out.println("Longest non repeated sbstring is : "+ logestSubstring);
		System.out.println("Longest non repeated sbstring length is  : "+ longestSubstrinlegth);
		
	}

}

