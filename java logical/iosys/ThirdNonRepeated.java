package com.iosys;

public class ThirdNonRepeated {

	public static void main(String[] args) {
		String str = "NKhkgyuYGFVAS";
		char x = ThirdNonRepeatElement(str.toLowerCase());
		System.out.println(x);

	}

	private static char ThirdNonRepeatElement(String str) {
		int count[] = new int [256];
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(count[ch]==1) {
				c++;
				if(c==3) {
				return ch;
				}
			}
		}
		return 0;
	}

}
