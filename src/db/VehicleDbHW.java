package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class VehicleDbHW {

	public static void main(String[] args) {
		Statement stmt = null;
		ResultSet rs = null;
		Statement stmt1 = null;
		ResultSet rs1 = null;
		Statement stmt2 = null;
		ResultSet rs2 = null;
		Statement stmt3 = null;
		ResultSet rs3 = null;
		Statement stmt4 = null;
		ResultSet rs4 = null;
		Statement stmt5 = null;
		ResultSet rs5 = null;
		Statement stmt6 = null;
		ResultSet rs6 = null;
		Statement stmt7 = null;
		ResultSet rs7 = null;
		Statement stmt8 = null;
		ResultSet rs8 = null;
		Statement stmt11 = null;
		ResultSet rs11 = null;


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
		//Print all the information from 2 tables or combined 2 tables.
		/*
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM VehicleDb.VehicleModel, VehicleDb.VehicleRecord WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID"
					);
			while (rs.next()) {
				System.out.println(rs.getString("ID") + "\t" + 
						rs.getString("make") + "\t" +
						rs.getString("year") + "\t" +
						rs.getString("model") + "\t" +
						rs.getString("ID") + "\t" +
						rs.getString("mileage") + "\t" +
						rs.getString("vehicleCondition") + "\t" +
						rs.getString("color") + "\t" +
						rs.getString("problem") + "\t" +
						rs.getString("VehicleModel_ID"));
			}
		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		 */
		//Print all the information of vehicles in garage with color= black
		/*	try {
			stmt1 = con.createStatement();
			rs1 = stmt1.executeQuery("SELECT * FROM VehicleDb.VehicleModel, VehicleDb.VehicleRecord WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID AND color = \"black\"");
			while (rs1.next()) {
				System.out.println(rs1.getString("ID") + "\t" + 
						rs1.getString("make") + "\t" +
						rs1.getString("year") + "\t" +
						rs1.getString("model") + "\t" +
						rs1.getString("ID") + "\t" +
						rs1.getString("mileage") + "\t" +
						rs1.getString("vehicleCondition") + "\t" +
						rs1.getString("color") + "\t" +
						rs1.getString("problem") + "\t" +
						rs1.getString("VehicleModel_ID"));

			}
		}	
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} */

		//Print all the information of vehicle in garage with mileage more than 100 thousand.
		/*try {
			stmt2 = con.createStatement();
			rs2 = stmt2.executeQuery("SELECT * FROM VehicleDb.VehicleModel, VehicleDb.VehicleRecord WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID AND mileage > 100000");
			while (rs2.next()) {
				System.out.println(rs2.getString("ID") + "\t" + 
						rs2.getString("make") + "\t" +
						rs2.getString("year") + "\t" +
						rs2.getString("model") + "\t" +
						rs2.getString("ID") + "\t" +
						rs2.getString("mileage") + "\t" +
						rs2.getString("vehicleCondition") + "\t" +
						rs2.getString("color") + "\t" +
						rs2.getString("problem") + "\t" +
						rs2.getString("VehicleModel_ID"));

			}
		}	
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}*/

		//	Print  the num of vehicle in garage of different make (grouped together by make)
		/*try {
			stmt3 = con.createStatement();
			rs3 = stmt3.executeQuery("SELECT COUNT(VehicleRecord.ID) AS num, make  FROM VehicleDb.VehicleRecord, VehicleDb.VehicleModel WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID GROUP BY make");
			while (rs3.next()) {
				System.out.println(rs3.getString("num") + "\t" + 
						rs3.getString("make"));

			}
		}	
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}*/

		//	print all the information of vehicle in the garage of year more than 2016
		/*try {
			stmt4 = con.createStatement();
			rs4= stmt4.executeQuery("SELECT * FROM VehicleDb.VehicleModel, VehicleDb.VehicleRecord WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID AND year > 2016");
			while (rs4.next()) {
				System.out.println(rs4.getString("ID") + "\t" + 
						rs4.getString("make") + "\t" +
						rs4.getString("year") + "\t" +
						rs4.getString("model") + "\t" +
						rs4.getString("ID") + "\t" +
						rs4.getString("mileage") + "\t" +
						rs4.getString("vehicleCondition") + "\t" +
						rs4.getString("color") + "\t" +
						rs4.getString("problem") + "\t" +
						rs4.getString("VehicleModel_ID"));

			}
		}	
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}*/
		//Print the num of vehicle in the garage of year more than 2016
		/*try {
			stmt5 = con.createStatement();
			rs5= stmt5.executeQuery("SELECT COUNT(VehicleRecord.ID) AS num, year FROM VehicleDb.VehicleModel, VehicleDb.VehicleRecord WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID AND year > 2016 GROUP BY year ");
			while (rs5.next()) {
				System.out.println(rs5.getString("num") + "\t" + 
						rs5.getString("year"));

			}
		}	
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}*/

		//	print the information regarding make, mileage , problem	of the vehicles with mileage more than 50000 and problem= no problem.
		/*try {
			stmt6 = con.createStatement();
			rs6 = stmt6.executeQuery("SELECT make, mileage, problem FROM VehicleDb.VehicleModel, VehicleDb.VehicleRecord WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID AND mileage > 50000 AND problem = \"no problem\"");

			while (rs6.next()) {
				System.out.println(
						rs6.getString("make") + "\t" +
						rs6.getString("mileage") + "\t" +		
						rs6.getString("problem"));
			}
		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}*/
		//	print the number of vehicles based on the vehicle condition	
		/*try {
			stmt7 = con.createStatement();
			rs7 = stmt7.executeQuery("SELECT COUNT(VehicleRecord.ID) AS num, vehicleCondition FROM VehicleDb.VehicleModel, VehicleDb.VehicleRecord WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID GROUP BY vehicleCondition");
			while (rs7.next()) {
				System.out.println(rs7.getString("num") + "\t" + 
						rs7.getString("vehicleCondition"));			
			}
		}	
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		 */
		//print the num of vehicles based on model for the make honda
		//		try {
		//			stmt8 = con.createStatement();
		//			rs8 = stmt8.executeQuery("SELECT COUNT(VehicleRecord.ID) AS num, model FROM VehicleDb.VehicleModel, VehicleDb.VehicleRecord WHERE VehicleRecord.VehicleModel_ID = VehicleModel.ID AND make = \"Honda\" GROUP BY model");
		//			while (rs8.next()) {
		//				System.out.println(rs8.getString("num") + "\t" + 
		//						rs8.getString("model"));			
		//			}
		//		}	
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}


		//		Beginning to insert in the database

		//		try {
		//			stmt1 = con.createStatement();
		//			
		//			String sql = "INSERT INTO VehicleDb.VehicleModel(ID, make, year, model) VALUES (8, \"Audi\",2017, \"Q5\")";
		//			stmt1.executeUpdate(sql);
		//			
		//		}
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}
		//		

		//		Scanner scr = new Scanner(System.in);
		//		
		//		System.out.println("Enter the ID");
		//		int id = scr.nextInt();
		//		
		//		System.out.println("Enter the make");
		//		String make = scr.next();
		//		
		//		System.out.println("Enter the year");
		//		int year = scr.nextInt();
		//		
		//		System.out.println("Enter the model");
		//		String model = scr.next();
		//		
		//		try {
		//			stmt1 = con.createStatement();
		//			
		//			String sql = "INSERT INTO VehicleDb.VehicleModel(ID, make, year, model) VALUES (" + id + ", \""+ make +"\","+ year +", \""+ model +"\")";
		//			stmt1.executeUpdate(sql);	
		//		}
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}


		//		try {
		//			stmt11 = con.createStatement();
		//			rs11 = stmt11.executeQuery("SELECT * FROM VehicleDb.VehicleModel");
		//			while (rs11.next()) {
		//				System.out.println(rs11.getString(1) + "\t" + 
		//						rs11.getString(2) + "\t" + 
		//						rs11.getString(3) + "\t" + 
		//						rs11.getString(4));
		//
		//			}	
		//		}
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}
		//		
		//		Scanner scr = new Scanner(System.in);
		//		
		//		System.out.println("Enter the ID");
		//		int id = scr.nextInt();
		//		
		//		System.out.println("Enter the make");
		//		String make = scr.next();
		//		
		//		System.out.println("Enter the year");
		//		int year = scr.nextInt();
		//		
		//		System.out.println("Enter the model");
		//		String model = scr.next();
		//		
		//		try {
		//			PreparedStatement stmt12 = con.prepareStatement(" INSERT INTO VehicleDb.VehicleModel(ID, make, year, model) VALUES (?, ?, ?, ?)");
		//			stmt12.setInt(1, id);
		//			stmt12.setString(2, make);
		//			stmt12.setInt(3, year);
		//			stmt12.setString(4, model);
		//			
		//			stmt12.executeUpdate();
		//			
		//			
		//		}
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}
		//		

		//		try {
		//			PreparedStatement pstmt = con.prepareStatement("UPDATE VehicleDb.VehicleModel SET year = 2019 WHERE ID = 10");
		//			pstmt.executeUpdate();
		//			}
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}

		//		
		//		try {
		//			PreparedStatement pstmt = con.prepareStatement("UPDATE VehicleDb.VehicleModel SET year = ? WHERE ID = ?");
		//			pstmt.setInt(2, 10);
		// 		    pstmt.setInt(1, 2018);
		//			pstmt.executeUpdate();
		//			}
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}

		//		try {
		//			PreparedStatement st = con.prepareStatement("INSERT INTO VehicleDb.VehicleModel(ID, make, year, model) VALUES(?, ?, ?, ?)");
		//			st.setInt(1, 11);
		// 		    st.setString(2, "Ford");
		// 		    st.setInt(3, 2017);
		//		    st.setString(4, "Ranger");
		//			st.executeUpdate();
		//			}
		//		
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}

		//		try {
		//			PreparedStatement st1 = con.prepareStatement("UPDATE VehicleDb.VehicleModel SET model = ? WHERE ID = ?");
		//			st1.setInt(2, 11);
		// 		    st1.setString(1, "Taurus");
		//			st1.executeUpdate();
		//			}
		//		catch (SQLException ex) {
		//			System.out.println("SQLException: " + ex.getMessage());
		//			System.out.println("SQLState: " + ex.getSQLState());
		//			System.out.println("VendorError: " + ex.getErrorCode());
		//		}

		//		Scanner scr = new Scanner(System.in);
		//		for(int i = 0; i <3; i++) {
		//
		//			System.out.println("Enter the ID");
		//			int id = scr.nextInt();
		//
		//			System.out.println("Enter the make");
		//			String make = scr.next();
		//
		//			System.out.println("Enter the year");
		//			int year = scr.nextInt();
		//
		//			System.out.println("Enter the model");
		//			String model = scr.next();
		//
		//			try {
		//
		//				PreparedStatement st2 = con.prepareStatement(" INSERT INTO VehicleDb.VehicleModel(ID, make, year, model) VALUES (?, ?, ?, ?)");
		//				st2.setInt(1, id);
		//				st2.setString(2, make);
		//				st2.setInt(3, year);
		//				st2.setString(4, model);
		//
		//				st2.executeUpdate();	
		//			}
		//			catch (SQLException ex) {
		//				System.out.println("SQLException: " + ex.getMessage());
		//				System.out.println("SQLState: " + ex.getSQLState());
		//				System.out.println("VendorError: " + ex.getErrorCode());
		//			}
		//		}

		//		Scanner scr = new Scanner(System.in);
		//		System.out.println("Enter array size");
		//		int size = scr.nextInt();
		//		
		//		int id[] = new int [size];
		//		String make[] = new String [size];
		//		int year[] = new int [size];
		//		String model[] = new String [size];
		//		
		//		for(int i = 0; i <size; i++) {
		//
		//			System.out.println("Enter the ID");
		//			id[i]= scr.nextInt();
		//
		//			System.out.println("Enter the make");
		//			make[i] = scr.next();
		//
		//			System.out.println("Enter the year");
		//			year[i] = scr.nextInt();
		//
		//			System.out.println("Enter the model");
		//			model[i] = scr.next();
		//		}
		//
		//			try {
		//				for(int i = 0; i< size; i++) {
		//
		//				PreparedStatement st2 = con.prepareStatement(" INSERT INTO VehicleDb.VehicleModel(ID, make, year, model) VALUES (?, ?, ?, ?)");
		//				st2.setInt(1, id[i]);
		//				st2.setString(2, make[i]);
		//				st2.setInt(3, year[i]);
		//				st2.setString(4, model[i]);
		//
		//				st2.executeUpdate();	
		//				}
		//			}
		//			catch (SQLException ex) {
		//				System.out.println("SQLException: " + ex.getMessage());
		//				System.out.println("SQLState: " + ex.getSQLState());
		//				System.out.println("VendorError: " + ex.getErrorCode());
		//			}

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scr.nextInt();

		int id[] = new int[size];
		long mileage[] = new long[size];
		String vehicleCondition[] = new String[size];
		String color[] = new String[size];
		String problem[] = new String[size];
		int modelID[] = new int[size];

		for(int i = 0; i < size; i++) {

			System.out.println("Enter the ID");
			id[i] = scr.nextInt();

			System.out.println("Enter the mileage");
			mileage[i] = scr.nextLong();

			System.out.println("Enter the vehicleCondition");
			vehicleCondition[i]= scr.next();

			System.out.println("Enter the color");
			color[i] = scr.next();

			System.out.println("Enter the problem");
			problem[i] = scr.next();
			scr.nextLine();
			
			System.out.println("Enter the VehicleModel_ID");
			modelID[i] = scr.nextInt();

		}
		try {
			for(int i = 0; i < size; i++) {

				PreparedStatement st2 = con.prepareStatement(" INSERT INTO VehicleDb.VehicleRecord(ID, mileage, vehicleCondition, color, problem, VehicleModel_ID) VALUES (?, ?, ?, ?,?,?)");
				st2.setInt(1, id[i]);
				st2.setLong(2, mileage[i]);
				st2.setString(3, vehicleCondition[i]);
				st2.setString(4, color[i]);
				st2.setString(5, problem[i]);
				st2.setInt(6, modelID[i]);

				st2.executeUpdate();	
			}
		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

}
