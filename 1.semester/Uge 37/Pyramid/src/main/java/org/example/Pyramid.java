package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Klassen der gemmer programmet
public class Pyramid {

    // Start metoden for programmet
    public static void main(String[] args) throws IOException  {

        // Opretter en BufferedReader, som kan læse tekst fra tastaturet (System.in)
        // InputStreamerReader omsætter byte-data fra tastaturet til tegn (char)
        // BufferedReader gør det muligt nemt at læse linjer af tekst

        BufferedReader indlæser =
                new BufferedReader(
                        new InputStreamReader(System.in));

        // Her laver vi et output, som fortæller os hvad man skal indtaste
        System.out.println("Indtast antallet af sten: ");
        double numberOfStones = Integer.parseInt(indlæser.readLine());

        System.out.println("Indtast stenens gennemsnitlige vægt (i kilogram): ");
        double averageStoneWeight = Integer.parseInt(indlæser.readLine());

        System.out.println("Indtast antal år til at bygge pyramiden: ");
        double yearsToBuild = Integer.parseInt(indlæser.readLine());

        // Beregninger
        double totalPyramidWeight = numberOfStones * averageStoneWeight;

        double weightPerYear = totalPyramidWeight / yearsToBuild;
        System.out.printf("Pyramidens vægt vil være %.2f  kilogram pr. år.\n", weightPerYear);

        double weightPerHour = weightPerYear / 365 / 24;
        System.out.printf("Pyramidens vægt vil være %.2f kilogram pr. time.\n", weightPerHour);

        double weightPerMinute = weightPerHour / 60;
        System.out.printf("Pyramidens vægt vil være %.2f kilogram pr. minut.\n", weightPerMinute);
    }
    }
