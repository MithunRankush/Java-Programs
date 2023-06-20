package com.my.arrays;

import java.util.Scanner;

public class BulbSwitches {
    public static void main(String[] args) {
        boolean[] switches = {false, false, false}; 
        boolean[] bulbs = {false, false, false}; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the status of the bulbs (0 for off, 1 for on):");
        for (int i = 0; i < bulbs.length; i++) {
            int status = sc.nextInt();
            if(status==1) {
            	bulbs[i]=true;
            }else {
            	bulbs[i]=false;
            }
        }
        for (int i = 0; i < bulbs.length; i++) {
            if (bulbs[i]) {
                int switchNumber = i + 1;
                switches[switchNumber - 1] = true;
            }
        }
        System.out.println("Switches:");
        for (int i = 0; i < switches.length; i++) {
            int switchNumber = i + 1;
            if(switches[i]) {
            	System.out.println("Switch " + switchNumber + ": " +  "on" );
            }else {
            	System.out.println("Switch " + switchNumber + ": " +  "off" );
            }
        }
    }
}

