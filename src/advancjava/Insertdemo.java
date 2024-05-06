package advancjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertdemo
{
public static void main(String[] args) 
{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
	Statement stmt=con.createStatement();
	stmt.executeUpdate("insert into student values(2,'mohan',80)");
	System.out.println("one record inserted sucessfully");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
