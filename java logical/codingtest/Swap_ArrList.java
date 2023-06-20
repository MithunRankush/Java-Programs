package com.codingtest17dec;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_ArrList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		 
		System.out.println("Before swaping=>"+ list);
		
		 Collections.swap(list, 1, 4);
		 
		 System.out.println("after swaping=>"+ list);
		

	}

}
