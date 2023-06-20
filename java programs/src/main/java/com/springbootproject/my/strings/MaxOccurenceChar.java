package com.my.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurenceChar {

	public static void main(String[] args) {
		String str = "Java is Awesome";
      System.out.println("Max occuring character is : "+ getChar(str));

	}

	private static char getChar(String str) {
		Map<Character,Integer> map = new HashMap<>();
		char x = 0;
		int count =0;
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			if(count<map.get(c)) {
				x=c;
				count=map.get(c);
			}
			
		}
		return x;
	}

}
