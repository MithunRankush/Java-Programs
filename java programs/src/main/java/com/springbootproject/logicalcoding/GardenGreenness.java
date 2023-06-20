package com.logicalcoding;

import java.util.*;

public class GardenGreenness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value");
        int n = scanner.nextInt();
        int[] gardens = new int[n];
   
        for (int i = 0; i < n; i++) {
        	System.out.print("enter arrays : ");
            gardens[i] = scanner.nextInt();
        }
        
        int[] greennessOnOtherSide = calculateGreennessOnOtherSide(gardens);
        
        for (int i = 0; i < n; i++) {
            System.out.println(greennessOnOtherSide[i]);
        }
    }
    
    public static int[] calculateGreennessOnOtherSide(int[] gardens) {
        int n = gardens.length;
        int[] greennessOnOtherSide = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && gardens[i] > gardens[stack.peek()]) {
                greennessOnOtherSide[stack.pop()] = gardens[i];
            }
            stack.push(i);
        }
      
        stack.clear();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && gardens[i] > gardens[stack.peek()]) {
                greennessOnOtherSide[stack.pop()] = Math.max(greennessOnOtherSide[stack.peek()], gardens[i]);
            }
            stack.push(i);
        }
      
        while (!stack.isEmpty()) {
        	greennessOnOtherSide[stack.pop()] = -1;;
        }
        
        return greennessOnOtherSide;
    }
}

