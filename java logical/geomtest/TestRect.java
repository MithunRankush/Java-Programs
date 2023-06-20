package com.geomtest;

import com.geom.Rectangle;

public class TestRect {
 public static void main(String[] args) {
     Rectangle rectangle1 = new Rectangle();
     rectangle1.setLength(5.0);
     rectangle1.setWidth(3.0);
     
     Rectangle rectangle2 = new Rectangle();
     rectangle2.setLength(8.0);
     rectangle2.setWidth(4.0);
     
     System.out.println("Rectangle 1:");
     System.out.println("Length: " + rectangle1.getLength());
     System.out.println("Width: " + rectangle1.getWidth());
     System.out.println("Perimeter: " + rectangle1.calculatePerimeter());
     System.out.println("Area: " + rectangle1.calculateArea());
     
     System.out.println("\nRectangle 2:");
     System.out.println("Length: " + rectangle2.getLength());
     System.out.println("Width: " + rectangle2.getWidth());
     System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
     System.out.println("Area: " + rectangle2.calculateArea());
 }
}
