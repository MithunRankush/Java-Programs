package com.patterns;

import java.util.Scanner;

public class Alphabatepattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				System.out.print(str.charAt(i)+""+str.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
