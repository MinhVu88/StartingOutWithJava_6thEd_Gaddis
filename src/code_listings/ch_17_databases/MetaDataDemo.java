package code_listings.ch_17_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MetaDataDemo {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		ResultSet rs = null;
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				Scanner kbi = new Scanner(System.in);
				
				) {
			
			System.out.print("\nenter a SELECT statement for CoffeeDB: ");
			
			String sql = kbi.nextLine();
			
			rs = stmt.executeQuery(sql);
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			System.out.println("\n\t* the result set has " + metaData.getColumnCount() + " column(s) returned");
			
			for(int col = 1; col <= metaData.getColumnCount(); col++) {
				System.out.println("\ncol " + col + "'s name: " + metaData.getColumnName(col) + " | data type: " + metaData.getColumnTypeName(col));
			}
			
			System.out.println("\n\t* the contents of the result set row(s)\n");
			
			while (rs.next()) {
				for(int row = 1; row <= metaData.getColumnCount(); row++) {
					System.out.print(" [ " + rs.getObject(row).toString().trim() + " ] ");
				}
				
				System.out.println("\n");
			}
			
		} catch (SQLException e) {
			System.out.println("\n" + e.getMessage());
		} finally {
			try {
				if (rs != null) rs.close();
			} catch (SQLException e) {
				System.out.println("\n" + e.getMessage());
			}
		}
		
	}

}
