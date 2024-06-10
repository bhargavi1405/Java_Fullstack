import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCUpdate {
	public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/techm?useSSL=false&requireSSL=false";
        String jdbcUsername = "root";  
        String jdbcPassword = "12345";
        String sql = "UPDATE employee SET name=? WHERE empid = ?";

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, "Priya");
            statement.setString(2, "123");
            int rowsAffected = statement.executeUpdate();
            System.out.println("updated sucessfully");

            
            statement.setString(1, "Rohi");
            statement.setString(2, "124");
            rowsAffected = statement.executeUpdate();
            System.out.println("updated sucessfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
