package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1234");
			
			//트랜잭션 시작
			con.setAutoCommit(false);
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(110,'A1','B1')");
		
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();
		
			sql.setLength(0);
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(120,'A2','B2')");
			
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(isSuccess) {
					con.commit();//트랜잭션 끝
				}else {
					con.rollback();//트랜잭션 끝
				}
				con.setAutoCommit(true);//Connection을 원래대로 처리
				if(pstmt2 != null) pstmt2.close();
				if(pstmt1 != null) pstmt1.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
