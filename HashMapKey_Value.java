import java.util.HashMap;
import java.util.Map;

public class HashMapKey_Value {

    public static void main(String[] args) {
        
         Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(4, "Apple"); // Duplicate Value
        hashMap.put(4, "shivendra"); // Duplicate key

        System.out.println("Contains key 2 " + hashMap.containsKey(2));
        System.out.println("Contains value 'Apple' " + hashMap.containsValue("Apple"));
        

    }
    
}
