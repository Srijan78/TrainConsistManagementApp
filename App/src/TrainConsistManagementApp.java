/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This use case introduces the Java Stream API to filter
 * bogies based on business rules (capacity).
 *
 * Problem in UC7:
 * - Sorting is possible, but filtering requires verbose loops
 *
 * Solution in UC8:
 * - Use Stream API for declarative filtering
 *
 * At this stage, the application:
 * - Reuses Bogie objects
 * - Converts List to Stream
 * - Applies filter condition (capacity > 60)
 * - Collects filtered results into a new list
 * - Displays filtered bogies
 *
 * Key Concept:
 * - Streams enable clean, readable, functional-style operations
 *
 * @author Developer
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create List of bogies (reuse from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC 3 Tier", 64));

        // Display all bogies
        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Filter bogies with capacity > 60 using Stream API
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            b.display();
        }

        // Program continues...
    }
}