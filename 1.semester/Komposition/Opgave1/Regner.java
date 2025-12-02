package Opgave1;

public class Regner {
    private double k; // Instansvariabel

    // Set-Constructor som tager k som parametre
    public Regner(double k) {
        this.k = k;
    }

    // f-metode der tager i mod x som variabel og returnerer en beregning
    public double f(double x) {
        return k * x * x + 3;
    }
}
