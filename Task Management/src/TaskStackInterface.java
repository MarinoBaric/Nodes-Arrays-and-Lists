public interface TaskStackInterface {
    void push(Task task);  // Adds a task to the stack
    Task pop();  // Removes and returns the top task
    Task peek();  // Returns the top task without removing it
    boolean isEmpty();  // Checks if the stack is empty
    int size();  // Returns the number of tasks in the stack
}
