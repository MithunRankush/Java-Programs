package com.my.strings;

public class CountDuplicate {

	public static void main(String[] args) {
		String str = "Character duplicate words example java";
		char arr[] = str.toLowerCase().toCharArray();
		int count=0;
		System.out.println("Duplicate characters are : ");
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='0';
				}
			}
			if(arr[i]!='0' && arr[i]!=' ' && count>1) {
				System.out.println(" "+ arr[i] + " : "+ count);
			}
		}

	}

}
