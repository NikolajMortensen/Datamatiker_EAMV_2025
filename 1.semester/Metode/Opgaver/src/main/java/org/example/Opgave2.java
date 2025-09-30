package org.example;

public class Opgave2 {

    static void meddelFejl(int fejlNummer, int linje) {
        System.out.println("Der er en fejl");
        System.out.println("Fejl nr. " + fejlNummer + " i linje " + linje);

    }


    public static void main(String[] args) {
        meddelFejl(5, 14);

    }

}
