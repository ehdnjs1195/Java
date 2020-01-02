package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;
//SELECT 문!
public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  member 테이블의 모든 정보를 콘솔창에 출력해 보세요.
		 *  단, 회원번호에 대해서 오름차순 정렬해서
		 */
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;				//이 세 객체들은 작업이 끝나면 모두 닫아주는것이 좋다.
		try {
			////Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();	
			String sql="select * from member"
					+ " order by num asc";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);	
			//sql 문 수행하고 select 결과값을 ResultSet 으로 받아오기
			rs=pstmt.executeQuery();	
			
			while(rs.next()) {								
				int num=rs.getInt("num");					
				String name=rs.getString("name");				
				String addr=rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
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
