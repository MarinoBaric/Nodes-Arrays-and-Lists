public interface SortedMultiSet<E extends Comparable<E>> {
    void insert(E value);   // Add an element in sorted order
    boolean remove(E value); // Remove one occurrence of value
    boolean contains(E value); // Check if value exists
    int count(E value);  // Count occurrences of value
    int size();  // Return total number of elements
}
