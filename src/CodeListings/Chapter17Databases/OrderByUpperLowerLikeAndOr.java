package CodeListings.Chapter17Databases;

/*
- There are 2 common types of character fields:

* CHAR has exactly the length defined (if the character length were 10, that's the fixed length & there are spaces at the end if the length is less than 10)

* VARCHAR has a length less than or equal to 10 characters. The data is not padded with spaces

- CHAR example: SELECT * FROM Coffee WHERE ProdNum LIKE '2_-00_'

- The data 24-001 has 4 training spaces, so ProdNum LIKE '2_-00_' will return false for that record & thus the record will not be returned

- VARCHAR example: SELECT * FROM Coffee WHERE ProdNum LIKE '2_-00_'

- The data 24-001 will not have the trailing spaces 

- So ProdNum LIKE '2_-00_' will return TRUE for that record and thus the record WILL BE returned
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderByUpperLowerLikeAndOr {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		ResultSet rs1 = null;
		
		ResultSet rs2 = null;
		
		ResultSet rs3 = null;
		
		ResultSet rs4 = null;
		
		ResultSet rs5 = null;
		
		ResultSet rs6 = null;
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				) {
			
			// use the SQL's UPPER() or LOWER() functions to turn the WHERE clause's string criteria to be upper-case or lower-case
			rs1 = stmt.executeQuery("select * from coffee where UPPER(description) = 'FRENCH ROAST DARK'");
			
			System.out.println("\n\tFrench Roast Dark in the database\n");
			
			System.out.println("ProdNum" + "\t\t" + "Description" + "\t\t\t" + "Price");
			
			System.out.println("----------------------------------------------------------");
			
			while (rs1.next()) {
				System.out.println(rs1.getString("prodnum") + "\t" + rs1.getString("description") + "\t" + rs1.getDouble("price"));
			}
			
			System.out.println("\n");
			
			// use the LIKE operator with wildcard characters such as % and _ to search for a specific sub-string in the db
			rs2 = stmt.executeQuery("select * from coffee where description LIKE '%Decaf%'");
			
			System.out.println("\n\tDescriptions that contain 'Decaf' in the database\n");
			
			System.out.println("ProdNum" + "\t\t" + "Description" + "\t\t\t" + "Price");
			
			System.out.println("----------------------------------------------------------");
			
			while (rs2.next()) {
				System.out.println(rs2.getString("prodnum") + "\t" + rs2.getString("description") + "\t" + rs2.getDouble("price"));
			}
			
			System.out.println("\n");
			
			rs3 = stmt.executeQuery("select * from coffee where prodnum LIKE '2_-00_    '");
			
			System.out.println("\n\tProdNum that contain '2' at the beginning & '00' at the 4th & 5th position\n");
			
			System.out.println("ProdNum" + "\t\t" + "Description" + "\t\t\t" + "Price");
			
			System.out.println("----------------------------------------------------------");
			
			while (rs3.next()) {
				System.out.println(rs3.getString("prodnum") + "\t" + rs3.getString("description") + "\t" + rs3.getDouble("price"));
			}
			
			System.out.println("\n");
			
			// The AND operator requires that both of the search criteria be true in order for a row to be qualified as a match
			rs4 = stmt.executeQuery("select * from coffee where price > 10.00 AND Price < 14.00");
			
			System.out.println("\n\tcoffees where price > 10.00 & price < 14.00\n");
			
			System.out.println("ProdNum" + "\t\t" + "Description" + "\t\t\t" + "Price");
			
			System.out.println("----------------------------------------------------------");
			
			while (rs4.next()) {
				System.out.println(rs4.getString("prodnum") + "\t" + rs4.getString("description") + "\t" + rs4.getDouble("price"));
			}
			
			System.out.println("\n");
			
			// The OR operator requires that either of the search criteria be true in order for a row to be qualified as a match
			rs5 = stmt.executeQuery("select * from coffee where description LIKE '%Dark%' OR prodnum LIKE '16%'");
			
			System.out.println("\n\tcoffees whose descriptions contain 'Dark' or product numbers start with 16\n");
			
			System.out.println("ProdNum" + "\t\t" + "Description" + "\t\t\t" + "Price");
			
			System.out.println("----------------------------------------------------------");
			
			while (rs5.next()) {
				System.out.println(rs5.getString("prodnum") + "\t" + rs5.getString("description") + "\t" + rs5.getDouble("price"));
			}
			
			System.out.println("\n");
			
			// If you wish to sort the results of a SELECT query, use the ORDER BY clause
			rs6 = stmt.executeQuery("select * from coffee where price > 9.95 ORDER BY price DESC");
			
			System.out.println("\n\tcoffees whose prices are over $9.95, in descending order (from highest to lowest)\n");
			
			System.out.println("ProdNum" + "\t\t" + "Description" + "\t\t\t" + "Price");
			
			System.out.println("----------------------------------------------------------");
			
			while (rs6.next()) {
				System.out.println(rs6.getString("prodnum") + "\t" + rs6.getString("description") + "\t" + rs6.getDouble("price"));
			}
			
		} catch (SQLException e) {
			System.out.println("\n" + e.getMessage());
		
		} finally {
			try {
				if (rs1 != null && rs2 != null && rs3 != null && rs4 != null && rs5 != null && rs6 != null) {
					rs1.close();
					
					rs2.close();
					
					rs3.close();
					
					rs4.close();
					
					rs5.close();
					
					rs6.close();
				}
			
			} catch (SQLException e) {System.out.println("\n" + e.getMessage());} 
		}
		
	}

}
