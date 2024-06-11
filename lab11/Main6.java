package lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main6 {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // SQL statement to insert a new student record
        String insertSql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

        try (
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            
            // Creating a PreparedStatement object for SQL execution
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql)
        ) {
            // Setting the parameters for the PreparedStatement
            preparedStatement.setInt(1, 2); // id
            preparedStatement.setString(2, "Jane Smith"); // name
            preparedStatement.setInt(3, 22); // age
            
            // Executing the PreparedStatement to insert the student record
            int rowsInserted = preparedStatement.executeUpdate();
            
            // Checking if the insertion was successful
            if (rowsInserted > 0) {
                System.out.println("A new student record was inserted successfully.");
            } else {
                System.out.println("Failed to insert a new student record.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

