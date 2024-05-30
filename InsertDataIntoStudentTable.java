import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataIntoStudentTable {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        // SQL query to insert data into student table
        String insertQuery = "INSERT INTO student (rollno, name, address) VALUES (101, 'John Doe', '123 Main St')";

        try (
            // Establishing connection to MySQL server
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            // Creating statement object for executing SQL queries
            Statement statement = connection.createStatement()
        ) {
            // Executing the insert query
            int rowsAffected = statement.executeUpdate(insertQuery);
            
            // Checking if insertion was successful
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data into the table.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
