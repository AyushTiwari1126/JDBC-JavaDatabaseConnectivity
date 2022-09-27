
// Inserting items into the Table "StudentTable"...

package firstpackage;

import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ayushdb";
			String username = "root";
			String paasword = "A@yush2611";
			Connection con = DriverManager.getConnection(url, username, paasword);
			
			String q = "insert into StudentTable(StudentName, StudentMarks) values(?,?)";
			
			PreparedStatement pst = con.prepareStatement(q);
			
			Scanner  br = new Scanner(System.in);
			
			System.out.print("Enter Student's Name : ");
			String name = br.next();
			
			System.out.print("Enter Student's Marks(out of 100) : ");
			Integer marks = br.nextInt();
			
			pst.setString(1, name);
			pst.setInt(2, marks);
			
			pst.executeUpdate();
			System.out.println("Inserted Data into Table");
			br.close();
			
			con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
