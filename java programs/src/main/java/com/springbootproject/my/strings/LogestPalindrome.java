package com.my.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogestPalindrome {

	public static void main(String[] args) {
		String str = "A madam teaches malayalam language";
		String logestPalindrome = findlongestPalindrome(str);
		System.out.println("Logest palindrome is :"+ logestPalindrome + " and length is  : "+ logestPalindrome.length());

	}

	private static String findlongestPalindrome(String str) {
		List<String> words = new ArrayList<>();
		Collections.addAll(words,str.split(" "));
		String logestPalindrome="";
		for(String word:words) {
			if(isPalindrome(word) && word.length()>logestPalindrome.length()) {
				logestPalindrome=word;
			}
		}
		return logestPalindrome;
	}

	private static boolean isPalindrome(String word) {
		StringBuilder reverse = new StringBuilder(word).reverse();	
		return word.equalsIgnoreCase(reverse.toString());
	}

}
