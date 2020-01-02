package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass03 {
	public static void main(String[] args) {
		int num=1;
		String name="김구라";
		String addr="구라동";
		//위의 정보를 member 테이블에 insert 하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			//실행할 sql 문의 뼈대 구성하기
			String sql="insert into member"
					+ " (num,name,addr)"
					+ " values(?, ?, ?)";		//반드시 ?(물음표)로 표시해두고  
			//sql 문을 수행할 PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);		//준비된 statement를 얻기위해선 실행할 sql문을 미리 넣어주고(뼈대만 구성된)
			//? 에 필요한 값 바인딩하기
			pstmt.setInt(1, num);		//1번째 ?에 들어가고 (실수는 setDouble)
			pstmt.setString(2, name);	//2번째 ?에 들어가고
			pstmt.setString(3, addr);	//3번째 ?에 들어간다.		미완성 상태의 sql문을 PreparedStatement 메소드를 이용해서 데이터를 넣어 완성시킨다.
			//sql 문 실행하기
			//executeUpdate() 메소드는 변화된 row의 갯수를 리턴한다.(수정,삽입,삭제 등)
			flag=pstmt.executeUpdate();		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		if(flag>0) {	//성공
			System.out.println("회원정보를 성공적으로 추가 했습니다.");
		}else {			//실패
			System.out.println("회원정보 추가  실패");
		}
	}
}
