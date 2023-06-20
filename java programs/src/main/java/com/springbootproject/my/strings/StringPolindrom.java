package com.my.strings;

import java.util.Scanner;

public class StringPolindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : ");
		String str = sc.nextLine();
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
        if(str.equalsIgnoreCase(rev)) {
        	System.out.println(" is palindrome");
        }else {
        	System.out.println("Not palindrome");
        }
	}

}
