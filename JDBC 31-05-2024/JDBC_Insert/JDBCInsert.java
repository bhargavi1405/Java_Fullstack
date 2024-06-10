import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCInsert {
	private static final String url = "jdbc:mysql://localhost:3306/techm?useSSL=false";
    private static final String user = "root"; 
    private static final String password = "12345"; 
    
    private static Connection connection;

    public static void main(String[] args) {
        try {
            
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) 
            {
                System.out.println("Connected to the database!");
            }
            String sql = "INSERT INTO employee (name, empid) VALUES (?, ?)";            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"Navy");
            preparedStatement.setString(2,"123");
            preparedStatement.executeUpdate(); 
            preparedStatement.setString(1,"Rishi");
            preparedStatement.setString(2,"124");
            preparedStatement.executeUpdate(); 
            System.out.println("Records inserted successfully!");

        }
        catch (SQLException e) 
        {
           e.printStackTrace();
            }
        }
}
