
import java.util.ArrayList;
import java.util.List;

public class List_Iteration {

    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("apple");
        arrayList.add("cherray");
        arrayList.add("Banana");
        arrayList.add("Iphone");


       // for (String fruit : arrayList) {
         //   System.out.println(fruit);
         //}
         arrayList.stream()
         .forEach(System.out::println);


         
    }
}
    

