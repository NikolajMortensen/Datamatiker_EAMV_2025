public class FibonacciAggregate implements Aggregate {
    public long fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    @Override
    public CustomIterator createIterator() {
        return new FibonacciIterator(this);
    }
}