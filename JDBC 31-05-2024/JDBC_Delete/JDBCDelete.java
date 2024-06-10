import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCDelete {
	public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/techm?useSSL=false&requireSSL=false";
        String jdbcUsername = "root";  
        String jdbcPassword = "12345";  
        String sql = "DELETE FROM employee WHERE name = ?";
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "Priya");
            int rowsAffected = statement.executeUpdate();
            System.out.println("sucessfully deleted");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
