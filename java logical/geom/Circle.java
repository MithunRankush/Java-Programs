package com.geom;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle :");
		double r = sc.nextDouble();
		
		double area = areaOfCircle(r);
		System.out.println("Area of circle is : " + area);
		double perimeter = perimeterOfCircle(r);
		System.out.println("Perimeter of circle : "+ perimeter);

	}

	private static double areaOfCircle(double r) {
		double area= Math.PI * r * r;    
		return area;
		
	}
	
	private static double perimeterOfCircle(double r) {
		double perimeter = 2 * Math.PI * r;
		return perimeter;
	}

}
