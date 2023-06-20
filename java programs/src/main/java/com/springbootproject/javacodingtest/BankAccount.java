package com.javacodingtest;

import java.util.Scanner;

class Account
{
	public String bankName;
	public String OwnerName;
	public long contactNum;
	
	private double bal;
	
	public Account(String bankName,String OwnerName,long contactNum,double bal)
	{
		this.bankName=bankName;
		this.OwnerName=OwnerName;
		this.contactNum=contactNum;
		this.bal=bal;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		if(bal>0)
		{
			this.bal = bal;	
		}
		else
		{
			System.out.println("Transaction failed due to insuffient balance");
		}
		
	} 
	public void withdraw(double amt, Account ref)
	{
		double b2= ref.getBal();
		b2 = b2-amt;
		ref.setBal(b2);
	}
	public void deposit(double amt, Account ref)
	{
		double b1= ref.getBal();
		b1 = b1+amt;
		ref.setBal(b1);
	}
	public void checkbal(Account ref)
	{
		System.out.println(ref.getBal());
	}
	
}


public class BankAccount {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the details");
      Account a = new Account(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
      a.withdraw(sc.nextDouble(), a);
      a.deposit(sc.nextDouble(), a);
      a.checkbal(a);
	}

}
