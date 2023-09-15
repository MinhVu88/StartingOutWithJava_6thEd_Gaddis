package code_listings.ch_17_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	final static String CONN = "jdbc:derby:db/CoffeeDB";
	
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(CONN)) {
			System.out.println("\nconnected to CoffeeDB");
		} catch (SQLException e) {
			System.out.println("\n" + e.getMessage());
		}
	}
}
