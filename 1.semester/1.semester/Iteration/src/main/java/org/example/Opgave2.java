package org.example;

public class Opgave2 {
    public static void main(String[] args) {

        int i = 10;
        while (i < 21) {
            if (isOdd(i)) {
                System.out.println(i);
            }
            i++;

        }
    }

    // Funktion tjekker om et tal er ulige
    // Logik: tal % 2 giver resten når tal divideres med 2. Hvis resten ikke er lig med 0, er den ulige.
    public static boolean isOdd(int tal) {
        return tal % 2 != 0;
    }
}
