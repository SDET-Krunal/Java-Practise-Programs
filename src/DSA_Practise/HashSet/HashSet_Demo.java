package DSA_Practise.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        // Insertion
        hs.add(3);
        hs.add(1);
        hs.add(2);

        // Print
        System.out.println("HashSet values :: " + hs);

        // Size
        System.out.println("Size of HashSet :: " + hs.size());

        // Search - contains
        if (hs.contains(2)) {
            System.out.println("HashSet contains 2.");
        }

        // Search - Not contains
        if (!hs.contains(5)) {
            System.out.println("HashSet does not contain 5");
        }

        // Deletion
        hs.remove(3);

        if (!hs.contains(3)) {
            System.out.println("3 has deleted successfully from HashSet.");
        }

        // Check empty or not
        if (!hs.isEmpty()) {
            System.out.println("HashSet is not Empty.");
        }

        // Iterate HashSet elements
        Iterator<Integer> it = hs.iterator();

        System.out.println("HashSet values after iterating");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
