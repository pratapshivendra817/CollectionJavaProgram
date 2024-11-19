
import java.util.HashSet;
import java.util.Set;

public class RemoveSet {

    public static void main(String[] args) {
        

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); //Duplicate
        hashSet.add("Banana"); //Duplicate

        hashSet.remove("Apple");
        System.err.println("Remove Set :" + hashSet);
    }
    
}
