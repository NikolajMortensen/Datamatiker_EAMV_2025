package org.example;

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast tal: ");
        int tal = Integer.valueOf(scanner.nextInt());

        int product = tal * tal;


        System.out.println("Tal ganget med sig selv er " + product);


    }
}
