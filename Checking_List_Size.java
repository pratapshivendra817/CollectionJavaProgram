import java.util.ArrayList;
import java.util.List;

public class Checking_List_Size {

    public static void main(String[] args) {
        
       
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("apple");
        arrayList.add("cherray");
        arrayList.add("Banana");
        arrayList.add("Iphone");

        System.err.println("List Size:" + arrayList.size());
    }

    
}
