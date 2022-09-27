package firstpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertJdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

            // creating a connection
            String url = "jdbc:mysql://localhost:3306/ayushdb";
            String username = "root";
            String password = "A@yush2611";
            Connection con = DriverManager.getConnection(url, username, password);
            
            // create a query :-
            String q = "create table mytable2(Student_ID int(20) primary key auto_increment, Student_Name varchar(200) not null, Student_City varchar(400))";
            
            // create a statement :-
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            
            System.out.println("Table Created in Database");
            
            con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
