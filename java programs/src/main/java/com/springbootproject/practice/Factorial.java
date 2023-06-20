package com.tandemloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input number : ");
		int number= sc.nextInt();
		int fact =1;
		for(int i=1;i<=number;i++) {
			for(int j=i;j<=i;j++) {
				fact= fact*j;
			}
			System.out.print(fact+" ");
		}
		
		//System.out.println("Factorial of number "+ number + " is : "+ fact);
	}

}
