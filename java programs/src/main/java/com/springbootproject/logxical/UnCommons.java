package com.logxical;

import java.util.HashSet;
import java.util.Set;

public class UnCommons {

	public static void main(String[] args) {
		String str = "Mithunankush";
		char [] x = str.toLowerCase().toCharArray();
		Set<Character> set = new HashSet<>();
		Set<Character> repeated = new HashSet<>();
		for(Character c:x) {
			if(!set.add(c)) {
				repeated.add(c);
			}
		}
		System.out.println("occured : "+set);
	    System.out.println("repeated : "+repeated);
		Set<Character> uncommon = new HashSet<>();
		for(Character c: x) {
			if(!repeated.contains(c)) {
				uncommon.add(c);
			}
		}
		System.out.println("uncommon characters : ");
		for (Character c : uncommon) {
			System.out.print(c+" ");
		}
	}

}
