/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Description:
 * This use case introduces LinkedHashSet to maintain both
 * uniqueness and insertion order of bogies in the train consist.
 *
 * Problem in UC4:
 * - LinkedList maintains order but allows duplicates
 *
 * Solution in UC5:
 * - LinkedHashSet ensures:
 *      ✔ No duplicate bogies
 *      ✔ Maintains insertion order
 *
 * At this stage, the application:
 * - Creates a LinkedHashSet for bogies
 * - Adds bogies in sequence
 * - Attempts to add duplicate bogie
 * - Displays final formation preserving order
 *
 * Key Concept:
 * - LinkedHashSet combines HashSet + LinkedList behavior
 *
 * @author Developer
 * @version 1.0
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedHashSet
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        System.out.println("\nAttaching Bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        System.out.println("\nAttempting to add duplicate bogie: Sleeper");
        boolean isAdded = trainFormation.add("Sleeper");

        System.out.println("Was duplicate added? " + isAdded);

        // Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        // Total bogies
        System.out.println("\nTotal Bogies: " + trainFormation.size());
    }
}