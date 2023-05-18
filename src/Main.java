import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define the command to execute the Python script
        List<String> command = new ArrayList<>();
        command.add("python");
        command.add("/Users/charalampos/Desktop/Charalampos_testing/java db with sqlite/Java-db-with-SQLite/src/database.py");

        // Create the process builder and start the process
        ProcessBuilder pb = new ProcessBuilder(command);
        try {
            Process process = pb.start();

            // Wait for the process to complete and get the exit code
            int exitCode = process.waitFor();

            // Check the exit code to determine if the Python script executed successfully
            if (exitCode == 0) {
                System.out.println("Python script executed successfully");
            } else {
                System.out.println("Python script execution failed");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
