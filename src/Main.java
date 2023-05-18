import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Provide the full path to the Python executable
            String pythonExecutable = "/usr/bin/python3"; // Replace with the correct path to your Python executable

            // Construct the command to execute the Python script
            String[] command = {pythonExecutable, "/Users/charalampos/Desktop/Charalampos_testing/java db with sqlite/Java-db-with-SQLite/src/database.py"};

            // Create the process builder
            ProcessBuilder pb = new ProcessBuilder(command);

            // Start the process
            Process process = pb.start();

            // Wait for the process to complete
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Python script executed successfully.");
            } else {
                System.out.println("Python script execution failed with exit code: " + exitCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
