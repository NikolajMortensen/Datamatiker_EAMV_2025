package Opgave1;

public class Farve {
    private int r, g, b; // datakerne

    // default konstruktor
     public Farve() {
        this(0,0,0);
    }

    // set konstuktor
    public Farve(int r, int g, int b) {
        set(r, g, b);
    } 


    // set metode
    private void set(int r, int g, int b) {
        this.r = styrkeBeregner(r);
        this.g = styrkeBeregner(g);
        this.b = styrkeBeregner(b);
    }

    // copy konstruktor
    public Farve(Farve other) {
        this(other.r, other.g, other.b);
    }

    // Metode der returnerer en string i dette format: [r, g, b]
    public String toString() {
        if (r == 255 && g == 0 && b == 0) {
            return "[Rød]";
        } else if (r == 0 && g == 255 && b == 0) {
            return "[Grøn]";
        } else if (r == 0 && g == 0 && b == 255) {
            return "[Blå]";
        } else if (r == 0 && g == 0 && b == 0) {
            return "[Sort]";
        } else {
            return "[" + r + ", " + g + ", " + b + "]";
        }

    }


    // lysstyrke beregner
    private int styrkeBeregner(int styrke) {
        if (styrke < 0) {
            return 0;
        } if (styrke > 255) {
            return 255;
        } else {
            return styrke;
        }
    }

    // Returnerer true/false om farven er den samme som er givet som parameter
    public boolean equals(Farve other) {
        return r == other.r &&
        g == other.g &&
        b == other.b;
    }   
}
