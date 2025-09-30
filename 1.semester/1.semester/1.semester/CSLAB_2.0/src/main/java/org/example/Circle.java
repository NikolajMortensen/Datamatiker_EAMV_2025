package org.example;
import java.util.Scanner;

// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
public class Circle {
    public static void main(String[] args) {

        final double PI = 3.14159;
        int radius = 10;
        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;

        System.out.println("Circle 1:\nThe area of a circle with radius " + radius + " is " + area1);
        System.out.println("And the circumference of the circle is " + circumference1);


        radius = 20;
        double area2 = PI * radius * radius;
        double circumference2 = 2 * PI * radius;

        double areaGrowthFactor = area2 / area1;

        System.out.println("\nCircle 2:\nThe area of a circle with radius " + radius + " is " + area2);
        System.out.println("And the circumference of the circle is " + circumference2);
        System.out.println("\nThe difference between Area1 and Area2 is: " + areaGrowthFactor);
    }
}

class hardcoded {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a value for the radius: ");
        int radiusNew = scan.nextInt();
        radiusNew = scan.nextInt();

        System.out.println(radiusNew);
    }
}