package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Scanner bruges til at læse input fra brugeren
    Scanner scan = new Scanner(System.in);

    // Random objekt oprettes, som skal bruges til at generere computerens valg
    Random random = new Random();

    // Array med mulige valg i spillet
    String[] wordList = {"Sten", "Saks", "Papir"};

    // Array der beskriver hvem hvert element slår:
    // beats[0] = 1 → Det der står på index 0 i wordList (altså "Sten") slår det, der står på index 1 (altså "Saks").
    // beats[1] = 2 → Det der står på index 1 (altså "Saks") slår det, der står på index 2 (altså "Papir").
    // beats[2] = 0 → Det der står på index 2 (altså "Papir") slår det, der står på index 0 (altså "Sten").
    int[] beats = {1,2,0};


        // Spil-loop: kører indtil brugeren skriver "stop"
        while (true) {
            System.out.println("Vælg sten, saks eller papir (stop for at afslutte spil)");
            String input = scan.nextLine();


            // Hvis brugeren skriver "stop", afslutter spillet
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Tak for spillet!");
                break;
            }

            // Finder brugerens valg i wordlist - ved hjælp af findIndex funktionen
            int userIndex = findIndex(wordList, input);


            // Hvis input ikke findes i wordlist, vis fejlbesked og spring til næste iteration
            if (userIndex == -1) {
                    System.out.println("Ugyldigt valg! Prøv igen.");
                    continue;
                }

            // Vælg et tilfældigt tal mellem 0 og 2 til computerens valg
            int computerIndex = random.nextInt(wordList.length);

            // Vi laver en String-variabel (computerChoice), som får værdien fra det element i wordList,
            // der svarer til det tilfældigt genererede tal (computerIndex).
            // På den måde kan vi gemme computerens valg som tekst og bruge det senere.
            String computerChoice = wordList[computerIndex];

            System.out.println("Computeren valgte " + computerChoice);
            System.out.println("Du valgte " + input);


            // Afgør vinderen
            if (userIndex == computerIndex) {
                System.out.println("Uafgjort!");

            // beats[userIndex] slår op i beats-arrayet for at finde ud af, hvem brugerens valg kan vinde over.
            } else if (beats[userIndex] == computerIndex) {
                System.out.println("Du har vundet");
            } else {
                System.out.println("Du har tabt");
            }

        }
    }

    /** <- Javadoc kommentar
     * Finder index for et bestemt ord i et array.
     * @param array Arrayet der skal gennemsøges
     * @param value Værdien der søges efter
     * @return Index for værdien, eller -1 hvis værdien ikke findes
     */

    public static int findIndex(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value)) {
                return i;
            }
        }
        return -1; // Returner -1 hvis værdien ikke blev fundet
    }
}