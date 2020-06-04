package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null; // PreparedStatement : SQL문을 임시로 실행 후 임시로 저장한 객체
		//SQL문의 결과 집합을 관리하는 인터페이스
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("ORDER BY  num DESC");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//select문을 사용할 경우에는 executeQuery()를 사용해야 한다.
			//insert, update,delete문을 사용할 경우에는 executeUpdate()를 사용.
			//executeQuerty : PreparedSatement를 통해 SQL을 실행한 값을 ResulsSet에 전달하는 역할.
			//ResultSet객체를 생성한 변수 rs에 저장을 한번 해준 것이고 커서 단위로 값을 출력하는
			//ResultSet의 특징을 사용해 원하는 sQL값을 rs변수를 통해서 출력 가능.
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //next() 메서드 : 다음 행으로 커서를 이동.
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				String addr = rs.getString(++index);
				System.out.printf("%d, %s, %s", num, name, addr);
				System.out.println();
			}
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
