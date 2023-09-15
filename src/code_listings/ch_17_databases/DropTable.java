package code_listings.ch_17_databases;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				) {
			// drop the tables in reverse order in which they were created (Coffee -> Customer -> UnpaidOrder)
			//stmt.execute("DROP TABLE UnpaidOrder");
			
			stmt.execute("DROP TABLE Customer");
			
			//stmt.execute("DROP TABLE Coffee");
			
			System.out.println("\n\ttable(s) have been removed from CoffeeDB successfully");
		
		} catch (SQLException e) {System.out.println("\nERROR: " + e.getMessage());}
		
	}

}
