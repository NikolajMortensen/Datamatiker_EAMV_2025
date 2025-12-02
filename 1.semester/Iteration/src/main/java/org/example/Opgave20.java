package org.example;

public class Opgave20 {
    private int PosNeg[]= { 4, 9, -2, -6, 2, 6, -9, 4, 9, -1, 1, 0, -3, -3, 2, 7 };


    public void printNegative() {
        for (int i = 0; i < PosNeg.length; i++) {
            if (PosNeg[i] < 0) {
                System.out.println(PosNeg[i]);
            }
        }
    }



    public static void main(String[] args) {
        Opgave20 op20 = new Opgave20();
        op20.printNegative();
    }
    
}
