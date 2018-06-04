package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCconnection {
	
	public static void main(String[] args) throws Exception
	{	 
		//create jdbc connection obj and local class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gyana","gyana");
	//Create statement Query
		Statement st=con.createStatement();
	//Executethe query
		ResultSet rs=st.executeQuery("select * from emp");
	//print database table records
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+"____"+rs.getString(4));
		}
	//close obj
		st.close();
		rs.close();
		con.close();	
	}

}
