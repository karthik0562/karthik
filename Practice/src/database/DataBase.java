package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/naresh","root","root");
			System.out.println("servefr");
			String sql="select * from student1";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student1");  
			while(rs.next())  
			System.out.println("Id::"+rs.getInt(1)+" Name:: "+rs.getString(2)+" email:: "+rs.getString(3)+"  contact::"+rs.getString(4));  
			conn.close();  


	}

}
