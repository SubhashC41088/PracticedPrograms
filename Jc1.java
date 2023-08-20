package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.Statement;

public class Jc1 {

	//java database connector
	
/*
 * import
 * load or register the driver
 * create connection
 * create statement
 * execute the query
 * process the result
 * close connectivity
 * 
 * 
 */
	
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/jdbc";
		String username ="root";
		String password ="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,username,password);
			Statement statement =connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from employee");
			while(resultset.next()) {
				System.out.println(resultset.getInt(columnIndex 1)+" "+resultset.getString(columnIndex 2)+" "+resultset.getString(columnIndex 3)+" "+resultset.getString(columnIndex 4));
			connection.close();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
		
	}
	}
