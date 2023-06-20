package com.my.strings;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String str = "Hello world";
		int count =0;
		int count1 =0;
		for(int i=0;i<str.length();i++) {
			char x = str.toLowerCase().charAt(i);
			if(x=='a' ||x=='e' || x=='i' || x=='o' || x=='u' ) {
				count++;
			}else if(x!=' ') {
				count1++;
			}
		}
		System.out.println("number of vowels : " + count);

		System.out.println("number of consonants : " + count1);
	}

}
