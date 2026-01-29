package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Opret repository (forbindelsen åbnes i konstruktøren)
        StudentRepository repo = new StudentRepository();

        // 2. Hent listen af studerende
        System.out.println("--- Henter alle studerende ---");
        ArrayList<Student> liste = repo.getAllStudents();

        // 3. LOOP igennem listen og print hver enkelt (Det er det her, du mangler!)
        for (Student s : liste) {
            System.out.println(s);
        }

        // Test af Trine
        System.out.println("\n--- Søger efter Trine ---");
        ArrayList<Student> trineListe = repo.getStudentsByFirstName("Trine");
        for (Student s : trineListe) {
            System.out.println(s);
        }
    }
}
