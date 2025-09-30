package org.example;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int size = 27; // Definerer en integer variable som hedder size, og giver værdien 27.
        String name = "Fido"; // Definerer en String variable kaldet name og giver den tekst-literalen Fido
        Dog myDog = new Dog(name, size); /* "Dog" er klassen som bliver importeret fra en allerede
         eksisterende pakke. Hertil opretter vi objektet
        som vi kalder "myDog" og initilere i new Dog og giver den nogle argumenter.*/

        x = size - 5; /* Her opretter vi en variable, hvor vi tager argumentet fra tidligere opjekt
         og minusser med 5. */

        if (x < 15) myDog.bark(8);
        // Her kører vi en kontrolstukturer hvor der tjekkes, at hvis
        // x er mindre en 5, kører den funktionen myDog.bark(8);


        // Hvis x er større end 3, kører den funktionen myDog.play
        while (x > 3) {
            myDog.play();
        }


        int[] numList = {2, 4, 6, 8}; // Opretter arrayen variablen numlist, definerer som en integer
        // og giver 4 værdier, 2, 4, 6, 8.

        System.out.print("Hello"); // Printer outputtet Hello
        System.out.print("Dog " + name); // Printer outputtet Dog: Fido (variablen name har allered tekst-literalen Fido)
        String num = "8"; // Her oprettes en tekst-literal med værdien 8 (bemærk dette er en string og ikke int)
        int z = Integer.parseInt(num); // Opretter ny integer variabel kaldet z.
        // Her tages tekst værdien fra num og definerer den som en integer i et nyt variabel.

        try {
            readTheFile("myFile.txt");
        }
        catch (FileNotFoundException ex) {
            System.out.print("File not found.");
        }
    }
