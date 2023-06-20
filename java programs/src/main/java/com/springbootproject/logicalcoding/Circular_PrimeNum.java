package com.logicalcoding;

public class Circular_PrimeNum {
	
	public static boolean check(int num)
	{
		int temp=num;
		int c=0;
		while(temp>0)
		{
			c++;
			temp=temp/10;
		}
		for(int i=0;i<=c;i++)
		{
			for(int j=2;j<=num-1;j++)
			{
				if(num%j==0)
				{
					return false;
				}
			}
			int rem=num%10;
			int r1=num/10;
			System.out.println(num + " ");
			num=rem*(int) Math.pow(10,(-1))+r1;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(check(127));

	}

}
