/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This use case introduces HashMap to associate each bogie
 * with its seating or load capacity.
 *
 * Problem in UC5:
 * - Only bogie names are stored
 * - No way to associate capacity or attributes
 *
 * Solution in UC6:
 * - Use HashMap to store bogie (key) → capacity (value)
 *
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts bogie capacity data
 * - Iterates using entrySet()
 * - Displays bogie with its capacity
 *
 * Key Concept:
 * - HashMap stores data as key–value pairs
 * - Enables fast lookup and structured data modeling
 *
 * @author Developer
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie capacities
        System.out.println("\nAdding Bogie Capacities...");
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100);

        // Display bogie-capacity mapping
        System.out.println("\nBogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example lookup
        System.out.println("\nCapacity of Sleeper: "
                + bogieCapacityMap.get("Sleeper"));

        // Program continues...
    }
}