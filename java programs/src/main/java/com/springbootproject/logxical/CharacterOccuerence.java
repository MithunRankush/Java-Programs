package com.logxical;

public class CharacterOccuerence {

	public static void main(String[] args) {
		String str = "MITHUNseenu";
		int [] count = new int[128];
		for(int i=0;i<str.length();i++) {
			char c= str.toLowerCase().charAt(i);
			count[c]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				System.out.println((char)i+":"+count[i]);
			}
		}

	}

}
