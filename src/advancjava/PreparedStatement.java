package advancjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement 
{
public static void main(String[] args)
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		java.sql.PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no");
		int rollno=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter marks");
		int marks =sc.nextInt();
		pstmt.setInt(1,rollno);
		pstmt.setString(2, name);
		pstmt.setInt(3, marks);
		pstmt.executeUpdate();
		System.out.println("one record inserted sucessfully");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
