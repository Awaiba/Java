import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        // Roll number, name, and address to be inserted
        int rollNo = 101;
        String name = "John Doe";
        String address = "123 Main St, City";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // SQL query to insert data into 'student' table
            String sql = "INSERT INTO student (rollno, name, address) VALUES (?, ?, ?)";

            // Create a PreparedStatement object to execute the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set parameters for PreparedStatement
            preparedStatement.setInt(1, rollNo);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, address);

            // Execute the PreparedStatement to insert data into the table
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }

            // Close the connection and release resources
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
