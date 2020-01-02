package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;
// DELETE 문!
public class MainClass06 {
	public static void main(String[] args) {
		// 삭제할 회원의 정보라고 하자
		int num=2;
		
		// 위의 정보대로 회원정보를 수정하기
		Connection conn=null;
		PreparedStatement pstmt=null;		
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="delete from member"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩하기
			pstmt.setInt(1, num);
			//실행
			flag=pstmt.executeUpdate();		//Exception 이 발생하진 않지만 flag 값으로 삭제 성공 여부를 알 수 있다.

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
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
}
