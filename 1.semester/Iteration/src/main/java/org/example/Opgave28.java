public class Opgave28 {
    public static void main(String[] args) {
        int T1[] = {44, 71, 93, 24, 35, 21, 64};

        // Vi laver en variabel, som for-løkken kan ændre
        int biggest = 0;

        for (int i = 0; i < T1.length; i++ ) {
            if (T1[i] > biggest) { // Hvis tallet på det givet indeks er større en biggest værdien, laver vi biggest om til dette tal
                biggest = T1[i];
            }
        }
        System.out.println("Biggest: " + biggest);
    }
}
