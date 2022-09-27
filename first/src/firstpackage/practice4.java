
// Select or Retrieve the data from table and print it with using ResultSet.

package firstpackage;

import java.sql.*;
public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayushdb","root","A@yush2611");
			String q = "select * from StudentTable";
			
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int rollno = rs.getInt(1);
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				
				System.out.println(rollno + " : " + name + " : " + marks);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
