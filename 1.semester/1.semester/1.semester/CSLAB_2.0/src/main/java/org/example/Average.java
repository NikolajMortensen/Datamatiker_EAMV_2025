package org.example;
import java.util.Scanner;

/*
1. What is the difference between a variable and a constant?

En variable "varierer" så ligesom i navnet, skal vi kunne ændre værdien på et senere tidspunkt.
En constant vil vi ikke ændre og skal forblive den samme værdi.

2. Explain what each of the lines below does. Be sure to indicate how each is different from the others.

a. int x;       type bestemmer variblen x som en integer
b. int x = 3;   opretter en integer variable som hedder x og giver den værdien 3.
c. x = 3;       Virker ikke! Java vil have at man skal typebestemme et variabel først!

*/



public class Average {
    public static void main(String[] args) {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in) ;

        // get three values from user
        System.out.println("Please enter three integers and " +
                "I will compute their average");

        val1 = scan.nextInt();
        val2 = scan.nextInt();
        val3 = scan.nextInt();

        average = (val1 + val2 + val3) / 3;

        System.out.println("The average is " + average);


    }
}