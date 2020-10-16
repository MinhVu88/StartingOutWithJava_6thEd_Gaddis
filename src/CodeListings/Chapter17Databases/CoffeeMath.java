package CodeListings.Chapter17Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CoffeeMath {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		ResultSet minResult = null;
		
		ResultSet maxResult = null;
		
		ResultSet avgResult = null;		
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				) {
			
			minResult = stmt.executeQuery("select MIN(price) from coffee");
			
			double min = 0.0;
			
			if (minResult.next()) min = minResult.getDouble(1);
			
			maxResult = stmt.executeQuery("select MAX(price) from coffee");
			
			double max = 0.0;
			
			if(maxResult.next()) max = maxResult.getDouble(1);
			
			avgResult = stmt.executeQuery("select AVG(price) from coffee");
			
			double avg = 0.0;
			
			if(avgResult.next()) avg = avgResult.getDouble(1);
			
			System.out.println("\n min price: $" + min + " | max price: $" + max + " | average price: $" + avg);
			
		} catch (SQLException e) {
			System.out.println("\n" + e.getMessage());
		
		} finally {
			try {
				if (minResult != null && maxResult != null && avgResult != null) {
					minResult.close();
					
					maxResult.close();
					
					avgResult.close();
				}
			
			} catch (SQLException e) {System.out.println("\n" + e.getMessage());} 
		}
		
	}

}
