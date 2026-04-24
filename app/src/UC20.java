public class UC20 {

    public static void main(String[] args) {

        System.out.println("=== UC20: Exception Handling During Search ===");

        // Case 1: Empty array (to trigger exception)
        String[] bogieIds = {};

        String searchKey = "BG101";

        try {
            boolean result = searchBogie(bogieIds, searchKey);

            if (result) {
                System.out.println("Bogie ID " + searchKey + " found.");
            } else {
                System.out.println("Bogie ID " + searchKey + " NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }

    // Search method with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // 🔴 FAIL-FAST CHECK
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        // Linear search (you can reuse binary if sorted)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}