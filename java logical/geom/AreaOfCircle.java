package com.geom;

import java.util.Scanner;

import java.util.Scanner;

interface GeometricObject {
	double getArea();

	double getPerimeter();
}

public class AreaOfCircle implements GeometricObject {
	private double radius;

	public AreaOfCircle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius :");
		double radius = sc.nextDouble();

		AreaOfCircle circle = new AreaOfCircle(radius);

		double area = circle.getArea();
		double perimeter = circle.getPerimeter();

		System.out.println("Area of the circle: " + area);
		System.out.println("Perimeter of the circle: " + perimeter);
	}
}
