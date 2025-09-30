package org.example;

/*

int a = 3, b = 10, c = 7;
double w = 12.9, y = 3.2;

a. a + b * c = 73
b. a - b - c = 0
c. a / b = 0.3
d. b / a = 3.3333
e. a - b / c = -1,5
f. w / y = 4.03
g. y / w = 0.24
h. a + w = 15.9
i. a % b / y = 0.93
j. b % a = 1
k. w % y = 0.0999999


*/

// File: Errors.java
// Purpose: A program with lots of syntax errors
// Correct all of the errors (STUDY the program carefully!!)


import java.util.Scanner;

public class errors {
    public static void main (String[] args) {
        String User = "Name of the user";
        int number;
        int numSq;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name, please: ");
        String Name = scan.nextLine();

        System.out.println("What is your favorite number?");
        number = scan.nextInt();

        numSq = number * number;
        System.out.println(Name + ", the square of your number is " + numSq);
    }

}