package com.logxical;

import java.util.Scanner;

public class UpperToLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String s= "";
		for(int i=0;i<str.length();i++) {
			char x= str.charAt(i);
			if(x>='A' && x<'Z') {
				s= s+ (char)(x+32);
			}else if(x>='a' && x<'z') {
				s= s+ (char)(x-32);
			}else {
				s+=x;
			}
		}
        System.out.println(s);
	}

}
