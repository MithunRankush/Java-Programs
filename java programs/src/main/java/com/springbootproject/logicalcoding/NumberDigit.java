package com.logicalcoding;

import java.util.Scanner;

public class NumberDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = findSumOfDigits(num);
       System.out.println("sum of digits in "+num+" is : "+sum);
	}

	private static int findSumOfDigits(int num) {
		int sum=0;
	       while(num!=0) {
	    	   int rem = num%10;
	    	   sum = sum+rem;
	    	   num/=10;    	  
	       }
		return sum;
	}

}
