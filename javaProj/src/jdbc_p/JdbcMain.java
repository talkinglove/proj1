package jdbc_p;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",
					"hr","hr");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select* from stud");
		
		while(rs.next())
		{
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("birth"));
			System.out.println(rs.getString("tel"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getString("regdate"));
			System.out.println(rs.getString("grade"));


		}
		
		rs.close();
		stmt.close();
		con.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
