public class UC18 {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Search key
        String searchKey = "BG309";

        // Step 3: Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // early termination
            }
        }

        // Step 4: Output result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }
    }
}