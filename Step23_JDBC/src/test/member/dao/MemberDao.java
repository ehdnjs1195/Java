package test.member.dao;
/*
 *  Data Access Object (DAO)
 *  
 *  - insert, update, delete, select 작업을 할 클래스 설계
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import test.member.dto.MemberDto_1;
import test.util.DBConnect;

public class MemberDao {
	// MemberDto 객체의 getter 메소드를 이용해서 필요한 값 얻어오기
	public boolean insert(MemberDto_1 dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member"
					+ " (num,name,addr)"
					+ " values(?, ?, ?)";		
			pstmt=conn.prepareStatement(sql);		
			pstmt.setInt(1, dto.getNum());		
			pstmt.setString(2, dto.getName());	
			pstmt.setString(3, dto.getAddr());	
			flag=pstmt.executeUpdate();				//Exception이 발생하는 곳. 발생하면서 실행순서가 catch로 넘어가서 수행하고 finally 수행
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {	//성공
			return true;
		}else {			//실패
			return false;
		}
	}
	
	public boolean insert(Map<String, Object> map) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member"
					+ " (num,name,addr)"
					+ " values(?, ?, ?)";		
			pstmt=conn.prepareStatement(sql);		
			pstmt.setInt(1, (int)map.get("num"));		
			pstmt.setString(2, (String)map.get("name"));	
			pstmt.setString(3, (String)map.get("addr"));	
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
			return true;
		}else {			//실패
			return false;
		}
	}
	
	// DB 에 회원 한명의 정보(num, name, addr)를 추가하는 메소드
	public boolean insert(int num, String name, String addr) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member"
					+ " (num,name,addr)"
					+ " values(?, ?, ?)";		
			pstmt=conn.prepareStatement(sql);		
			pstmt.setInt(1, num);		
			pstmt.setString(2, name);	
			pstmt.setString(3, addr);	
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
			return true;
		}else {			//실패
			return false;
		}
	}
}
