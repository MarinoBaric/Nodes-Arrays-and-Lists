import java.util.Arrays;

public class MyArrayList<E> {

    private Object[] elements;
    private int size;

    public MyArrayList(){
        this.elements = new Object[5];
        this.size = 0;
    }

    public void append(E item){
        if(size == elements.length){
            elements = Arrays.copyOf(elements, elements.length * 2);
        } 
        
        elements[size] = item;
        size ++;
        
    }

    @SuppressWarnings("unchecked")
    public E get(int index){
        if (index >= 0 && index < size){
            return (E) elements[index];
        } else{
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    @SuppressWarnings("unchecked")
    public E pop(){
        if (size > 0){
            E lastElem = (E) elements[size - 1];
            elements[size - 1] = null;
            size --;
            return lastElem;
        } else{
            throw new IllegalStateException("Cannot pop from an empty list");
        }
        
        

    }

    public int size(){
        return this.size;
    }


    @Override
    public String toString() {
        String result = "My List: [";
        
        for(int i = 0; i<size; i++){
            result += elements[i];
            if(i < size - 1){
                result += ", "; 
            }
        }
        return result + "]";
    }

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.append("Apfel");
        list.append("Marin Solo");
        list.append("Danger");

        System.out.println(list);

        list.pop();

        System.out.println(list);

        MyArrayList<Integer> intList = new MyArrayList<>();
        intList.append(1);
        intList.append(454);
        intList.append(112);
        intList.append(4445);

        System.out.println(intList);
        intList.pop();
        System.out.println(intList);
    }

}