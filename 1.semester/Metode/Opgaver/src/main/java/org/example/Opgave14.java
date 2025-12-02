package org.example;

public class Opgave14 {
    
    private static int add(int x,int y) {
        return x + y;
    }
    
    private static int sub(int x, int y) {
        return x - y;
    }

    private static int mul(int x, int y) {
        return x * y;
    }

    private static int div(int x, int y) {
        return x / y;
    }

    private static int mod(int x,int y) {
        return x % y;
    }


    private static double power(double x, double y) {
        return Math.pow(x, y);
    }

     private static double sqr(double x) {
        return x * x;
    }

    private static double abs(double x) {
        return Math.abs(x);
    }

    private static double sqrt(double x) {
        return Math.sqrt(x);
    }




    public static void main(String[] args) {
        System.out.println("A: " + mul(5, add(10, 11)));
        System.out.println("B: " + sub(div(7, 3), mul(9, 5)));
        System.out.println("C: " + mul(4, add(3, 9)));
        System.out.println("D: " + add(div(9, 4), mod(8, 3)));
        System.out.println("E: " + add(div(9, 3), add(mod(9, 3), 12)));
        System.out.println( "power( 2, 3 ) = " + power( 2, 3 ) );
        System.out.println( "sqr( 3 ) = " + sqr( 3 ) );
        System.out.println( "abs( -5 ) = " + abs( -5 ) );
        System.out.println( "sqrt( 41 ) = " + sqrt( 41 ) );

    }
}
