package com.codingtest17dec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>
{
	int rollNum,marks;
	String name;
	public Students(int rollNum,  String name,int marks) {
		super();
		this.rollNum = rollNum;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [rollNum=" + rollNum + ", marks=" + marks + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Students s) {
		return name.length()>s.name.length()?1:-1;
	}
}

public class Comparable_Interface {

	public static void main(String[] args) {
		
         List<Students> std=new ArrayList<>();
         
         std.add(new Students(11,"Mithun",55));
         std.add(new Students(12,"Murali",73));
         std.add(new Students(13,"Sinchan",57));
         std.add(new Students(14,"Dia",68));
         std.add(new Students(15,"Leela",75));
         std.add(new Students(16,"Nithin",45));
         
         Collections.sort(std);;
         
         for(Students s : std)
         {
        	 System.out.println(s);
         }
	}

}
