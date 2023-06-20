package com.javaapplication;

import java.util.Scanner;

public class BirlaSoftCompanyApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Plan details
		String planACode = "P10Mbps";
		int planARental = 4500;
		int planADataLimit = 6000;
		int planAExtraDataCharge = 50;
		int planADiscountDataMin = 100;
		int planADiscountDataMax = 500;
		int planADiscountAmount = 1999;

		String planBCode = "P20Mbps";
		int planBRental = 7500;
		int planBDataLimit = 5000;
		int planBExtraDataCharge = 299;
		int planBDiscountDataMin = 50;
		int planBDiscountDataMax = 100;
		int planBDiscountAmount = 399;

		String planCCode = "P30Mbps";
		int planCRental = 12000;
		int planCDataLimit = 4000;
		int planCExtraDataCharge = 399;
		int planCDiscountDataMin = 50;
		int planCDiscountDataMax = 100;
		int planCDiscountAmount = 555;

		System.out.print("Enter total broadband data used (in MB): ");
		int dataUsed = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		System.out.print("Enter customer plan code (Plan A, Plan B, or Plan C): ");
		String planCode = scanner.nextLine();

		int rental = 0;
		int dataLimit = 0;
		int extraDataCharge = 0;
		int discountAmount = 0;

		if (planCode.equalsIgnoreCase(planACode)) {
			rental = planARental;
			dataLimit = planADataLimit;
			extraDataCharge = planAExtraDataCharge;
			discountAmount = planADiscountAmount;
		} else if (planCode.equalsIgnoreCase(planBCode)) {
			rental = planBRental;
			dataLimit = planBDataLimit;
			extraDataCharge = planBExtraDataCharge;
			discountAmount = planBDiscountAmount;
		} else if (planCode.equalsIgnoreCase(planCCode)) {
			rental = planCRental;
			dataLimit = planCDataLimit;
			extraDataCharge = planCExtraDataCharge;
			discountAmount = planCDiscountAmount;
		} else {
			System.out.println("Invalid plan code. Please enter a valid plan code.");
			return;
		}

		System.out.println("Plan Information:");
		System.out.println("Plan Code: " + planCode);
		System.out.println("Monthly Rental: " + rental);
		System.out.println("Total Data Limit: " + dataLimit);

		int billAmount = 0;
		if (dataUsed > dataLimit) {
			int extraData = dataUsed - dataLimit;
			billAmount += extraData * extraDataCharge;
		}

		if (dataUsed >= planADiscountDataMin && dataUsed <= planADiscountDataMax
				&& planCode.equalsIgnoreCase(planACode)) {
			billAmount -= discountAmount;
		} else if (dataUsed >= planBDiscountDataMin && dataUsed <= planBDiscountDataMax
				&& planCode.equalsIgnoreCase(planBCode)) {
			billAmount -= discountAmount;
		} else if (dataUsed >= planCDiscountDataMin && dataUsed <= planCDiscountDataMax
				&& planCode.equalsIgnoreCase(planCCode)) {
			billAmount -= discountAmount;
		}

		System.out.println("Total Network Data Used: " + dataUsed + " MB");
		System.out.println("Bill Amount: " + billAmount + " Rs");

		scanner.close();
	}
}
