package org.example;

/*
Lad der være givet følgende variable:

Java
String text = "Det var en mørk og stormfuld aften.";
int width = 50;

width er den ønskede tekstbredde. text er dog kun på 35 tegn. Den ønskede bredde opnås ved at forøge mellemrummene mellem ordene, ved at indsætte ekstra mellemrum indtil text har den ønskede bredde.

Lav et program, der laver en forholdsvis jævn forøgelse af mellemrummenes størrelse, og udskriver resultatet.

Dit program skal udskrev følgende*:

Plain Text
Det####var####en####mørk###og###stormfuld###aften.
 */


public class Main {
    public static void main() {

        // Tekst strengen vi bruger, samt den længde vi ønsker den skal være
        String text = "Der var en mørk og stormfuld aften.";
        int width = 50;

        // Hvor mange mellemrum der mangler at fordeles ud (50 - 35(text) = 15)
        int extraSpaceNeeded = width - text.length();

        // Tjekker for tomme mellem som skal splittes og puttes i et array
        String regex = " ";
        String[] textArray = text.split(regex);

        int spaces = textArray.length - 1; // Huller mellem ordene
        int spacesPerGap = extraSpaceNeeded / spaces; // Hvor mange ekstra spaces, hver hul skal have
        int leftOverSpaces = extraSpaceNeeded % spaces; // Hvor mange spaces der skal fordeles ekstra ud

        // Den nye tekstreng som vi vil bygge
        String finalString = "";

        // Ydre-loop: Her kører igennem alle ordene i vores textArray.
        for (int i = 0; i < textArray.length; i++) {

            // Nu ligger vi alle ordene i arrayet ind i den nye streng.
             finalString = finalString + textArray[i];

             // Vi tjekker om vi er ved det sidste ord
             if (i < textArray.length - 1) {

                 // Indsæt # i stedet for mellemrum, så det får den orignale længde igen
                 finalString = finalString + "#";

                 // Indre-loop: Så længe at tælleren er mindre en spacesPerGap skal der indsættes # ved hvert mellemrum.
                 for (int j = 0; j < spacesPerGap; j++) {
                     finalString = finalString + "#";
                 }

                 if (leftOverSpaces > 0){
                     finalString = finalString + "#";
                     leftOverSpaces = leftOverSpaces - 1;
                 }
             }

        }
        // Endelige restultat
        System.out.println(finalString);
        System.out.println("Total Width: " + finalString.length());


    }
}
