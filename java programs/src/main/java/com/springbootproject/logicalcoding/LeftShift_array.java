package com.logicalcoding;

public class LeftShift_array {

	public static void main(String[] args) {
	    int [] a= {1,0,0,2,0,0,3};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.print(a[i]+ " ");
		}

	}

}
