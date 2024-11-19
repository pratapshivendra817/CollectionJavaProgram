import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAllOpretions {

    public static void main(String[] args) {
        

        List<String> arrayList = new ArrayList<>();



        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("apple");
        arrayList.add("cherray");
        arrayList.add("Banana");
        arrayList.add("Iphone");
      

       
        System.err.println("First Element" + arrayList.get(1));
        System.err.println("First Element" + arrayList.get(5));
        
        
        arrayList.set(0,"shivendra");
        System.err.println("Update List" + arrayList);


        arrayList.remove(1);
        System.err.println("Remove Element:" + arrayList);

    

       arrayList.stream()
         .forEach(System.out::println);
       
       
              System.out.println("Contains 'Iphone' ? " + arrayList.contains("Iphone"));
               System.out.println("Contains 'shivendra' ? " + arrayList.contains("shivendra"));
               
         
               Collections.sort(arrayList);

        System.err.println("Sort List :" + arrayList);


        arrayList.clear();

       System.out.println("Clear List :" + arrayList);
       
       
       
               
           }
       
           
}
