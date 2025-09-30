package org.example;
import java.util.Scanner;


public class IdealWeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your height.");
        System.out.println("Feet: ");
        int heightFeet = scan.nextInt();
        System.out.println("Inches: ");
        int heightInches = scan.nextInt();

        // Samlede antal inches i alt
        int totalInches = (heightFeet * 12) + heightInches;

        // Beregn inches over 5 fod (5 fod = 60 inches)
        int inchesOverFiveFeet = totalInches - 60;

        // Hvis personen er er under 5 fod, sæt inchesOverFeet til 0
        if (inchesOverFiveFeet < 0) {
            inchesOverFiveFeet = 0;
        }

        // Beregn ideal vægt
        int idealWeightMale = 100 + (inchesOverFiveFeet * 6);
        int idealWeightFemale = 100 + (inchesOverFiveFeet * 5);

        // Konverter til kg
        double idealWeightFemaleKg = idealWeightFemale * 0.45359237;
        double idealWeightMaleKg = idealWeightMale * 0.45359237;

        // Print resultatet
        System.out.println("=== Ideal Weight Calculator ===");
        System.out.printf("Female Ideal Weight: %.2f kg\n", idealWeightFemaleKg);
        System.out.printf("Male Ideal Weight: %.2f kg \n",idealWeightMaleKg);

    }
}
