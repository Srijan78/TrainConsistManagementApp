/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 10: Count Total Seats in Train (reduce)
 *
 * Description:
 * This use case introduces aggregation using Stream API's reduce()
 * to calculate the total seating capacity of all passenger bogies.
 *
 * Problem in UC9:
 * - Grouping organizes bogies but provides no numeric insight
 *
 * Solution in UC10:
 * - Use stream().map().reduce() to sum capacities
 *
 * At this stage, the application:
 * - Reuses the Bogie list
 * - Maps each Bogie to its capacity
 * - Reduces capacities to a total value
 * - Displays total seating capacity
 *
 * Key Concept:
 * - Functional aggregation using Streams and reduce()
 *
 * Author: Developer
 * Version: 1.0
 */

import java.util.ArrayList;
import java.util.List;

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

        // Display all bogies
        System.out.println("\nAll Bogies:");
        bogies.forEach(Bogie::display);

        // Calculate total seating capacity (only Passenger bogies)
        int totalSeats = bogies.stream()
                .filter(b -> "Passenger".equals(b.getType()))
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // Display total seating capacity
        System.out.println("\nTotal Seating Capacity (Passenger Bogies): " + totalSeats);

        // Program continues...
    }
}