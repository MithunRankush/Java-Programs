package com.iosys;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter i value : ");
		int i= sc.nextInt();
		System.out.print("enter j value : ");
		int j=sc.nextInt();
		i=i + j;
		j=i-j;
		i=i-j;
		System.out.println("i="+i);
		System.out.println("j="+j);
		}

}
