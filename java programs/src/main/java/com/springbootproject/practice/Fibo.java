package com.tandemloop;

public class Fibo {

	public static void main(String[] args) {
		int Number=6;
		int firstNum =0 , secondNum =1;
		System.out.println("Fibonacci number series ");
		for(int i=1;i<=Number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(firstNum+" ");
				int nextNum= firstNum+secondNum;
				firstNum=secondNum;
				secondNum=nextNum;
			}
			System.out.println();
		}

	}

}
