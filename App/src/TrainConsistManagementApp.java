import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display current state of train
        System.out.println("Current Train Consist: " + trainConsist);

        // Program continues...
    }
}