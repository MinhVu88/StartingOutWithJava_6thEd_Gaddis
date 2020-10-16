package CodeListings.Chapter17Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCustomerTable {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				) {
			
			stmt.execute("create table Customer (" + 
												  "CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
												  "Name CHAR(25), " +
												  "Address CHAR(25), " +
												  "City CHAR(12), " +
												  "State CHAR(2), " +
												  "Zip CHAR(5)" +
												")");
			
			int newRow1 = stmt.executeUpdate("insert into Customer values ('101', 'Downtown Cafe', '17 N. Main Street', 'Asheville', 'NC', '55515')");
			
			int newRow2 = stmt.executeUpdate("insert into Customer values ('102', 'Main Street Grocery', '110 E. Main Street', 'Canton', 'NC', '55555')");
			
			int newRow3 = stmt.executeUpdate("insert into Customer values ('103', 'The Coffee Place', '101 Center Plaza', 'Waynesville', 'NC', '55516')");
			
			if (newRow1 == 1 && newRow2 == 1 && newRow3 == 1) System.out.println("\nthe Customer table has been created & new rows have been inserted into it");
			
		} catch (SQLException e) {System.out.println("\n" + e.getMessage());}
		
	}

}
