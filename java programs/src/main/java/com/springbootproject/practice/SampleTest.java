package com.tandemloop;

public class SampleTest {

	public static void main(String[] args) {
      String s1 = "XTD";
      String s2 = " ";
      char ch;
      for(int i=s1.length()-1;i>=0;i--)
      {
    	  ch=s1.charAt(i);
    	  int x=ch+1;
    	  char c =(char)x;
    	  s2+=c;
      }
//    	System.out.println(s2.toString());
    	System.out.println(s2);
	}
}
