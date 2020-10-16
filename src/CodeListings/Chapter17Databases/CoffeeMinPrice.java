package CodeListings.Chapter17Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CoffeeMinPrice {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		ResultSet rs = null;
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				Scanner kbi = new Scanner(System.in);
				
				) {
			
			System.out.print("\nthe min coffee price: $");
			
			double minPrice = kbi.nextDouble();
			
			int matchedCoffee = 0;
			
			// convert minPrice into a string & then concatenate it to the select statement
			rs = stmt.executeQuery("select * from coffee where price >= " + Double.toString(minPrice));
			
			System.out.println("\n\tall coffee-related data in the database\n");
			
			System.out.println("ProdNum" + "\t\t" + "Description" + "\t\t\t" + "Price");
			
			System.out.println("----------------------------------------------------------");
			
			while (rs.next()) {
				System.out.println(rs.getString("prodnum") + "\t" + rs.getString("description") + "\t" + rs.getDouble("price"));
				
				matchedCoffee++;
			}
			
			System.out.println("\n=> " + matchedCoffee + " coffees found");
			
		} catch (SQLException e) {
			System.out.println("\n" + e.getMessage());
		
		} finally {
			try {
				if (rs != null) rs.close();
			
			} catch (SQLException e) {System.out.println("\n" + e.getMessage());} 
		}
		
	}

}
