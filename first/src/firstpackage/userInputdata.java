package firstpackage;

import java.io.*;
import java.sql.*;
import java.util.*;

public class userInputdata {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			create a connection
			String url = "jdbc:mysql://localhost:3306/ayushdb";
			String username = "root";
			String password = "A@yush2611";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
//			create a query
			String q = "insert into mytable1(tName, tCity) values(?,?)";
			
//			get the preparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter Name : ");
			String name = br.readLine();
			
			System.out.print("Enter City : ");
			String city = br.readLine();
			
//			set the values to query
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			
			System.out.println("Inserted UserInputData.java File");
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
