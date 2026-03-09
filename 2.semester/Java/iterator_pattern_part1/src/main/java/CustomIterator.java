public interface CustomIterator {
    void next(); // Move to the next element
    long current(); // Get the current element
    boolean hasNext();
}