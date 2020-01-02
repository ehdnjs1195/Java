package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;
// UPDATE 문!
public class MainClass05 {
	public static void main(String[] args) {
		// 수정할 회원의 정보라고 하자
		int num=1;
		String name="이정호";
		String addr="독산동";
		
		// 위의 정보대로 회원정보를 수정하기
		Connection conn=null;
		PreparedStatement pstmt=null;		
//		ResultSet rs=null;	 select할 때 필요하다.
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="update member"
					+ " set name=?, addr=?"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩하기
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			//실행
			flag=pstmt.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();	//pstmt를 먼저 닫고
				if(conn!=null)conn.close();		//conn을 닫아준다
			}catch(Exception e) {}
		}
		//위의 작업의 성공 여부를 여기서 알고 싶으면?
		if(flag>0) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
	}
}
