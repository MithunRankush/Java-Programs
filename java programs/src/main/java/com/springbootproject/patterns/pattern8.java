package com.patterns;

public class pattern8 {

	public static void main(String[] args) {
//		int rows=5;
//		int spaces=rows-1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
//			spaces--;
		}

	}

}
