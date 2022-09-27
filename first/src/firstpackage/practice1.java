
// Creating a Table...

package firstpackage;

import java.sql.*;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ayushdb";
			String username = "root";
			String password = "A@yush2611";
			Connection con = DriverManager.getConnection(url, username, password);
			
			String q = "create table StudentTable(StudentRollno int(20) primary key auto_increment, StudentName varchar(200) not null, StudentMarks int(10))";
			
			
//			Prepared Statement Object
			PreparedStatement pst = con.prepareStatement(q);
			
			pst.executeUpdate();
			
			System.out.println("Student table created");
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

// Creating a table (StudentTable) in the database with rows "StudentRollno", "StudentName" & "StudentMarks".
// Using prepareStatement method, pass our query and close the connection.