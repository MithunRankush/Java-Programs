package com.patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int rows=5;
		int spaces=0;
		int stars= 2*rows-1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("* ");
			}
			System.out.println();
			spaces++;
			stars-=2;
		}
	}
}
