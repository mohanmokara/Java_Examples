package advancjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdates 
{
public static void main(String[] args) 
{
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
	Statement stmt=con.createStatement();
	stmt.addBatch("insert into student values(4,'triveni',83)");
	stmt.addBatch("update student set marks=99 where name='mohan'");
	stmt.addBatch("delete from student where rollno=1");
	stmt.executeBatch();
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
