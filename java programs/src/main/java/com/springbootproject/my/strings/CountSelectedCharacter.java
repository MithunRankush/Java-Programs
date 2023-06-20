package com.my.strings;

public class CountSelectedCharacter {

	public static void main(String[] args) {
		String str = "Mithun Rajaram Ankush";
		char selectedchar = 'M';
		int count =0;
		char arr[] = str.toUpperCase().toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==selectedchar) {
				count++;
			}
		}
		System.out.println("Number of selected characters are : "+ count);
	}

}
