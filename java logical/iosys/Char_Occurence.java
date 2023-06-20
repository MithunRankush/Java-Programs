package com.iosys;

import java.util.Scanner;

public class Char_Occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string value : ");
		String str = sc.nextLine();
		 int[] count = new int[128];
		 char[] c = str.toCharArray();
		 for(Character x:c) {
			 if(Character.isLetter(x)) {
				 x=Character.toLowerCase(x);
				 count[x]++;
			 }
		 }
		 for(int i=0;i<count.length;i++) {
			 if(count[i]>0) {
				 System.out.println((char)i+":"+count[i]);
			 }
		 }
	}

}
