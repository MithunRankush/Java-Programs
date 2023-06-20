package com.my.strings;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String input = sc.nextLine();
		String output = "";
			
		for(int i=0;i<input.length();i++) {
			int count=0;
			char c = input.charAt(i);
			for(int j=0;j<input.length();j++) {
				char x= input.charAt(j);
				if(c==x) {
					count++;
				}
			}
			if(count==1 && c!=' ') {
				output+=c;
			}
		}
		System.out.println("unique characters are : "+ output);

	}

}
