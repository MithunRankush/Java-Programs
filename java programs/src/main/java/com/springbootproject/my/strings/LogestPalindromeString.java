package com.my.strings;

public class LogestPalindromeString {

	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		int logestPalindrome = findlogestPalindrome(str);
		System.out.println("length is : " +logestPalindrome );

	}

	private static int findlogestPalindrome(String str) {
		String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 System.out.println(s);
		if (s == null || s.length() < 2) {
			return str.length();
		}
		 
		int high, low;
		int start = 0;
		int maxLength = 1;
		for (int i = 1; i < s.length(); i++) {

			low = i - 1;
			high = i + 1;
			
			while (high < s.length() && s.charAt(high) == s.charAt(i)) {
				high++;
			}
			while (low >= 0 && s.charAt(low) == s.charAt(i)) {
				low--;
			}
			while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
			}
			
			System.out.println(high + " : "+ low);
			int length = high-low-1;
			System.out.println(length);
			if(maxLength<length) {
				maxLength=length;
				start = low+1;
			}
		}
		System.out.println(start +":"+ maxLength );
		System.out.print("Longest palindrome substring is: ");
	    System.out.println(str.substring(start, start + maxLength ));
		return maxLength;
	}

}
