package org.example;

public class Opgave16 {
    int Ulige[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29 };

    public void firstFiveIndex() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Ulige[i]);
        }
    }


    public static void main(String[] args) {
        Opgave16 uligeTabel = new Opgave16();
        uligeTabel.firstFiveIndex();
    }
}
