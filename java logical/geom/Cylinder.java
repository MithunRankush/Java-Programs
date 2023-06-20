package com.geom;

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter diameter : ");
		int d  = sc.nextInt();
		
		System.out.print("Enter Height : ");
		int h = sc.nextInt();
		
		int perimeter = perimeterOfCylinder(d,h);
		System.out.println("Perimeter of cylinder is : " + perimeter + " units ");

	}

	private static int perimeterOfCylinder(int d, int h) {
		
		return (2*d)+(2*h);
	}

}
