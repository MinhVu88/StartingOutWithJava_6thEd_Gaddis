package CodeListings.Chapter17Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BuildEntertainmentDB {

	public static void main(String[] args) {
		
		final String DB_URL = "jdbc:derby:EntertainmentDB;create=true";
		
		try (
				Connection conn = DriverManager.getConnection(DB_URL);
				
				Statement stmt = conn.createStatement();
				
				) {
			
			stmt.execute("create table DVD (Title CHAR(25), Minutes INTEGER, Price DOUBLE)");
			
		} catch (SQLException e) {System.out.println("\n" + e.getMessage());}
		
		System.out.println("\n\tDONE");
		
	}

}
