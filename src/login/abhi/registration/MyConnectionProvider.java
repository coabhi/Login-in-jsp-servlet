package login.abhi.registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider {

	static Connection conn = null;
	 
	public static Connection getCon(){
		String url = "jdbc:mysql://localhost:3306/logindb?verifyServerCertificate=false&useSSL=false";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"student","student");
			System.out.println("Database connection successful!\n");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
