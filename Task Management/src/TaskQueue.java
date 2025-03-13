import java.util.LinkedList;

public class TaskQueue implements TaskQueueInterface{

    LinkedList<Task> queue;

    public TaskQueue() {
        this.queue = new LinkedList<>();
    }


    public LinkedList<Task> getQueue() {
        return queue;
    }
    

    @Override
    public void enqueue(Task task) {
        queue.addLast(task);
    }

    @Override
    public Task dequeue() {
        return queue.removeFirst();
    }

    @Override
    public Task peek() {
        return queue.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    
}
