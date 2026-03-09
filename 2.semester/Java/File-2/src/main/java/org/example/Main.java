package org.example;

import java.io.*;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        String inputFile = "2.semester/File-2/src/main/resources/jekyll_hyde.txt";
        String outputFile = "2.semester/File-2/src/main/resources/output.txt";

        // Array, 26 letters
        int[] stat = new int['Z'-'A'+1];
        int total = 0;

        // Read file
        try {
            FileReader input = new FileReader(inputFile);

            // As long as there is letters left
            while (input.ready()) {
                // Read the letter and transform it to uppercase
                char letter = Character.toUpperCase((char) input.read());

                // Check: If the letter is between A and Z.
                if (letter >= 'A' && letter <= 'Z') {
                    stat[letter - 'A']++;
                    total++;
                }
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("Filen findes ikke " + inputFile);
        } catch (IOException e) {
            System.out.println("Der opstod en fejl under læsning af filen");
        }

        // Output new file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            writer.write("Statistik for filen: jekyll.hyde.txt");
            writer.newLine();

            DecimalFormat percentFormat = new DecimalFormat("#.##");

            for (int i = 0; i < stat.length; i++) {
                double percent = (double) stat[i] / total * 100;

                char indexLetter = (char) (i + 'A');

                writer.write(indexLetter + ": " + percentFormat.format(percent) + "%");
                writer.newLine();
            }

            writer.close();
            System.out.println("Filen er skrevet");


        } catch (IOException e) {
            System.out.println("Der opstod en fejl under skrivning af filen");
        }

    }
}
