package com.hackerrank;

import java.util.Scanner;

public class Rightsum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int sum=0;
        int[] b= new int[arr.length];
        
        for(int i=0;i<a;i++)
        {
            arr[i]= sc.nextInt();
        }
        
        for(int i=arr.length-1;i>=0;i--)
        {
          b[i]=sum;
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }

}
