import java.util.ArrayList;
import java.util.List;

public class AccessElement {
    
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("apple");
        arrayList.add("cherray");
        arrayList.add("Banana");
        arrayList.add("Iphone");

        System.err.println("First Element :" + arrayList.get(1));
        System.err.println("Second Element :" + arrayList.get(3));
       
        
    }
}
