package advancjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInterface 
{
public static void main(String[] args) 
{
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
	PreparedStatement pstmt=con.prepareStatement("select * from student where rollno=?");
	System.out.println("enter rollno");
	Scanner sc=new Scanner(System.in);
	int rollno=sc.nextInt();
	pstmt.setInt(1, rollno);
	ResultSet rs=pstmt.executeQuery();
	if(rs.next())
	{
		System.out.print(rs.getInt(1)+" \t");
		System.out.print(rs.getString(2)+" \t");
		System.out.println(rs.getInt(3));
	}
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
