package advancjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Reriveingdata 
{
public static void main(String[] args) 
{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from student");
	
	ResultSetMetaData rm=rs.getMetaData();
	int n=rm.getColumnCount();
	for(int i=1;i<=n;i++)
	{
		System.out.print(rm.getColumnName(i)+"\t ");
	}
	System.out.println();
	while(rs.next())
	{
		System.out.print(rs.getInt(1)+" \t ");
		System.out.print(rs.getString(2)+" \t ");
		System.out.println(rs.getInt(3)+" \t ");
	}
	rs.absolute(1);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
