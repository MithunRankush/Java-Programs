package com.javacodingtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProblem {

	public static void main(String[] args) {
		
		
//		int size1=0;
//		 int size2=0;
	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the total number of mech students : ");
			int size1= Integer.parseInt(sc.nextLine());
		    System.out.print("Enter the total number of cs students : ");
		    int size2= Integer.parseInt(sc.nextLine());
		
		    System.out.println("****************************************");
			
			Map<Object,String> mech = new HashMap<>();
			for(int i=1;i<=size1;i++) {
				int id=100;
				String name = "";
			    System.out.print("Enter the mech student name :");
			    name=sc.nextLine();
			    System.out.println("Student id="+ (id+i) +"student name= "+name);
			    id=id+i;
			    mech.put(Integer.valueOf(id), name);
			}
			System.out.println("****************************************");
			
			Map<Object,String> cs = new HashMap<>();
			for(int i=1;i<=size2;i++) {
				int id=100;
				String name = "";
			    System.out.print("Enter the cs student name :");
			    name=sc.nextLine();
			    System.out.println("Student id="+ (id+i) +"student name= "+name);
			    id=id+i;
			    cs.put(Integer.valueOf(id), name);
			}
			
			System.out.println("****************************************");
			
			Map<String,Object> students = new HashMap<>();
			students.put("Mechanical", mech);
			students.put("Computer science", cs);
			
			  System.out.println("Map of map:"+ students);
			  
			  for(int i=0;i<students.size();i++) {
				  ArrayList<Object> a = new ArrayList<>(students.keySet());
				  Object obj = a.get(i);
				  System.out.println("Branch : " + obj + "students :"+ students.get(obj));
			  }
           sc.close();
		}
		

	

}
