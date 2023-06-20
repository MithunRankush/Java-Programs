package com.tandemloop;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] arr = { 8, 3, 1, 6, 9, 3, 8 };
		boolean status = isContainsDuplicate(arr);
		if(status) {
			System.out.println("Duplicates are present");
		}else {
			System.out.println("No Duplicates");
		}
	}

	private static boolean isContainsDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(Integer num: arr) {
			if(set.contains(num)) {
				return false;
			}
			set.add(num);
		}
		return false;
	}

}
