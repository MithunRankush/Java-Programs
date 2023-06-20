package com.logicalcoding;

public class nth_fibanaciNum {
	public static void check(int num)
	{
			int l1=1;
			int l2=1;
			System.out.print(l1+" "+l2);
			for(int i=1;i<=num-2;i++)
			{
				int l3=l1+l2;
				System.out.print(" "+l3);
				l1=l2;
				l2=l3;
			}
		}
	

	public static void main(String[] args) {
		check(10);

	}

}
