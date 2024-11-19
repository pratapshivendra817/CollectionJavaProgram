
import java.util.HashMap;
import java.util.Map;

public class IteratMap {

    public static void main(String[] args) {
        
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(4, "Apple"); // Duplicate Value
        hashMap.put(4, "shivendra"); // Duplicate key


        hashMap.forEach((key, value) -> System.out.println("Key :"+ key + ",value :" + value));
       


   

    }
    
}
