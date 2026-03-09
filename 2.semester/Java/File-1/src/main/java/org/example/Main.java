package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "2.semester/File-1/src/main/java/org/example/Main.java";
        try(FileReader input = new FileReader(filename)) {

            while (input.ready()) {
                System.out.println((char) input.read());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen kunne ikke læses");
        } catch (IOException e) {
            System.out.println("Der opstod en fejl under læsning af filen");
        }
    }
}
