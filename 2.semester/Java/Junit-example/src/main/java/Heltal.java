public class Heltal {
    private int tal;

    public Heltal() {
        this.tal = 0;
    }

    public Heltal(int tal) {
        set(tal);
    }

    public void set(int tal) {
        this.tal = tal;
    }

    public int get() {
        return tal;
    }
}