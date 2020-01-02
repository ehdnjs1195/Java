package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

/*
 *  사원번호, 사원이름, 부서명을 select 해서 콘솔창에 출력해 보세요
 */
public class MainClass02 {
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;				//이 세 객체들은 작업이 끝나면 모두 닫아주는것이 좋다.
		try {
			conn=new DBConnect().getConn();	//Connection 객체 가져오기.
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
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
}
