/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 *
 * Description:
 * This use case introduces input validation using Regular Expressions
 * to ensure Train IDs and Cargo Codes follow proper business formats.
 *
 * Problem in UC10:
 * - Previous use cases assume valid input
 * - No validation on Train IDs or Cargo Codes
 *
 * Solution in UC11:
 * - Use Pattern and Matcher to validate formats
 *
 * Key Concept:
 * - Regex enables enforcing strict format rules for data integrity
 *
 * Author: Developer
 * Version: 1.0
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===\n");

        Scanner scanner = new Scanner(System.in);

        // Regex patterns
        String trainIdPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        // Prompt user for Train ID
        System.out.print("Enter Train ID (format TRN-1234): ");
        String trainIdInput = scanner.nextLine();

        // Validate Train ID
        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Matcher trainMatcher = trainPattern.matcher(trainIdInput);
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID: " + trainIdInput);
        } else {
            System.out.println("Invalid Train ID! Must match TRN-1234 format.");
        }

        // Prompt user for Cargo Code
        System.out.print("Enter Cargo Code (format PET-XX): ");
        String cargoCodeInput = scanner.nextLine();

        // Validate Cargo Code
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCodeInput);
        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code: " + cargoCodeInput);
        } else {
            System.out.println("Invalid Cargo Code! Must match PET-XX format.");
        }

        System.out.println("\nInput validation complete. Program continues...");
        scanner.close();
    }
}