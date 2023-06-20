package com.hackerrank;

import java.util.Scanner;

public class Encription {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("enter data" );
	        String st = sc.nextLine();
	        String[] words = st.split(" ");
	        String s2 = "";
	        
	        for(int i=words.length-1;i>=0;i--)
			{
	        	String s=words[i];
				if(i%2!=0)
				{
					for(int j=s.length()-1;j>=0;j--)
					{
						s2 = s2+ s.charAt(j);
					}
					s2=s2+" ";
					
				}else
				{
					for(int k=0;k<s.length();k++)
					{
						s2 = s2+ s.charAt(k);
					}
					s2=s2+" ";
				}
					
			}
			System.out.println(s2);

	}

}
