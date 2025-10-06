package org.example;
import java.util.Scanner;


public class Opgave4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Indtast et tal: ");
        int input = Integer.valueOf(scanner.nextLine());

        System.out.println("n! = " + beregnFakultet(input));
        scanner.close();
    }


    public static long beregnFakultet(long n) {
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat = resultat * i;
        }
        return resultat;
    }
}
