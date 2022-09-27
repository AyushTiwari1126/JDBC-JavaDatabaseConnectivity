package firstpackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
	 public static void main(String[] args){
	        try{
	            // load the driver:
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // creating a connection
	            String url = "jdbc:mysql://localhost:3306/ayushdb";
	            String username = "root";
	            String password = "A@yush2611";
	            Connection con = DriverManager.getConnection(url, username, password);

	            if(con.isClosed()){
	                System.out.println("Connection is Closed");
	            } else {
	                System.out.println("Connection Created...");
	            }
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	    }

}
