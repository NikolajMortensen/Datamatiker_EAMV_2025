package org.example;

public class Student_Points {

    public static void main (String[] args) {
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println ("\t==\t\tStudent Points\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Opretter lister til navne, points og bonus
        String[] names = {"Milo", "Milo", "Milo", "Milo", "Jules <3"};
        int[] labPoints = {43, 50, 32, 61, 90};
        int[] labBonus = {7, 8, 10, 15, 5};

        // Printer de forskellige emner i terminalen
        System.out.println ("Name\t\tLab\t\t\tBonus\t\tTotal") ;
        System.out.println ("=====\t\t======\t\t=====\t\t=====");

        // Her kører et loop fra index 0 til 5 i hver liste
        for (int i = 0; i < names.length; i++) {
            int total = labPoints[i] + labBonus[i];
            System.out.printf("%-12s %-12d %-12d %-12d\n", names[i], labPoints[i], labBonus[i], total);
        }

    }
}