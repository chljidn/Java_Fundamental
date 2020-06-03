package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args) {
		
		//1. 드라이브 로드.
		//Driver 객체를 메모리에 로드하여 java Application과 mariadb-java-client-xxx.jar과 연결한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver"); //Class.forName() 메서드는 클래스 파일명을 인자로 넣어주면 해당하는 클래스를 반환해줌.
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("드라이버 로드 실패");
		}
		
		Connection con = null; //Connection 객체는 특정 데이터 원본과 연결된 커넥션을 나타냄.
		PreparedStatement pstmt = null;//statement를 상속받는 인터페이스로 SQL구문을 실행시키는 기능을 갖는 객체.
		try {
			//2. 데이터 베이스와 연결
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",//url
					"kpc12",//user
					"kpc1234");//password
			
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성.
			//? => 바인딩 변수
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES(?,?,?)");
			pstmt = con.prepareStatement(sql.toString());//prepareStatement() 메서드는 매개변수로 질의문을 받아들이고 PreparedStatement 타입을 리턴한다.
			                                             //StringBuffer를 toString() 메서드를 통해서 String으로 변환.
			
			//4. 바인딩 변수 설정과 쿼리문 전송
			pstmt.setInt(1, 8);
			pstmt.setString(2, "런정페이");
			pstmt.setString(3, "중국");
			
			//5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : "+resultCount);
			
			
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6. 모든 자원을 반납한다.
			try {
				if (con != null) con.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
