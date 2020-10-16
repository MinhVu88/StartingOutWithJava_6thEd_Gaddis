package CodeListings.Chapter17Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowUnpaidOrderData {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery("select * from unpaidorder");
				
				) {
			
			System.out.println("\n\tall unpaid order-related data in the database\n");
			
			System.out.println("cust no" + "\t\t" + "prod no" + "\t\t\t\t" + "order date" + "\t\t\t\t" + "quantity" + "\t\t\t" + "cost");
			
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			
			while (rs.next()) {
				System.out.println(rs.getString("customernumber") + "\t" + 
								   rs.getString("prodnum") + "\t" + 
								   rs.getString("orderdate") + "\t" + 
								   rs.getDouble("quantity") + "\t\t" + 
								   rs.getDouble("cost"));
			}
			
		} catch (SQLException e) {System.out.println("\n" + e.getMessage());}
		
	}

}
