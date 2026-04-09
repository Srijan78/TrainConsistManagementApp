/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Description:
 * This use case introduces the Set interface and HashSet
 * implementation to ensure that all bogie IDs in the train
 * consist are unique.
 *
 * Problem in UC2:
 * - List allows duplicate bogie IDs
 * - Duplicate IDs can lead to incorrect train composition
 *
 * Solution in UC3:
 * - Use HashSet to enforce uniqueness automatically
 *
 * At this stage, the application:
 * - Creates a Set of bogie IDs
 * - Attempts to add duplicate bogies
 * - Demonstrates how duplicates are rejected
 * - Displays the final unique bogie list
 *
 * Key Concept:
 * - Set does NOT allow duplicates
 * - HashSet provides fast insertion and lookup
 *
 * @author Developer
 * @version 1.0
 */

import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs
        System.out.println("\nAdding Bogie IDs...");

        boolean added1 = bogieIds.add("BG101");
        boolean added2 = bogieIds.add("BG102");
        boolean added3 = bogieIds.add("BG103");

        // Attempt to add duplicate
        boolean addedDuplicate = bogieIds.add("BG101");

        // Display results
        System.out.println("BG101 added: " + added1);
        System.out.println("BG102 added: " + added2);
        System.out.println("BG103 added: " + added3);
        System.out.println("BG101 added again (duplicate): " + addedDuplicate);

        // Final Set contents
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Display total count
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}