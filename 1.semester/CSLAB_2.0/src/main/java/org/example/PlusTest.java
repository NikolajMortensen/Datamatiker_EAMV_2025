package org.example;

// ************************************************************
// PlusTest.java
//
// Demonstrate the different behaviors of the + operator
// ************************************************************
public class PlusTest
{
    // -------------------------------------------------
// main prints some expressions using the + operator
// -------------------------------------------------
    public static void main (String[] args)
    {
        System.out.println ("This is a long string that is the " + "concatenation of two shorter strings.");
        System.out.println ("The first computer was invented about " + 55 + " years ago."); // Sætter mellemrum til sidst i første string og først i sidste string.

        // Her bliver tallene ikke lagt sammen. Først laves "8 plus 5 is " til en string,
        // derefter konverteres 8 og 5 også til strings og sættes bagved.
        System.out.println("8 plus 5 is " + 8 + 5);

        /* Parenteser har højere præcedens, så (8 + 5) bliver udregnet først.
        Resultatet (13) konverteres derefter til en string og sættes bagved. */
        System.out.println("8 plus 5 is " + (8 + 5));

        /* Udtrykket evalueres fra venstre mod højre.
        Først beregnes (8 + 5) = 13, derefter konverteres det til en string
        og sættes foran " equals 8 plus 5." */
        System.out.println(8 + 5 + " equals 8 plus 5.");

    }
}

class OwnProgram {
    public static void main(String[] args) {
        System.out.println("Ten robins plus " + 13 + " canaries is " + 23 + " birds.");
    }

}