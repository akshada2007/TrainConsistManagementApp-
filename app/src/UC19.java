import java.util.Arrays;

public class UC19 {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        // Step 1: Unsorted array (to test sorting precondition)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort the array (MANDATORY for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogies: " + Arrays.toString(bogieIds));

        // Step 3: Search key
        String searchKey = "BG309";

        // Step 4: Binary Search Logic
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        // Step 5: Output
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }
    }
}