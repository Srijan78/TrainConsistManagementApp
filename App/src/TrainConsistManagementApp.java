/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 4: Maintain Ordered Bogie IDs (LinkedList)
 *
 * Description:
 * This use case introduces LinkedList to maintain the physical
 * sequence of bogies in a train consist.
 *
 * Problem in UC3:
 * - HashSet ensures uniqueness but does NOT maintain order
 *
 * Solution in UC4:
 * - Use LinkedList to preserve insertion order
 * - Allows efficient insertion and deletion
 *
 * At this stage, the application:
 * - Creates a LinkedList for bogies
 * - Adds bogies in sequence
 * - Inserts a bogie in the middle
 * - Removes bogies from start and end
 * - Displays the final ordered consist
 *
 * Key Concept:
 * - LinkedList maintains order and supports node-based operations
 *
 * @author Developer
 * @version 1.0
 */

import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedList for ordered bogies
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        System.out.println("\nAdding Bogies...");
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        // Display initial consist
        System.out.println("Initial Consist: " + consist);

        // Insert Pantry Car at position 2 (index starts from 0)
        System.out.println("\nInserting Pantry Car at position 2...");
        consist.add(2, "Pantry");

        // Display after insertion
        System.out.println("After Insertion: " + consist);

        // Remove first and last bogie
        System.out.println("\nRemoving first and last bogie...");
        consist.removeFirst();
        consist.removeLast();

        // Final consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : consist) {
            System.out.println(bogie);
        }

        // Total bogies
        System.out.println("\nTotal Bogies: " + consist.size());
    }
}