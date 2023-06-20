package com.patterns;

public class Pattern2 {
	public static void main(String[] args) {
		for(int i=5;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int rows=1;rows<=5;rows++) {
			for(int col=1;col<=5-rows+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
