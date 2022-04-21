package bakery_db;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
public class Database1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/cupcake"; 
		String username = "root"; String password = "2569"; 
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) 
		{ 
			String sql = "SELECT * FROM Users"; 
			Statement statement = conn.createStatement(); 
			ResultSet result = statement.executeQuery(sql); 
			int count = 0; 
			while (result.next()){ 
				String name = result.getString(2); 
				//String pass = result.getString(3); 
				//String fullname = result.getString("fullname"); 
				//String email = result.getString("email"); 
				//String output = "User #%d: %s - %s - %s - %s"; 
				System.out.println(String.format(name)); 
			} 
		} catch (SQLException ex) { ex.printStackTrace(); }
	}

}
