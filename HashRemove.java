
import java.util.HashMap;

public class HashRemove {


public static void main(String[] args) {
    

    HashMap<Integer, String> hashMap = new HashMap<>();

    hashMap.put(1,"Apple");
    hashMap.put(2, "Banana");
    hashMap.put(3, "Cherry");
    hashMap.put(4, "Apple"); // Duplicate Value
    hashMap.put(4, "shivendra"); // Duplicate key


    System.out.println("Remove key/value : " + hashMap);

      hashMap.remove(2);
    //hashMap.remove("Cherry");
    System.out.println("Remove using key :" + hashMap);
   // System.out.println("Remove using value :" + hashMap);





}
    
}
