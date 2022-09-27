
// Retrieve data from table "StudentTable" and print using HashMap.  

package firstpackage;

import java.sql.*;
import java.util.HashMap;

public class practiceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			HashMap hm = new HashMap<>();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayushdb","root","A@yush2611");
			String q = "select * from StudentTable";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			
			while(rs.next()) {
				hm.put(rs.getString("StudentName"), rs.getInt("StudentMarks"));
			}
			System.out.println(hm);
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
