package com.codingtest17dec;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linked_hashmap {

	public static void main(String[] args) {
		Student s1 = new Student(101,"mithun",24,"mech");
		Student s2 = new Student(102,"mithun",24,"mech");
		Student s3 = new Student(103,"mithun",24,"mech");
		Student s4 = new Student(104,"mithun",24,"mech");
		Student s5 = new Student(105,"mithun",24,"mech");
		
		Map<Integer,Student> m = new LinkedHashMap<Integer,Student>();
		m.put(s1.getId(), s1);
		m.put(s2.getId(), s2);
		m.put(s3.getId(), s3);
		m.put(s4.getId(), s4);
		m.put(s5.getId(), s5);
		
		Set<Map.Entry<Integer,Student>> set = m.entrySet();
		Student ss = new Student(0,null,0,null);
		
		for(Map.Entry<Integer,Student> data:set)
		{
			 if(data.getKey()==104)
			  {
				  
				  ss.setId(data.getKey());
				  ss.setName(data.getValue().getName());
				  ss.setAge(data.getValue().getAge());
				  ss.setBranch(data.getValue().getBranch());;
			  }
			System.out.println(data.toString());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		  for(Map.Entry<Integer, Student>data : set)
			  
			{
				  if(data.getKey()==103)
				  {
					  Map <Integer,Student>map=new LinkedHashMap<Integer,Student>();
						m.put(data.getKey(), ss);
						 Set<Map.Entry<Integer, Student>>stdata1=m.entrySet();
						 for(Map.Entry<Integer, Student>data1 : stdata1)
							  
							{
							 System.out.println(data1.toString());
							}
							}
						 
					  
				  
				  else
				  {
					  System.out.println(data.toString());
				  }
				
			}
	}
}
