import java.util.Stack;

public class TwoStackQueue implements MyQueue<Integer> {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public TwoStackQueue(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    @Override
    public void enqueue(Integer value) {
        stack1.push(value);
    }

    @Override
    public Integer dequeue() {
        /*
         * ✅ Dequeue (dequeue())

        If stack2 is not empty, pop from stack2.
        If stack2 is empty, move all elements from stack1 to stack2 (this reverses order),
        then pop the top.
         */

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
                
            }
            
        }

        if(stack2.isEmpty()){
            return null;
        } else{
            return stack2.pop();
        }
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Expected: 1
        System.out.println(queue.dequeue()); // Expected: 2

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue()); // Expected: 3
        System.out.println(queue.dequeue()); // Expected: 4
        System.out.println(queue.dequeue()); // Expected: 5

    }
    
}
