import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckEqualitySet {

    public static void main(String[] args) {
        
        // Set<String> hashSet = new HashSet<>();

        // hashSet.add("Cherry");
        // hashSet.add("Apple");
        // hashSet.add("Banana"); //Duplicate
        // hashSet.add("Apple"); //Duplicate
        // hashSet.add("Banana");

        Set<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Banana", "Apple"));

        System.out.println("Are sets equal? " + set1.equals(set2)); // true




    }
    
}
