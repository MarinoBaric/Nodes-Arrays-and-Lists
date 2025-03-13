public interface TaskQueueInterface {
    void enqueue(Task task);  // Adds a task to the queue
    Task dequeue();  // Removes and returns the next task
    Task peek();  // Returns the next task without removing it
    boolean isEmpty();  // Checks if the queue is empty
    int size();  // Returns the number of tasks in the queue
}
