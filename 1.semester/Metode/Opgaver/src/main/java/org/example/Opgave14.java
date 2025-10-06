package org.example;

public class Opgave14 {
    
    private static int add(int firstNumber,int secondNumber) {
        return firstNumber + secondNumber;
    }
    
    private static int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    private static int mod(int firstNumber,int secondNumber) {
        return firstNumber % secondNumber;
    }




    public static void main(String[] args) {
        System.out.println("A: " + mul(5, add(10, 11)));
        System.out.println("B: " + sub(div(7, 3), mul(9, 5)));
        System.out.println("C: " + mul(4, add(3, 9)));
        System.out.println("D: " + add(div(9, 4), mod(8, 3)));
        System.out.println("E: " + mod(add(div(9, 3), 9), add(3, 12)));

    }
}
