//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************

package org.example;
import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal

        int length, width, height;
        double totalSqFt;
        double paintNeeded;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the length of the room: ");
        length = scan.nextInt();

        System.out.println("Please enter the width of the room: ");
        width = scan.nextInt();

        System.out.println("Please enter the height of the room: ");
        height = scan.nextInt();

        System.out.print("Enter the number of doors: ");
        int doors = scan.nextInt();

        System.out.print("Enter the number of windows: ");
        int windows = scan.nextInt();

        // Total square feet to be painted (4 walls)
        totalSqFt = 2 * (length * height) + 2 * (width * height);

        // Subtract area of doors and windows
        totalSqFt = totalSqFt - (doors * 20) - (windows * 15);

        // Compute the paint needed
        paintNeeded = totalSqFt / COVERAGE;

        System.out.println("\nRoom dimensions: " + length + " x " + width + " x " + height);
        System.out.println("Total wall area to paint: " + totalSqFt + " sq ft");
        System.out.println("Gallons of paint needed: " + paintNeeded);
    }
}