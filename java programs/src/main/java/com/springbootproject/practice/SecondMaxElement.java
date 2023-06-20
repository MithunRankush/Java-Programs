package com.tandemloop;

public class SecondMaxElement {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 1, 6, 9, 3, 7 };
		int secondMax = findSecondMax(arr);
		System.out.println("Second max element is : "+ secondMax);

	}

	private static int findSecondMax(int[] arr) {
		int max =0;
		int secondMax =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];	
			}else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}

}
