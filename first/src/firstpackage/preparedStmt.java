package firstpackage;

import java.sql.*;
public class preparedStmt {

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
			String q = "insert into mytable1(tName,tCity) values(?,?)"; // ---> Dynamic or Parameterized Query. 
			
			// get the PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the values to query
			pstmt.setString(1, "Ayush Tiwari");
			pstmt.setString(2, "Ghaziabad");
			
			pstmt.executeUpdate();
			
			System.out.println("Inserted Successfully...");
			
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
