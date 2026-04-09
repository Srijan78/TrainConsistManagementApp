/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This use case introduces custom sorting using Comparator.
 *
 * Problem in UC6:
 * - Bogie data is stored but not ordered
 * - No way to rank or compare capacities
 *
 * Solution in UC7:
 * - Create Bogie objects
 * - Store them in a List
 * - Use Comparator to sort by capacity
 *
 * At this stage, the application:
 * - Creates passenger bogie objects
 * - Stores them in a List
 * - Sorts them using Comparator (Lambda)
 * - Displays sorted bogies
 *
 * Key Concept:
 * - Comparator enables custom business-based sorting
 *
 * @author Developer
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

        // Create List of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display after sorting
        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            b.display();
        }

        // Program continues...
    }
}