package org.example;

public class Opgave1 {
    public static void main(String[] args) {
        int sum, tal;


        // While-loop tæller op
        sum = 0;
        tal = -10;
        while (tal <= 10) {
            sum += tal;
            tal++;
        }
        System.out.println("1) while-løkke op: " + sum);


        // While-loop tæller ned
        sum = 0;
        tal = 10;
        while (tal >= -10) {
            sum += tal;
            tal--;
        }
        System.out.println("2) while-løkke ned: " + sum);


        // For-loop tæller op
        sum = 0;
        for (int i = -10; i <= 10; i++) {
            sum += i;
        }
        System.out.println("3) For-løkke op: " + sum);

        // For-loop tæller ned
        sum = 0;
        for (int i = 10; i >= -10; i--) {
            sum += i;
        }
        System.out.println("3) For-løkke ned: " + sum);

    }
}
