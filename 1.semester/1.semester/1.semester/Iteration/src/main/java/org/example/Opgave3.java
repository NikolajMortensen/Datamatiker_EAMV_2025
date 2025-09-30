package org.example;

public class Opgave3 {

    public static void main(String[] args) {

        // Initilere start værdien
        int tal = 8;

        // Laver et loop indtil værdien er mindre eller lig med 80
        while (tal <= 8*10) {
            System.out.println(tal);
            tal += 8; // Tal stiger med 8 for hver iteration
        }
    }
}
