public class Opgave21 {
    public static void main(String[] args) {
        // Vi laver et array T3 og tilegner nogle værdier
        int T3[] = {25, 54, 62, 10, 99, 45, 23};

        // Vi sætter i til array length -1, for at den skal starte på indeks 6
        for (int i = T3.length-1; i >= 0; i-- ) { // =0 for at få alle reelle indeks med
            System.out.println(T3[i]);
        }
    }

}
