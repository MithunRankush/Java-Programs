package com.javaapplication;

import java.util.Scanner;

public class MobileApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Available Plans:");
		System.out.println("1. Plan A");
		System.out.println("2. Plan B");
		System.out.println("3. Plan C");

		System.out.print("Enter the plans : ");
		int plans = sc.nextInt();

		System.out.print("Enter the total number of calls made: ");
		int totalCalls = sc.nextInt();

		double totalBill = calculateBill(plans, totalCalls);
		System.out.println("Total Bill is : " + totalBill);

	}

	private static double calculateBill(int plans, int totalCalls) {
		double monthlyRental=0;
		double callCharges=0;

		switch (plans) {
		case 1:
			monthlyRental = 100;
			if (totalCalls <= 100) {
				callCharges = 0;
			} else if (totalCalls <= 200) {
				callCharges = (totalCalls - 100) * 0.75;
			} else if (totalCalls <= 300) {
				callCharges = (totalCalls - 200) * 1.0 + 100 * 0.75;
			} else {
				callCharges = (totalCalls - 300) * 1.25 + 100 * 0.75 + 100 * 1.0;
			}
			break;
		case 2:
			monthlyRental = 150;
			if (totalCalls <= 100) {
				callCharges = 0;
			} else if (totalCalls <= 200) {
				callCharges = (totalCalls - 100) * 0.50;
			} else if (totalCalls <= 300) {
				callCharges = (totalCalls - 200) * 0.75 + 100 * 0.50;
			} else {
				callCharges = (totalCalls - 300) * 1.00 + 100 * 0.50 + 100 * 0.75;
			}
			break;
		case 3:
			monthlyRental = 200;
			if (totalCalls <= 100) {
				callCharges = 0;
			} else if (totalCalls <= 200) {
				callCharges = (totalCalls - 100) * 0.25;
			} else if (totalCalls <= 300) {
				callCharges = (totalCalls - 200) * 0.50 + 100 * 0.25;
			} else {
				callCharges = (totalCalls - 300) * 0.75 + 100 * 0.25 + 100 * 0.50;
			}
			break;
		default:
			System.out.println(" Invalid plan choices. ");
		}
		double totalBill = monthlyRental + callCharges;
		return totalBill;
	}

}
