package code_listings.ch_17_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowDescriptionsAndPrices {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery("select description, price from coffee");
				
				) {
			
			System.out.println("\n\tcoffee types & their prices in the database\n");
			
			System.out.println("Description" + "\t\t\t" + "Price");
			
			System.out.println("--------------------------------------------");
			
			while (rs.next()) {
				System.out.println(rs.getString("description") + "\t" + rs.getDouble("price"));
			}
			
		} catch (SQLException e) {System.out.println("\n" + e.getMessage());}
		
	}

}
