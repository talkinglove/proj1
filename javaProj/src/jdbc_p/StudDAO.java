package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.Statement;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class StudDAO {
	
	Connectiong con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url ="";
	String id ="";
	String pw = "";
	
	String sql= "";
	
	
	StudDAO()
	{
		try {
			sql = "select* from stud";
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				
				//System.out.println(rs.);
			
			
			/*Class.forName("oracle.jdbc.driver.OracleDriver");
				
					con = DriverManager.getConnection(
							"jdbc:oracle:thin:@ 192.168.1.3:1521:orcl",
			"hr", "hr");
		
			Statement stmt = con.createStatement();*/
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally{
		close();
	}
	
		void close(){
			if(rs!=null) try (rs.close();} catch(SQLException e) {}
			if(rs!=null) try (rs.close();} catch(SQLException e) {}
		if(rs!=null) try (rs.close();} catch(SQLException e) {}

}

		
		
	}

}
