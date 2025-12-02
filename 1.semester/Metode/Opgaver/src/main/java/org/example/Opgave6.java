package org.example;

public class Opgave6 {
    
    public static void tegnLinie(int antal, char tegn) {
        for (int i = 0; i < antal; i++) {
            System.out.print(tegn);
        }
        System.out.println();
    }




    public static void main(String[] args) {
        tegnLinie(5, '#');
    }
}
