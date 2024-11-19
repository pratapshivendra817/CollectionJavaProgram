import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
   

        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.addFirst("Banana");
        fruits.addLast("Cherry");
        fruits.add(1, "Blueberry");

        System.out.println("Initial List: " + fruits);
    }
}
    