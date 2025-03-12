/*
 * Create a class StackPQ that:

Implements Queue<Integer>.
Uses a Stack (Stack<Integer> stack) as the internal data structure.
Maintains elements in sorted order inside the stack for efficient dequeue().
 
Requirements
✅ Enqueue (enqueue(E value))

Push elements onto the stack while maintaining sorted order.
The smallest element should be at the top of the stack.
⚠ You CANNOT use Collections.sort() or any built-in sorting method—you must insert elements correctly when pushing.
✅ Dequeue (dequeue())

Remove and return the top element (which should be the smallest value).
If the stack is empty, return null.
✅ Size (size())

Return the current number of elements in the stack.
✅ Main Method (For Testing)

Enqueue several integers (random order).
Print elements as they are dequeued (should come out in ascending order).

💡 Hints
💡 How to insert while maintaining order?

When adding (enqueue), find the correct position in the stack.
Use a temporary stack to hold elements larger than the new value, then push them back.
💡 How to efficiently remove the smallest value?

The smallest element should always be at the top, so dequeue() should be fast.
*/

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackPQ implements Queue<Integer> {

    Stack<Integer> stack;
    int size = 0;
    

    public StackPQ(){
        this.stack = new Stack<>();
    }

    @Override
    public void enqueue(Integer value) {
        /*
         * Instead of blindly adding values, do this:
            Use a temporary stack to store larger elements.
            Insert the new value at the correct position.
            Put back the larger elements after inserting the new value.
         */

         Stack<Integer> tempStack = new Stack<>();

         while(!stack.isEmpty() && stack.peek() > value){
            tempStack.push(stack.pop());
         }

         stack.push(value);

         while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
         }
         
    }

    @Override
    public Integer dequeue() {
        if(stack.isEmpty()){
            return null;
        }else{
            return stack.pop();
        }
    }

    @Override
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        StackPQ pq = new StackPQ();
        pq.enqueue(5);
        pq.enqueue(3);
        pq.enqueue(7);
        pq.enqueue(2);
        pq.enqueue(8);

        System.out.println(pq.dequeue()); // Expected: 2
        System.out.println(pq.dequeue()); // Expected: 3
        System.out.println(pq.dequeue()); // Expected: 5
        System.out.println(pq.dequeue()); // Expected: 7
        System.out.println(pq.dequeue()); // Expected: 8

    }
    
}
