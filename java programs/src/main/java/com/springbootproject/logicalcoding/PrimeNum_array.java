package com.logicalcoding;

public class PrimeNum_array {
	public static void check(int num)
	{
		
	}

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		int[] res= new int[num.length];
		int count1=0;
		for(int i=0;i<num.length;i++)
		{int count=0;
			for(int j=2;j<num[i];j++)
			{
				
				if(num[i]%j==0)
				{
					count++;	
				}
			}
			if(count==0&& num[i]>1)
			{
				count1 ++;
				
			}
			
			
		}
		System.out.println(count1);

	}

}
