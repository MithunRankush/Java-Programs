package com.logxical;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = sc.nextLine();
		String rev = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+ name.charAt(i);
		}
        if(name.equalsIgnoreCase(rev)) {
        	System.out.println("is palindrome");
        }else {
        	System.out.println("not palindrome");
        }
	}

}
