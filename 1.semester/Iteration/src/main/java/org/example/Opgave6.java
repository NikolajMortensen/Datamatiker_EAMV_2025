package org.example;

public class Opgave6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " er ulige");
                sum += i;
            } else {
                System.out.println(i + " er lige");

            }
        }
        System.out.println("Summen for ulige tal er " + sum);

    }
}
