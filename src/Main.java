import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Establish a connection to the database
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");

            // Create a UserDAO object
            UserDAO userDAO = new UserDAO(connection);

            // Create the user table
            userDAO.createUserTable();

            // Insert a user
            userDAO.insertUser("John Doe", "john@example.com");

            // Perform more database operations as needed

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
