public interface MyQueue<E> {
    void enqueue(E value);  // Add an element
    E dequeue();            // Remove the first added element (FIFO)
    int size();             // Return the number of elements
}
