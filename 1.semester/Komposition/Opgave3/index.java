package Opgave3;

public class index {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(3, 5); // Opretter objektet punkt1 og sætter x, y
        Punkt punkt2 = new Punkt(5, 2); // Opretter objektet punkt2 og sætter x, y
        Linje linje = new Linje(punkt1, punkt2); // Opretter linje objekt og sætter linjen fra to punkter.

        // Printer længden af linjen ud fra to punkter
        System.out.println(linje.length());

        
    }

}
