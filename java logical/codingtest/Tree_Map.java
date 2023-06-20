package com.codingtest17dec;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
	
		TreeMap<String,Integer> t1 = new TreeMap<String,Integer>();
		
		t1.put("Mithun", 007);
		t1.put("Murali", 003);
		t1.put("Sinchan", 005);
		t1.put("Dia", 001);
		t1.put("Nithin", 004);

		Set<Entry<String,Integer>> set=t1.entrySet();
		for(Entry<String,Integer> entry:set)
		{
			 System.out.println(entry);
		}
      
	}

	

}
