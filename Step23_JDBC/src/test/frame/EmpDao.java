package test.frame;
/*
 *  Data Access Object (DAO)
 *  
 *  - insert, update, delete, select 작업을 할 클래스 설계
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import test.member.dto.MemberDto_1;
import test.util.DBConnect;

public class EmpDao {
	
	// DB 에 회원 한명의 정보(num, name, addr)를 추가하는 메소드
	public boolean insert(int empno, String ename, String job) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member"
					+ " (empno,ename,job)"
					+ " values(?, ?, ?)";		
			pstmt=conn.prepareStatement(sql);		
			pstmt.setInt(1, empno);		
			pstmt.setString(2, ename);	
			pstmt.setString(3, job);	
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
	
	public boolean delete(int num) {
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
			return true;
		}else {
			return false;
		}
	}
	public boolean update(String name,String addr,int num) {

		Connection conn=null;
		PreparedStatement pstmt=null;		
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
			return true;
		}else {
			return false;
		}
	}
	
}
