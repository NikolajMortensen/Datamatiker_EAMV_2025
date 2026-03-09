public class FibonacciIterator implements CustomIterator {
    private FibonacciAggregate aggregate;
    private int index = 0;

    public FibonacciIterator(FibonacciAggregate aggregate) {
        this.aggregate = aggregate;
    }

   @Override
   public void next() {
        index++;
   }

   @Override
    public long current() {
        return aggregate.fib(index);
   }

   @Override
    public boolean hasNext() {
        return index < 10;
   }
}