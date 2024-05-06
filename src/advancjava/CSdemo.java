package advancjava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CSdemo
{
public static void main(String[] args)
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:5321:orcl","d##paanii","0000");
			CallableStatement cstmt=con.prepareCall("{call insertpro(?,?,?)}");
			Scanner s =new Scanner(System.in);
			System.out.println("enter rollno");
			int rollno=s.nextInt();
			System.out.println("enter name");
			String name =s.next();
			System.out.println("enter marks");
			int marks=s.nextInt();
			cstmt.setInt(1, rollno);
			cstmt.setString(2, name);
			cstmt.setInt(3, marks);
			cstmt.executeUpdate();
			System.out.println("one record inserted successfully ");
	} catch (ClassNotFoundException | SQLException e) {
		 
		e.printStackTrace();
	}
	 
}
}
