package com.logxical;

import java.util.Scanner;

public class NearestOwel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character to a z : ");
		char x = sc.next().toLowerCase().charAt(0);
		if(x>='a' && x<'c') {
			System.out.println("Nearest owel is : "+'a');
		}else if(x>='c' && x<'g') {
			System.out.println("Nearest owel is : "+'e');
		}else if(x>='g' && x<'l') {
			System.out.println("Nearest owel is : "+'i');
		}else if(x>='l' && x<'r') {
			System.out.println("Nearest owel is : "+'o');
		}else if(x>='r' && x<'z') {
			System.out.println("Nearest owel is : "+'u');
		}else {
			System.out.println("Enter the valid character");
		}
	}

}
