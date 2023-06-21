package com.busibud;

import java.util.HashMap;

public class StringChallenge {
	    public static int StringChallenge(String str) {
	        HashMap<Character, Integer> charCount = new HashMap<>();
	        int maxUniqueChars = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (charCount.containsKey(c)) {
	                int uniqueChars = i - charCount.get(c) - 1;
	                maxUniqueChars = Math.max(maxUniqueChars, uniqueChars);
	            }
	            charCount.put(c, i);
	        }

	        return maxUniqueChars;
	    }

	    public static void main(String[] args) {
	        String input1 = "ahyjakh";
	        String input2 = "ghececgkaem";
	        String input3 = "mmmerme";
	        String input4 = "abccdefghi";

	        System.out.println(StringChallenge(input1)); 
	        System.out.println(StringChallenge(input2)); 
	        System.out.println(StringChallenge(input3)); 
	        System.out.println(StringChallenge(input4)); 
	    }


}
