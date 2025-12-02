package Opgave1;

public class RegnerHandler {
    private int k;

    public RegnerHandler(Regner other) {
        Regner regner = new Regner(k);
    }
    
    
    // f-metode der tager i mod x som variabel og returnerer en beregning
    public double f(double x) {
        return k * x * x + 3;
    }


}
