package com.geom;

import java.util.Scanner;

public class Child implements Parent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length : ");
		double l = sc.nextDouble();
		
		System.out.print("Enter width : ");
		double w = sc.nextDouble();
		
		Child c = new Child();
		System.out.println("Area of rectangle : "+ c.calculateArea(l, w));
		System.out.println("Perimter of rectangle : " + c.caluculatePerimeter(l, w));
		

	}

	@Override
	public double calculateArea(double l, double w) {
		return l*w;
	}

	@Override
	public double caluculatePerimeter(double l, double w) {
		return 2*(l+w);
	}

	

}
