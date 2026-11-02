
import java.util.*;

public class Q1HashSet {

    public static void main(String args[]) {

        // Create three Sets
        Set<String> uniqueNames = new HashSet<>();
        Set<String> insertionOrderNames = new LinkedHashSet<>();
        Set<String> sortedNames = new TreeSet<>();

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        sc.nextLine(); 

        
        System.out.println("Enter the student names:");

        for (int i = 0; i < n; i++) {

            String name = sc.nextLine();

            uniqueNames.add(name);
            insertionOrderNames.add(name);
            sortedNames.add(name);
        }

        
        System.out.println("\nUnique names: " + uniqueNames);

        System.out.println("Names in insertion order: " + insertionOrderNames);

        System.out.println("Names in sorted order: " + sortedNames);

        sc.close();
    }
}
