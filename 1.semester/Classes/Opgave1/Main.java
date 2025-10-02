import Opgave1.Farve;

public class Main {
    public static void main(String[] args) {
        Farve rød = new Farve(255, 0, 0);
        Farve ogsåRød = new Farve(rød);

        System.out.println(rød.toString());
        System.out.println(rød.equals(ogsåRød));
    }
}
