package org.example;

public class opgave4 {

    public static void main(String[] args) {
        int first = 2;
        int second = 3;
        int third = 8;

        if (first >= second && first >= third) {
            System.out.println( first );
        } else if (second >= first && second >= third) {
            System.out.println( second );
        } else {
            System.out.println( third );
        }
    }
}
