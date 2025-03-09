import java.util.Arrays;

public class MyStack<E> {
    Object[] elements;
    int size;

    public MyStack(){
        this.elements = new Object[5];
        this.size = 0;
    }

    public void push(E item){
        if (size == elements.length){
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size] = item;
        size ++;
    }

    public E pop(){
        if (size == 0){
            throw new IllegalStateException("The stack has no elements insde!");
        } else{
            @SuppressWarnings("unchecked")
            E lastElem = (E) elements[size - 1];
            elements[size - 1] = null;
            size --;
            return lastElem;
        }
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (size == 0){
            throw new IllegalStateException();
        } else{
            return (E) elements[size - 1];
        }
    }

    @Override
    public String toString() {
        String result = "My list: [";
        
        for (int i=0; i<size; i++){
            result += elements[i];
            if(i < size - 1){
                result += ", ";
            }
        }

        return result + "]";
    }


    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(12);
        stack.push(33);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }

}
