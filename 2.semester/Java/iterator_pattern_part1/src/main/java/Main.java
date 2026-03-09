public class Main {
    public static void main(String[] args) {
        FibonacciAggregate fibCollection = new FibonacciAggregate();
        CustomIterator it = fibCollection.createIterator();

        System.out.println("De første 10 fibonacci tal");

        while (it.hasNext()) {
            System.out.println(it.current());
            it.next();
        }

    }
}