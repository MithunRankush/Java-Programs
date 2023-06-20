package com.logxical;

public class ReverseAlphabate {

	public static void main(String[] args) {
		String s= " R85DB&DS##J";
		String s1 = "";
		String s2 ="";
		int a=0;
		for(int i=0;i<s.length();i++) {
			char x= s.charAt(i);
			if((x>='a' && x<'z')||(x>='A' && x<'Z')) {
				s1+=x;
			}
		}
		for(int i=0;i<s.length();i++) {
			char x= s.charAt(i);
			if((x>='a' && x<'z')||(x>='A' && x<'Z')) {
				s2=s2+s1.charAt(a);
				a++;
			}else {
				s2+=x;
			}
		}
			System.out.println(s2);
	}

}
