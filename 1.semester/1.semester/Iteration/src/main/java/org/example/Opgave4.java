package org.example;

public class Opgave4 {
    public static void main(String[] args) {
        int n = 5;
        int resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat = resultat * i;
        }
        System.out.println(n + "! = " + resultat);
    }
}
