
import java.util.ArrayList;
import java.util.List;

public class UpdateElement {
    

    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("apple");
        arrayList.add("cherray");
        arrayList.add("Banana");
        arrayList.add("Iphone");

        System.err.println("original List : " + arrayList);

        arrayList.set(0, "Mobile");
        arrayList.set(5, "Apple");

        System.err.println("Update List : " + arrayList);



    }
}
