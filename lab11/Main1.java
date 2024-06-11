package lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
    // JDBC URL of MySQL server



    // SQL statement to create a table
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS students (" +
            "id INT PRIMARY KEY AUTO_INCREMENT," +
            "name VARCHAR(255) NOT NULL," +
            "age INT NOT NULL)";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","")) {
            // Create a statement
            Statement statement = connection.createStatement();

            // Execute the SQL statement to create the table
            statement.execute(CREATE_TABLE_SQL);

            System.out.println("Table 'students' created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



