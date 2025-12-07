package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        opgave1a();
        opgave1b();

    }

    public static void opgave1a() {
        int[] t = {3, 1, 2, 5, 5, 1, 6, 1, 2, 5, 4};
        int[] target = {1, 2, 5};

        for (int i = 0; i <= t.length - target.length; i++) {

            boolean isMatch = true;

            for (int j = 0; j < target.length; j++) {

                if (t[i + j] != target[j]) {
                    isMatch = false;
                    break;
                }

            }

            if (isMatch) {
                System.out.println("target found: index=" + i);

            }
        }
    }


    public static void opgave1b() {
        int[] t = {3, 1, 2, 5, 5, 1, 6, 1, 2, 5, 4};
        int[] target = {1, 2, 5};
        int[] replace = {3, 1, 2};

        // Ydre løkke: Kører indtil der ikke er plads til 'target' mere
        // (t.length - target.length) sikrer, at vi ikke ryger ud over kanten
        for (int i = 0; i <= t.length - target.length; i++) {

            boolean isMatch = true;

            // Indre løkke: Tjekker om target matcher på denne position
            for (int j = 0; j < target.length; j++) {
                if (t[i + j] != target[j]) {
                    isMatch = false;
                    break; // Stop indre løkke ved mismatch
                }
            }

            // Hvis vi fandt et match, skal vi erstatte tallene
            if (isMatch) {
                // Overskriv tallene i 't' med tallene fra 'replace'
                for (int k = 0; k < replace.length; k++) {
                    t[i + k] = replace[k];
                }

                // VIGTIGT:ryk index frem, så vi ikke tjekker de tal, vi lige har sat ind.
                // Vi trækker 1 fra, fordi for-løkken selv tæller 1 op (i++)
                i += target.length - 1;
            }
        }

        // Udskrivning af det ændrede array
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);

            // Sæt kun komma, hvis det IKKE er det sidste tal
            if (i < t.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Afslut med linjeskift
    }

}