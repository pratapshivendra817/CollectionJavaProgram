import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<>();


        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("apple");
        arrayList.add("cherray");
        arrayList.add("Banana");
        arrayList.add("Iphone");

        Collections.sort(arrayList);

        System.out.println("Sort List :" + arrayList);




    }
    
}
