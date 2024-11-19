
import java.util.ArrayList;
import java.util.List;

public class CheckElement {

    public static void main(String[] args) {
        
    

    List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("apple");
        arrayList.add("cherray");
        arrayList.add("Banana");
        arrayList.add("Iphone");


        System.out.println("Contains 'Iphone' ? " + arrayList.contains("Iphone"));
        System.out.println("Contains 'shivendra' ? " + arrayList.contains("shivendra"));
    
}
}
