package org.example;

public class Opgave11 {
    public static void main(String[] args) {
        int kandidat = 8;
        boolean erPrimtal = true;

        for (int i = 2; i < Math.sqrt(kandidat); i++) {
            if (kandidat % i == 0) {
                erPrimtal = false;
                break;
            }
        }

        if (erPrimtal) {
            System.out.println(kandidat + " er et primtal");
        } else {
            System.out.println(kandidat + " er ikke et primtal");
        }
    }
}
