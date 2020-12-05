package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	Connection con = null;
	

	public static void main(String[] args) {
		String MYSQL = "jdbc:mysql://localhost:3306/VehicleDb?allowPublicKeyRetrieval=true&useSSL=false";
		String databaseUserName = "root";
		String databasePassword = "Sigmoid123$";
		Connection con = null;
		try {
			con = DriverManager.getConnection(MYSQL, databaseUserName, databasePassword);
			if (con != null) {
				System.out.println("Database connection is successful");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}
	
}
