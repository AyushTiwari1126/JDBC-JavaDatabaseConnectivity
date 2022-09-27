package firstpackage;

import java.sql.*;

public class selectData {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/ayushdb";
			String username = "root";
			String password = "A@yush2611";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			String q = "select * from mytable1";
			
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				System.out.println(id + " : " + name + " : " + city);
			}
			
			
//			stmt.executeUpdate(q);
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
