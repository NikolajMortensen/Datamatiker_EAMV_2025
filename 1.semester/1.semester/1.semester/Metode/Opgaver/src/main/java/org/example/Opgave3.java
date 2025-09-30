package org.example;

public class Opgave3 {

    static int midterst(int tal1, int tal2, int tal3) {
        int midt = 0;

        if (tal1 <= tal2 && tal2 <= tal3 || tal3 <= tal2 && tal2 <= tal1) {
            midt = tal2;
        } else if (tal2 <= tal1 && tal1 <= tal3 || tal3 <= tal1 && tal1 <= tal2) {
        } else {
            midt = tal3;
        }
        return midt;
    }


    public static void main(String[] args) {
        System.out.println( midterst( 2, 5, 9) );
    }
}
