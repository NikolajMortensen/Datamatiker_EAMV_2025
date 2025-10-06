package org.example;

public class Opgave26 {

    public static void main(String[] args) {
        onlySeven();

    }


    public static void onlySeven() {
        int Tabel[] = { 5, 8, 1, 9, 3, 6, 2, 3, 9, 4, 7, 5, 7, 2, 0, 1, 0, 2 };

        int antalSyv = 0;
        for (int i = 0; i < Tabel.length; i++) {
            if (Tabel[i] == 7) {
                antalSyv++;
            }
        }
        System.out.println(antalSyv);

    }


    
}
