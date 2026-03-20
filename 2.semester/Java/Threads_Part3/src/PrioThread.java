public class PrioThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this);
    }

    public String toString() {
        return "Prioritet: " + this.getPriority();
    }
}
