package com.logxical;

import java.util.Scanner;

public class CharacterCounts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the characters : ");
		String s = sc.nextLine().toLowerCase();
		int c1=0,c2=0,c3=0;
		for(int i=0;i<s.length();i++) {
			char x= s.charAt(i);
			if(x>='a' && x<='z') {
				c1++;
			}else if(x>='0' && x<='9') {
				c2++;
			}else {
				c3++;
			}	
		}
		System.out.println("Number of alphabates are : " + c1);
		System.out.println("Number of numerics are :"+ c2);
		System.out.println("Number of special charcater are : "+c3);

	}

}
