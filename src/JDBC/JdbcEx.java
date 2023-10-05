package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		// load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the connection
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fruits", "root", "root");
		
		
		 
		 String sql="create table Afruit(Afid int,Afname varchar(54),Afprice int)";
		 
		 // Execute the sql statement
		   Statement st = con.createStatement();
		   st.executeUpdate(sql);
		   
		   System.out.println("Table is ceated");
		   System.out.println("Table is created succesfully");
		   System.out.println("Table is created succesfully");
		   con.close();

	}

}
