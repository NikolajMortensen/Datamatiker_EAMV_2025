public class Main {
    public static void main(String[] args) {

        for (int i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
            Thread tråde = new PrioThread();
            tråde.setPriority(i);
            tråde.start();
        }
    }
}


