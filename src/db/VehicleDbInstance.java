package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VehicleDbInstance {

	public static void main(String[] args) {
		Statement stmt = null;
		ResultSet rs = null;
		Statement stmt1 = null;
		ResultSet rs1 = null;
		
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
		
		

		try {
			stmt = con.createStatement();
			stmt1 = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM VehicleDb.VehicleModel");
			rs1 = stmt1.executeQuery("SELECT * FROM VehicleDb.VehicleRecord");

			while (rs.next()) {
					System.out.println(rs.getString("ID") + "\t" + 
								rs.getString("make") + "\t" +
								rs.getString("year") + "\t" +
								rs.getString("model"));
				}
			System.out.println("=====================================================");
			
			while (rs1.next()) {
				System.out.println(rs1.getString(1) + "\t" + 
							rs1.getString(2) + "\t" +
							rs1.getString(3) + "\t" +
							rs1.getString(4)+ "\t" +
							rs1.getString(5) + "\t" +
							rs1.getString(6));
							
			}
		
		}
		catch (SQLException ex) {
			 System.out.println("SQLException: " + ex.getMessage());
			 System.out.println("SQLState: " + ex.getSQLState());
			 System.out.println("VendorError: " + ex.getErrorCode());
		}
		
	}

}
