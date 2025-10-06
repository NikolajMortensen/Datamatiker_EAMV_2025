package org.example;
public class Opgave7 {
    
    public static void stjerneLinie() {
        stjerneLinie(20);
    }
    
    public static void stjerneLinie(int antalStjerner) {
        for (int i = 0; i < antalStjerner; i++) {
            System.out.print('*');
        }
        System.out.println(); // Sætter cursoren til næste linje
    }

    public static void tegnLinie(int antal, char tegn) {
        for (int i = 0; i < antal; i++) {
            System.out.print(tegn);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        stjerneLinie();
    }
}
