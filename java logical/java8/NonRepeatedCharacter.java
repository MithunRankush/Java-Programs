package com.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		
		String s = "Java article are Awesome";
		Character c = s.chars()
				.mapToObj(i->Character.toLowerCase(Character.valueOf((char)i)))
						.collect(Collectors.groupingBy(Function.identity(),
								LinkedHashMap::new, Collectors.counting()))
						.entrySet().stream()
						.filter(entry->entry.getValue()==1L)
						.map(entry->entry.getKey()).findFirst().get();
	       System.out.println(c);
						
						
								

	}

}
