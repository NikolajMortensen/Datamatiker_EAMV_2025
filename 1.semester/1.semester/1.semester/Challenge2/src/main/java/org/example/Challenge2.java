package org.example;
import java.util.*;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);

        System.out.println("Indtast beløb: ");
        double totalBeløb = reader.nextDouble();

        // Omregner total beløb til øre
        int beløbIØre = (int)Math.round(totalBeløb * 100);

        // Opretter et array med kroner omskrevet til øre
        int[] mønterØre = {2000, 1000, 500, 200, 100, 50};

        // For hver mønter i listen mønterØre
        for (int mønter : mønterØre ) {

            int antal = beløbIØre / mønter; // Hvor mange mønter i alt
            beløbIØre = beløbIØre % mønter; // Resten

            if (antal > 0) {                         // Omregner fra øre til kroner
                System.out.println(antal + " stk af " + (mønter / 100) + " kr.");
            }
        }




        }
    }
