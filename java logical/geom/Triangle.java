package com.geom;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		int l = sc.nextInt();
		
		System.out.println("Enter Height : ");
		int h = sc.nextInt();
		
		int area = areaOfTriangle(l,h);
		System.out.println("Area of Triangle is : "+ area);
	}

	private static int areaOfTriangle(int l, int h) {
		int area = (l*h)/2;
		return area;
	}

}
