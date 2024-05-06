package advancjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetType1 
{
public static void main(String[] args) 
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select * from student");
		/*
		 * System.out.println(rs.isBeforeFirst()); rs.absolute(1);
		 * System.out.println(rs.isBeforeFirst()); System.out.println(rs.isFirst());
		 */
		rs.first();
		 rs.relative(2);
		System.out.print(rs.getInt(1)+" \t");
		System.out.print(rs.getString(2)+ " \t");
		System.out.println(rs.getInt(3) );
		 System.out.println(rs.getRow());
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
