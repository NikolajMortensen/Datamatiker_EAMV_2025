package Opgave3;

public class Punkt {
    private int x, y; // Instansvariabler

    // Set-contructor
    // Tager instansvariablerne og sætter dem lig med parametrene
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Get-metode for X koordinat
    public int getX() {
        return x;
    }
    
    // Get-metode for Y koordinat
    public int getY() {
        return y;
    }
}
