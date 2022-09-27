package firstpackage;

import java.io.*;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class insertLargeImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			create a connection
			String url = "jdbc:mysql://localhost:3306/ayushdb";
			String username = "root";
			String password = "A@yush2611";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			String q = "insert into images(pic) values(?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			
			File f = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(f);
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();
			
//			System.out.println("Done..");
//						OR
			JOptionPane.showMessageDialog(null, "Done...");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
