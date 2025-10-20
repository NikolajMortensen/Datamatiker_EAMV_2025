public class Opgave8 {
    public static void main(String[] args) {
        // Instantiere et array
        int a1[]={1,2,3,4,5,6,7,8,9};
        // Metodekald
        inc(a1);

        //printArray(a1);
    }

    // Metode der både, lægger 1 til alle værdier i arrayet og printer det ud
    public static void inc(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i]++; // Incrementer værdien med 1
            System.out.println(array[i] + " "); // Printer det ud og laver et mellemrum for hver iteration
        }
         //public static void printArray(int[] array){
        //for(int i = 0; i < array.length; i++) {
            //System.out.println(array[i] + " ");

    }
}
