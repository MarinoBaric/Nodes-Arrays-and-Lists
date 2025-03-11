public class NodeStack implements Stack{

    private Node top;
    private int size;

    public NodeStack() {
        this.top = null;
        this.size = 0;
    }


    public Node getTop() {
        return top;
    }


    public int getSize() {
        return size;
    }


    @Override
    public void push(String value) {
        Node newNode = new Node(value, this.top);
        this.top = newNode;
        this.size++;
    }

    @Override
    public String pop() {
        if(this.top == null){
            return "Stack is empty!";
        }

        String topValue = this.top.getValue();
        this.top = this.top.getNext();
        this.size --;
        return topValue;

    }

    @Override
    public String peek() {
        return this.top.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "" + this.top;
    }


    public static void main(String[] args) {
        NodeStack stack = new NodeStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack);

        System.out.println("Poped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Final Stack: " + stack);
        System.out.println("Stack size: " + stack.size());
    }

}