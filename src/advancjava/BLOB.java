package advancjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BLOB 
{
public static void main(String[] args)
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		PreparedStatement pstmt=con.prepareStatement("insert into images values(?,?)");
		pstmt.setString(1, args[0]);
		FileInputStream fis=new FileInputStream(args[1]);
		pstmt.setBinaryStream(2, fis,fis.available());
		pstmt.executeUpdate();
		System.out.println("one image inserted successfully");
	} catch (ClassNotFoundException | SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
