package com.my.strings;

public class WordsLength {

	public static void main(String[] args) {
		String str = "geeks for geeks";
		String arr[] = str.split(" ");
		String words = "";
		for(int i=0;i<arr.length;i++) {
			words = arr[i];
			System.out.println( words +" : "+ words.length());
		}
		
	}

}
