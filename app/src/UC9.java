class Bogie {
    String name;
    String type; // Passenger or Goods
    int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}
import java.util.*;
        import java.util.stream.Collectors;

public class UC9 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 54));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Cargo Rectangular", "Goods", 100));
        bogies.add(new Bogie("Cargo Cylindrical", "Goods", 120));
        bogies.add(new Bogie("Sleeper", "Passenger", 72)); // duplicate type for grouping

        // Group by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Display grouped data
        System.out.println("Grouped Bogies by Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List Size: " + bogies.size());
    }
}