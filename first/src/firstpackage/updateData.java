package firstpackage;

import java.io.*;
import java.sql.*;

public class updateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// creating a connection
			String url = "jdbc:mysql://localhost:3306/ayushdb";
			String username = "root";
			String password = "A@yush2611";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			// create a query
			String q = "update mytable1 set tName=?, tCity=? where tID=?"; 
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter new Name : ");
			String name = br.readLine();
			
			System.out.println("Enter new City : ");
			String city = br.readLine();
			
			System.out.println("Enter the ID : ");
			int id = Integer.parseInt(br.readLine());
			
			// get the PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			System.out.println("Done ho gya...");
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
