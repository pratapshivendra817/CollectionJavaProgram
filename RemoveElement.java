import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {

         List<String> arrayList = new ArrayList<>();


        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("apple");
        arrayList.add("cherray");
        arrayList.add("Banana");
        arrayList.add("Iphone");

        arrayList.remove(0);
        arrayList.remove("Iphone");

        System.out.println("Remove Element :" + arrayList);
        
    }
    
}
