package code_listings.ch_17_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CoffeeDB {

	public static void main(String[] args) {

		final String DB_URL = "jdbc:derby:CoffeeDB;create=true";

		try (Connection conn = DriverManager.getConnection(DB_URL)) {
			
			dropTables(conn);

			buildCoffeeTable(conn);

			buildCustomerTable(conn);

			buildUnpaidOrderTable(conn);

		} catch (SQLException e) {System.out.println("\nERROR: " + e.getMessage());}
	}

	public static void dropTables(Connection conn) {
		
		System.out.println("\nChecking for existing tables");

		try (Statement stmt  = conn.createStatement()) {
			
			try {
				
				stmt.execute("DROP TABLE Unpaidorder");
				
				System.out.println("\nUnpaidOrder table dropped");
			
			} catch(SQLException e) {}

			try {
				
				stmt.execute("DROP TABLE Customer");
				
				System.out.println("\nCustomer table dropped");				
			
			} catch(SQLException e) {}

			try {
				
				stmt.execute("DROP TABLE Coffee");
				
				System.out.println("\nCoffee table dropped");
			
			} catch(SQLException e) {}
		
		} catch(SQLException e) {System.out.println("\nERROR: " + e.getMessage());}
	}

	public static void buildCoffeeTable(Connection conn) {
		
		try (Statement stmt = conn.createStatement()) {
			
			stmt.execute("CREATE TABLE Coffee (Description CHAR(25), ProdNum CHAR(10) NOT NULL PRIMARY KEY, Price DOUBLE)");

			// Insert row #1.
			stmt.execute("INSERT INTO Coffee VALUES ('Bolivian Dark', '14-001', 8.95)" );

			// Insert row #1.
			stmt.execute("INSERT INTO Coffee VALUES ('Bolivian Medium', '14-002', 8.95)");

			// Insert row #2.
			stmt.execute("INSERT INTO Coffee VALUES ('Brazilian Dark', '15-001', 7.95)");

			// Insert row #3.
			stmt.execute("INSERT INTO Coffee VALUES ('Brazilian Medium', '15-002', 7.95)");

			// Insert row #4.
			stmt.execute("INSERT INTO Coffee VALUES ('Brazilian Decaf', '15-003', 8.55)" );

			// Insert row #5.
			stmt.execute("INSERT INTO Coffee VALUES ('Central American Dark', '16-001', 9.95)");

			// Insert row #6.
			stmt.execute("INSERT INTO Coffee VALUES ('Central American Medium', '16-002', 9.95)");

			// Insert row #1.
			stmt.execute("INSERT INTO Coffee VALUES ('Sumatra Dark', '17-001', 7.95)");

			// Insert row #7.
			stmt.execute("INSERT INTO Coffee VALUES ('Sumatra Decaf', '17-002', 8.95)");

			// Insert row #8.
			stmt.execute("INSERT INTO Coffee VALUES ('Sumatra Medium', '17-003', 7.95)");

			// Insert row #9.
			stmt.execute("INSERT INTO Coffee VALUES ('Sumatra Organic Dark', '17-004', 11.95)");

			// Insert row #10.
			stmt.execute("INSERT INTO Coffee VALUES ('Kona Medium', '18-001', 18.45)");

			// Insert row #11.
			stmt.execute("INSERT INTO Coffee VALUES ('Kona Dark', '18-002', 18.45)");

			// Insert row #12.
			stmt.execute("INSERT INTO Coffee VALUES ('French Roast Dark', '19-001', 9.65)");

			// Insert row #13.
			stmt.execute("INSERT INTO Coffee VALUES ('Galapagos Medium', '20-001', 6.85)");

			// Insert row #14.
			stmt.execute("INSERT INTO Coffee VALUES ('Guatemalan Dark', '21-001', 9.95)");

			// Insert row #15.
			stmt.execute("INSERT INTO Coffee VALUES ('Guatemalan Decaf', '21-002', 10.45)");

			// Insert row #16.
			stmt.execute("INSERT INTO Coffee VALUES ('Guatemalan Medium', '21-003', 9.95)");

			System.out.println("\nCoffee table created");
		
		} catch (SQLException e) {System.out.println("\nERROR: " + e.getMessage());}
	}

	public static void buildCustomerTable(Connection conn) {
		
		try (Statement stmt = conn.createStatement()) {
			
			stmt.execute("CREATE TABLE Customer" +
												"( CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
												"  Name CHAR(25),"    +
												"  Address CHAR(25)," +
												"  City CHAR(12),"    +
												"  State CHAR(2),"    +
												"  Zip CHAR(5) )");

			// Add some rows to the new table.
			stmt.executeUpdate("INSERT INTO Customer VALUES ('101', 'Downtown Cafe', '17 N. Main Street', 'Asheville', 'NC', '55515')");

			stmt.executeUpdate("INSERT INTO Customer VALUES ('102', 'Main Street Grocery', '110 E. Main Street', 'Canton', 'NC', '55555')");

			stmt.executeUpdate("INSERT INTO Customer VALUES ('103', 'The Coffee Place', '101 Center Plaza', 'Waynesville', 'NC', '55516')");

			System.out.println("\nCustomer table created");
		
		} catch (SQLException e) {System.out.println("\nERROR: " + e.getMessage());}
	}

	public static void buildUnpaidOrderTable(Connection conn) {
		
		try (Statement stmt = conn.createStatement()) {
			
			stmt.execute("CREATE TABLE UnpaidOrder " +
													"( CustomerNumber CHAR(10) NOT NULL REFERENCES Customer(CustomerNumber), "+
													"  ProdNum CHAR(10) NOT NULL REFERENCES Coffee(ProdNum),"+
													"  OrderDate CHAR(10),"+
													"  Quantity DOUBLE,"+
													"  Cost DOUBLE )");

			System.out.println("\nUnpaidOrder table created");
		
		} catch (SQLException e) {System.out.println("\nERROR: " + e.getMessage());}
	}

}


