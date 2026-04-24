import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final state
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);
    }
}