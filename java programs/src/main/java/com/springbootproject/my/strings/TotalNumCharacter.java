package com.my.strings;

public class TotalNumCharacter {

	public static void main(String[] args) {
		String str = "Hello world!";
		char arr [] = str.toLowerCase().toCharArray();
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				count++;
			}
		}
		System.out.println("Total bumber of characters : " + count);
	}

}
