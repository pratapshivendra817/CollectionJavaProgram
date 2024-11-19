
import java.util.HashSet;
import java.util.Set;

public class CreateAddHashSet {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Cherry");
        hashSet.add("Apple");
        hashSet.add("Banana"); //Duplicate
        hashSet.add("Apple"); //Duplicate
        hashSet.add("Banana");
       

        System.out.println("Create + Add Set" + hashSet);
        
    }
    
}
