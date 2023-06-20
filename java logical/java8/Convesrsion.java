package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convesrsion {
	public static void main(String[] args) {
     List<String> names = Arrays.asList("mit","lily");
     List<String> name = names.stream() 
    		       .map(s->s.toUpperCase()).collect(Collectors.toList());
     System.out.println(name);
	}

}
