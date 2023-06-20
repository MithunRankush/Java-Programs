package com.javaapplication;

class Member {
	String name;
	int age;
	long phoneNumber;
	String address;
	double salary;
	
	public void printSalary() {
		System.out.println("Salary is : " + salary);
	}

}

class Employee extends Member {
	String specialization;
}

class Manager extends Member{
	String department;
}

public class MainInheritance{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name ="Mithun";
		e.age=25;
		e.phoneNumber=9856677877l;
		e.address="Attiguppe";
		e.salary=50000.00;
		e.specialization="software developer";
		
		System.out.println("Employee details ");
		System.out.println("Name: "+ e.name);
		System.out.println("Age : "+ e.age);
		System.out.println("Phone number : "+ e.phoneNumber);
		System.out.println("Address : "+ e.address);
		System.out.println("Salary : "+ e.salary);
		e.printSalary();
		System.out.println("Specialization : "+ e.specialization);
		
		System.out.println("************************");
		
		Manager m = new Manager();
		m.name ="Krishna";
		m.age=30;
		m.phoneNumber=8856677877l;
		m.address="Banglore";
		m.salary=100000.00;
		m.department="Human Resource";
		
		System.out.println("Manager details ");
		System.out.println("Name: "+ m.name);
		System.out.println("Age : "+ m.age);
		System.out.println("Phone number : "+ m.phoneNumber);
		System.out.println("Address : "+ m.address);
		System.out.println("Salary :"+ m.salary);
		m.printSalary();
		System.out.println("Department : "+ m.department);
		 
	}
}