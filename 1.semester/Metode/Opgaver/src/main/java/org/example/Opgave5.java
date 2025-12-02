package org.example;

public class Opgave5 {
    public static void main(String[] args) {
        stjerneLinie(5);
    }


    public static void stjerneLinie(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(); // Sætter cursoren til næste linje
    }
}
