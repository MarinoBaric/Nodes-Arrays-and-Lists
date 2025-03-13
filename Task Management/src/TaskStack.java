import java.util.LinkedList;

public class TaskStack implements TaskStackInterface {

    private LinkedList<Task> stack;
    
    public TaskStack(){
        this.stack = new LinkedList<>();
    }

    public LinkedList<Task> getStack() {
        return stack;
    }

    @Override
    public void push(Task task) {
        stack.addLast(task);
    }

    @Override
    public Task pop() {
        return stack.removeLast();
    }

    @Override
    public Task peek() {
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }


}