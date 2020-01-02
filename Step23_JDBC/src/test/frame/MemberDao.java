package test.frame;
/*
 *  Data Access Object (DAO)
 *  
 *  - insert, update, delete, select 작업을 할 클래스 설계
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import test.member.dto.MemberDto_1;
import test.teacherVer.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	
	public List<MemberDto1> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;				//이 세 객체들은 작업이 끝나면 모두 닫아주는것이 좋다.
		List<MemberDto1> listMem=new ArrayList<>();
		try {
			////Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();	
			String sql="select * from member"
					+ " order by num asc";
			pstmt=conn.prepareStatement(sql);	
			rs=pstmt.executeQuery();
			while(rs.next()) {	
				MemberDto1 mem=new MemberDto1();
				mem.setNum(rs.getInt("num"));				
				mem.setName(rs.getString("name"));			
				mem.setAddr(rs.getString("addr"));
				listMem.add(mem);
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
		return listMem;
	}
	
	public String select() {
		List<MemberDto1> list=getList();
		String info="";
		for(int i=0;i<list.size();i++) {
			MemberDto1 mem=list.get(i);
			int num=mem.getNum();
			String name=mem.getName();
			String addr=mem.getAddr();
			info +=num+" | "+name+" | "+addr+"\r\n";
		}
		return info;
	}
	public MemberDto1 getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //select한 결과를 담을 객체
		//Select 된 결과를 저장해서 리턴할 객체를 저장할 지역변수 선언
		MemberDto1 dto=null;
		try {
			conn = new DBConnect().getConn();
			//실행할 select문 구성하기
			String sql = "select num,name,addr"
					+ " from member"
					+ " where num=?";
			pstmt = conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			//ResultSet 객체에서 필요한 값 얻어내기
			while (rs.next()) {
				//회원정보를 담을 객체 생성
				dto=new MemberDto1();			//dto를 생성하지 않을때 NullPointException 이 발생함
				//setter 메소드를 이용해서 dto 에 회원정보 저장
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}
		//회원정보가 담긴 MemberDto 객체의 참조값을 리턴해준다.
		return dto;
	}
	
	// MemberDto 객체의 getter 메소드를 이용해서 필요한 값 얻어오기
	public boolean insert(MemberDto1 dto) {
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
