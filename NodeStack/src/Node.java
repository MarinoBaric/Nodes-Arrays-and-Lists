public class Node {
    public String value;
    public Node next;

    

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(String value){
        this(value, null);
    }

    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        if(this.next == null) return this.value;
        return this.value + "-->" + this.next;
    }
}
