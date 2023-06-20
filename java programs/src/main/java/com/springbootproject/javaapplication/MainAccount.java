package com.javaapplication;

import java.util.Scanner;

public class MainAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] a = new Account[4];
	
		boolean exit = false;
		while (!exit) {
			System.out.println("Select an option:");
			System.out.println("a. Add account details");
			System.out.println("b. Update account details");
			System.out.println("c. Display all accounts");
			System.out.println("d. Exit");

			String option = sc.nextLine();

			switch (option.toLowerCase()) {
			case "a":
				for (int i = 0; i < a.length; i++) {
					Scanner sc1 = new Scanner(System.in);
					a[i] = creatAccount(sc1);
					System.out.println("Account is added successfully.");
				}
				break;
			case "b":
				Scanner sc2 = new Scanner(System.in);
				updateAccount(sc2, a);
				break;
			case "c":
				displayAll(a);
				break;
			case "d":
				exit = true;
				System.out.println("Account is existed");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}
	}

	private static Account creatAccount(Scanner sc1) {
		System.out.println("Enter Account ID : ");
		String accontId = sc1.nextLine();
		
		if (!accontId.matches("A-\\d+")) {
            System.out.println("Invalid account ID format. Please enter a valid account number.");
        }
		
		System.out.println("Enter Account Holder Name : ");
		String name = sc1.nextLine();
		
		System.out.println("Enter Account Type (Saving or Current) : ");
		String type = sc1.nextLine();
		
		if (!type.equalsIgnoreCase("saving") && !type.equalsIgnoreCase("current")) {
            System.out.println("Invalid account type. Please enter either saving or current.");
        }
		
		System.out.println("Enter Account Balance : ");
		double balance = sc1.nextDouble();
		
		Account account = new Account(accontId, name, type, balance);
		return account;
	}

	private static void updateAccount(Scanner sc2, Account[] a) {
		System.out.println("Enter Account ID : ");
		String accontId = sc2.nextLine();
	
		boolean isAccountfound = false;
		for(Account account:a) {
			if(account!=null && account.getAccontId()==accontId) {
				System.out.println("Enter Account Type (Saving or Current) : ");
				String newAccountType = sc2.nextLine();
				account.setType(newAccountType);
				isAccountfound=true;
				System.out.println("Account details updated successfully.");
				break;
			}
		}
		if(!isAccountfound) {
			System.out.println("Account is not found!.");
		}

	}

	private static void displayAll(Account[] a) {
		System.out.println("All accounts are : ");
		for(Account account : a) {
			if(account!=null) {
				System.out.println(account);
			}else {
				System.out.println("Accounts are not found.");
			}
		}
	}

}
