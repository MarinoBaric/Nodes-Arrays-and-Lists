public interface Queue<E> {
    void enqueue(E value);  // Add an element
    E dequeue();            // Remove the highest priority element
    int size();             // Return the number of elements
}
