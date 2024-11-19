import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionSet {

    public static void main(String[] args) {

         Set<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Banana", "Apple"));
        
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

    }
    
}
