package firstpackage;

import java.sql.*;
import java.io.*;

public class insertImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayushdb","root","A@yush2611");
			String q = "insert into images(pic) values(?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Ayush\\Desktop\\AyushTiwari\\pexels.jpg");
			pstmt.setBinaryStream(1, fis, fis.available());
			
			pstmt.executeUpdate();
			System.out.println("Done...");
		}
		catch(Exception e) {
			System.out.println("Error Occured..");
		}
	}

}
