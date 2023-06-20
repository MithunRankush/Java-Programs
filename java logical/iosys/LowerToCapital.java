package com.iosys;

public class LowerToCapital {

	public static void main(String[] args) {
		String str = "Hello";
		String newstr = "";

		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x >= 'a' && x <= 'z') {
				newstr += Character.toUpperCase(x);
			} else {
				newstr += Character.toLowerCase(x);
			}
		}
		System.out.println(newstr);

	}

}
