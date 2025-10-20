public class Opgave9 {
    public static void main(String[] args) {
    int a1[]={5,42,9,53,3,10};
    int a2[]={3,9,19,33,10,1};

    add(a1,a2);

    }

    // Vi laver en metode, hvis formål er, at lægge værdien fra array2 til array1 og printe det ud
    // PRE(condition): array1.length == array2.length
    public static void add(int[] array1, int[] array2){ // Tager imod 2 arrays som parametre
        for(int i = 0; i <array1.length; i++){
            System.out.println(array1[i] += array2[i]); // Går igennem hvert indeks og lægger værdien til det tilsvarende indeks i array1
        }
    }

}
