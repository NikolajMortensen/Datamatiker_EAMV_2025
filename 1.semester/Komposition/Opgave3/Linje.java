package Opgave3;

public class Linje {
    private Punkt p1, p2; // Instansvariablen
    
    // Set-Constructor
    // Sætter instansvariable til være lig med parametre
    public Linje(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Metode der finder længden på et linjestykke ud fra to punkter.
    public double length() {
        return Math.sqrt((p2.getX()-p1.getX())*(p2.getX()-p1.getX()) + 
        ((p2.getY() - p1.getY()) * (p2.getY() - p1.getY())));
    }

}
