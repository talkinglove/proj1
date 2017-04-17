package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		studDAO dao = new StudDAO();
		
		dao.getList();
		
	}
}
		
		



		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
					
					
					con = DriverManager.getConnection(
							"jdbc:oracle:thin:@ 192.168.1.3:1521:orcl",
			"hr", "hr");
		
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from stud");
			
			while(rs.next())
			{
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getDate("birth"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getTimestamp("regdate"));
				System.out.println(rs.getInt("grade"));


			}
			
			rs.close();
			stmt.close();
			con.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
