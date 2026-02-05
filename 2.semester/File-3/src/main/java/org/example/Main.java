package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String source = "2.semester/File-3/src/main/java/org/example/Main.java";
        String destination = "2.semester/File-3/src/main/resources/output.txt";

        try(FileReader input = new FileReader(source);
            FileWriter output = new FileWriter(destination)) {

            while (input.ready()) {
                char original = (char) input.read();
                char c = Character.toUpperCase(original);

                if ('A' <= c && c <= 'Z' || " \r\n".contains(String.valueOf(c))) {
                    output.write(original);
                }
            }
            System.out.println("Filen er færdig skrevet");
        } catch (FileNotFoundException e) {
            System.out.println("Filen kunne ikke læses");
        } catch (IOException e) {
            System.out.println("Der opstod en fejl under læsning af filen");
        }
    }
}
