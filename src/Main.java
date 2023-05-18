import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Establish a connection to the database
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");

            // Create an instance of the UserDAO
            UserDAO userDAO = new UserDAO(connection);

            // Create the user table if it doesn't exist
            userDAO.createUserTable();

            // Insert a user into the database
            userDAO.insertUser("John Doe", "john.doe@example.com");

            // Retrieve users from the database
            // You can add more code here to perform additional database operations

            // Close the connection
            userDAO.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
