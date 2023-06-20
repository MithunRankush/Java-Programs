package com.tandemloop;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		if(isPalindrome(number)) {
			System.out.println(number+" : is palindrome");
		}else {
			System.out.println(number + " : is not palindrome");
		}

	}

	private static boolean isPalindrome(int number) {
		int originalNumber =  number;
		int reverseNumber = 0;
		while(number>0) {
			int rem = number%10;
			reverseNumber=reverseNumber*10+rem;
			number=number/10;
		}
		return originalNumber==reverseNumber;
	}

}
