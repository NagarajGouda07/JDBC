import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Phone {

	public static void main(String[] args) {

		String url = ("jdbc:mysql://localhost:3306/phone");
		String userName = ("root");
		String password = ("Nagaraj@007");

		String insertQuery = "insert into phone values(1, 'Realme', '25000')," + "(2, 'Oppa', '45000'),"
				+ "(3, 'Mi', '55000')";

		String updateQuery1 =  "UPDATE phone SET price = '40000' WHERE id = 4";
		String updateQuery2 =  "UPDATE phone SET price = '30000' WHERE id = 5";
		String updateQuery3 = "UPDATE phone SET price = '30000' WHERE id = 6";
		String updateQuery4 = 	"UPDATE phone SET price = '30000' WHERE id = 7";

		String[] deleteQueries = { "DELETE FROM phone WHERE id = 4", "DELETE FROM phone WHERE id = 5" };

		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			statement = connection.createStatement();

			statement.executeUpdate(insertQuery);
			System.out.println("Records inserted successfully.");

			
				statement.executeUpdate(updateQuery4);
		
			System.out.println("Update queries executed successfully.");

			for (String Query : deleteQueries) {
				statement.executeUpdate(Query);
			}
			System.out.println("delete queries executed successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
