
// Updating the items in the table by using the reference of the id or Rollno.

package firstpackage;

import java.sql.*;
import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayushdb","root","A@yush2611");
			String q = "update StudentTable set StudentName=?, StudentMarks=? where StudentRollno=?";
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Student's Name : ");
			String name = sc.next();
			System.out.print("Enter Student's Marks : ");
			int marks = sc.nextInt();
			System.out.print("Enter the Rollno where you want to make changes : ");
			int rollno = sc.nextInt();
			
			PreparedStatement pst = con.prepareStatement(q);
			
			pst.setString(1,name);
			pst.setInt(2, marks);
			pst.setInt(3, rollno);
			
			pst.executeUpdate();
			
			System.out.println("Table Updated");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

// Taking user input details for updating the values into the table 