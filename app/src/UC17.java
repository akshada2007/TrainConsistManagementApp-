import java.util.Arrays;

public class UC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Sort using built-in method
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
    }
}