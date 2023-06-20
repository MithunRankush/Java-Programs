package com.my.strings;

public class SelectedWords {

	public static void main(String[] args) {
		String str = "java java best coding language is JAVA BEST";
		// for single word
		String selectedword = "java";
		String selectedwords[] = {"java","best"};
		String arr[] = str.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			String x = arr[i];
			if(x.equalsIgnoreCase(selectedword)) {
				count++;
			}
		}
		System.out.println("Number of selected words are : "+ count);
		
		// for multiple words
		int wordcount[]= new int[selectedwords.length];
		for(String words : arr) {
			for(int i=0;i<selectedwords.length;i++) {
				String s = selectedwords[i];
				if(words.equalsIgnoreCase(s)) {
					wordcount[i]++;
				}
			}
		}
		for(int i=0;i<selectedwords.length;i++) {
			System.out.println(selectedwords[i]+" : "+ wordcount[i]);
		}
	}

}
