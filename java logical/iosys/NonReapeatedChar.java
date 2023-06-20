package com.iosys;

public class NonReapeatedChar {

	public static void main(String[] args) {
		String str ="JavaDCjVcodes";
		char x = firstNonRepeated(str.toLowerCase());
		System.out.println(x);

	}

	private static char firstNonRepeated(String str) {
		int[] count = new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1) {
				return str.charAt(i);
			}
		}
		return 0;
		
	}

}
