package org.example;

public class opgave6 {
    public static void main(String[] args) {

        int x, y, z;

        x = 5;
        y = 8;
        z = 3;

        if ( x >= y && y >= z || z >= y && y >= x ) {
            System.out.println( y );
        } else if ( y >= x && x >= z || z >= x && x >= y ) {
            System.out.println( x );
        } else  {
            System.out.println( z );
        }
    }
}
