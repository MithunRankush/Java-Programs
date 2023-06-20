package com.codingtest17dec;

import java.util.ArrayList;
import java.util.Collections;

public class Colors {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("red");
		list.add("black");
		list.add("blue");
		list.add("white");
		list.add("grey");
		
		System.out.println("Before inserting=>" +list);
		 list.add(0, "purple");
		 list.add(6, "brown");
		 
		 System.out.println("After inserting=>" +list);
		
		 Collections.sort(list);
		 System.out.println("After sorting=>"+ list);
	}

}
