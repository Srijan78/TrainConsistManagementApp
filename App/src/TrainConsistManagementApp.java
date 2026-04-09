/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 *
 * Description:
 * This use case introduces grouping of bogies into categories
 * using Java Stream Collectors.
 *
 * Problem in UC8:
 * - Filtering gives only a flat list
 * - No categorization or structured grouping
 *
 * Solution in UC9:
 * - Use Collectors.groupingBy() to organize bogies by type
 *
 * At this stage, the application:
 * - Reuses Bogie objects
 * - Converts List to Stream
 * - Applies groupingBy() classification
 * - Stores result in Map<Type, List<Bogie>>
 * - Displays grouped bogies
 *
 * Key Concept:
 * - groupingBy transforms flat data into structured categories
 *
 * @author Developer
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    private String name;
    private int capacity;
    private String type; // Passenger / Goods

    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println("Bogie: " + name +
                " | Capacity: " + capacity +
                " | Type: " + type);
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo Rectangular", 100, "Goods"));
        bogies.add(new Bogie("Cargo Cylindrical", 120, "Goods"));

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Display grouped result
        System.out.println("\nGrouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                b.display();
            }
            System.out.println();
        }

        // Program continues...
    }
}