package com.hackerrank;

import java.util.Scanner;

public class logest_word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");  
		String st = sc.nextLine();
		String word = "";
		String[] words = st.split(" ");
		int length = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].length() > words[j].length()) {
					word = words[i];
				}
			}
			System.out.println(word);
		}
		
	}
}

//	      for(int i = 0; i < st.length(); i++)
//	      {        
//	          if(st.charAt(i) != ' ')
//	          {    
//	              word = word + st.charAt(i);    
//	          }    
//	          else{            
//	              words[length] = word;   
//	              length++;      
//	              word = "";    
////	          }    
//	      }             
//	      large = words[0];          
//	       
//	      for(int k = 0; k < length; k++)
//	      {                    
//	          if(large.length() < words[k].length())    
//	              large = words[k];    
//	      }    
//	      System.out.println(large);     
//	    }
