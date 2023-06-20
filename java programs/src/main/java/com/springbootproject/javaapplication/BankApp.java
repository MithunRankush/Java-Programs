package com.javaapplication;

import java.util.Scanner;

class Account {
	private String accontId;
	private String name;
	private String type;
	private double balance;
	
	public Account(String accontId, String name, String type, double balance) {
		super();
		this.accontId = accontId;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}

	public String getAccontId() {
		return accontId;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccontId(String accontId) {
		this.accontId = accontId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [accontId=" + accontId + ", name=" + name + ", type=" + type + ", balance=" + balance + "]";
	}

	public void displayAccountInformation() {
		System.out.println("ACCOUNT INFORMATION");
		System.out.println("Account ID :" + accontId);
		System.out.println("Account Holder Name : " + name);
		System.out.println("Account Type : "+ type);
		System.out.println("Account Balance : "+ balance);
	}
	
}

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account ID : ");
		String accontId = sc.nextLine();
		
//		boolean value = false;
		if (!accontId.matches("A-\\d+")) {
            System.out.println("Invalid account ID format. Please enter a valid account number.");
        }
		
		System.out.print("Enter Account Holder Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Account Type (Saving or Current) : ");
		String type = sc.nextLine();
		
		if (!type.equals("saving") && !type.equals("current")) {
            System.out.println("Invalid account type. Please enter either saving or current.");
        }
		
		System.out.print("Enter Account Balance : ");
		double balance = sc.nextDouble();
		
		Account account = new Account(accontId, name, type, balance);
		account.displayAccountInformation();
	}

}
