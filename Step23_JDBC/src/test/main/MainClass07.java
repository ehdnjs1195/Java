package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;
//SELECT 문!
public class MainClass07 {
	public static void main(String[] args) {
		
		// 한 명의 회원 정보를 얻어오고 싶다.
		int num=1;
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;				//select를 할 때는 결과set이 필요하다.
		try {
			////Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();	
			String sql="select num, name, addr"
					+ " from member"
					+ " where num=?";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);	
			//? 에 값 바인딩하기
			pstmt.setInt(1, num);
			//sql 문 수행하고 select 결과값을 ResultSet 으로 받아오기
			rs=pstmt.executeQuery();
			while(rs.next()) {	
				//커서가 위치한 곳에서 "name" 칼럼에 있는 문자열 읽어오기
				String name=rs.getString("name");			//sql에서 as(별칭)을 두면 그 별칭으로 읽어와야 한다.ex)name as babo => getString("babo")  / select 문에서 내용이 길어지는 것(날짜 같은거)에 별칭을 부여해서 쓰는것이 좋다.
				//커서가 위치한 곳에서 "addr" 칼럼에 있는 문자열 읽어오기
				String addr=rs.getString("addr");
				
				System.out.println(num+"|"+name+"|"+addr);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();			//닫는 순서는 반대로.
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
}
