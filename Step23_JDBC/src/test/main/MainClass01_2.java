package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  사원번호, 사원이름, 부서명을 select 해서 콘솔창에 출력해 보세요
 */
public class MainClass01_2 {
	public static void main(String[] args) {
		Connection conn=null;	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";	
			conn=DriverManager.getConnection(url, "scott", "tiger");	
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="select empno,ename,dname"
					+ " from emp,dept"
					+ " where emp.deptno=dept.deptno "
					+ " order by empno asc";
			pstmt=conn.prepareStatement(sql);			
			rs=pstmt.executeQuery();	
			
			while(rs.next()) {								
				int empno=rs.getInt("empno");					
				String ename=rs.getString("ename");				
				String dname=rs.getString("dname");
				System.out.println(empno+"|"+ename+"|"+dname);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
