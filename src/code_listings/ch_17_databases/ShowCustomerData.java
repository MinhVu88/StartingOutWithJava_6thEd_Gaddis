package code_listings.ch_17_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowCustomerData {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery("select * from customer");
				
				) {
			
			System.out.println("\n\tall customer-related data in the database\n");
			
			System.out.println("cust no" + "\t\t" + "name" + "\t\t\t\t" + "address" + "\t\t\t\t" + "city" + "\t\t\t" + "state" + "\t\t" + "zip");
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
			
			while (rs.next()) {
				System.out.println(rs.getString("customernumber") + "\t" + 
							       rs.getString("name") + "\t" + 
							       rs.getString("address") + "\t" + 
								   rs.getString("city") + "\t\t" + 
							       rs.getString("state") + "\t\t" + 
								   rs.getString("zip"));
			}
			
		} catch (SQLException e) {System.out.println("\n" + e.getMessage());}
		
	}

}
