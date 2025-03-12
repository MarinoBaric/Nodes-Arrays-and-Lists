class Node{
    private int value;
    private int count;
    private Node next;

    public Node(int value){
        this.value = value;
        this.count = 1;
        this.next = null;
    }

    public int getValue(){
        return this.value;
    }

    public int getCount(){
        return this.count;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void increaseCount(){
        this.count ++;
    }

    public boolean decreaseCount(){
        this.count --;
        return this.count == 0;
    }

    
}




public class SortedLinkedBag implements SortedMultiSet<Integer> {

    private Node head;
    private int size;

    public SortedLinkedBag(){
        this.head = null;
        this.size = 0;
    }


    @Override
    public void insert(Integer value) {
        if (head == null) { // ✅ If list is empty, set head
            head = new Node(value);
            size++; // ✅ Increase size when adding first node
            return;
        }

        if (value < head.getValue()) { // ✅ Insert at the front
            Node newNode = new Node(value);
            newNode.setNext(head);
            head = newNode;
            size++; // ✅ Increase size
            return;
        }

        Node current = head;
        while (current.getNext() != null && current.getNext().getValue() < value) {
            current = current.getNext();
        }

        if (current.getNext() != null && current.getNext().getValue() == value) {
            current.getNext().increaseCount(); // ✅ Just increase count
        } else {
            Node newNode = new Node(value);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++; // ✅ Increase size for a new node
        }
    }

    

    @Override
    public boolean remove(Integer value) {
        if (head == null) {
            return false;
        }

        if (head.getValue() == value) { // ✅ If head is the value to remove
            if (head.decreaseCount()) {
                head = head.getNext();
                size--; // ✅ Decrease size only when node is removed
            }
            return true;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.getValue() != value) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        if (current.decreaseCount()) {
            if (previous != null) { // ✅ Ensure `previous` is not null
                previous.setNext(current.getNext());
            }
            size--; // ✅ Decrease size only when node is removed
        }

        return true;
    }


    @Override
    public boolean contains(Integer value) {
        Node current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext(); // ✅ Fix: Move to next node
        }
        return false;
    }


    @Override
    public int count(Integer value) {
        Node current = head;

        while(current != null){
            if(current.getValue() == value){
                return current.getCount();
            }
            current = current.getNext();
        }

        return 0;
    }

    @Override
    public int size() {
        Node current = head;
        int totalSize = 0;

        while (current != null) { // ✅ Fix: Use `current`, not `count`
            totalSize += current.getCount();
            current = current.getNext();
        }

        return totalSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.getValue()).append("(").append(current.getCount()).append(")");
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }


    
    public static void main(String[] args) {
        SortedLinkedBag bag = new SortedLinkedBag();
        bag.insert(5);
        bag.insert(3);
        bag.insert(7);
        bag.insert(5); // Duplicate value allowed
        bag.insert(2);

        System.out.println(bag);  // Expected: [2, 3, 5, 5, 7] (always sorted)

        System.out.println(bag.contains(5)); // Expected: true
        System.out.println(bag.count(5)); // Expected: 2
        System.out.println(bag.size());  // Expected: 5

        bag.remove(5); // Remove only one occurrence of 5
        System.out.println(bag);  // Expected: [2, 3, 5, 7]

    }


}
