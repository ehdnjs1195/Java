package test.teacherVer;
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
import test.util.DBConnect;
/*
 *  Dao 에는 대체로
 *  
 *  insert(xxxDto dto), update(xxxDto dto), delete(int num)
 *  xxxDto getData(int num)
 *  List<xxxDto> getList() 	회원 한 명당의 정보를 리턴해주는 것. 파라미터 변수로 검색 정보, 페이지 정보... 등을 전달 받을수 있다.
 *  등의 메소드가 있다
 *  
 */
public class MemberDao {		
	
	//회원 전체 목록을 리턴하는 메소드
	public List<MemberDto> getList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //select한 결과를 담을 객체
		//Select 된 결과를 저장해서 리턴할 객체를 저장할 지역변수 선언
		List<MemberDto> list=new ArrayList<>();
		try {
			conn = new DBConnect().getConn();
			//실행할 select문 구성하기
			String sql = "select num, name, addr"
					+ " from member"
					+ " order by num asc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//ResultSet 객체에서 필요한 값 얻어내기
			while (rs.next()) {
				//select 된 row 하나당 하나의 MemberDto 객체를 생성해서
				MemberDto dto=new MemberDto();
				//row 에 있는 정보를 MemberDto 객체에 setter 메소드를 이용해 담고
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				//회원 한 명의 정보가 담긴  MemberDto 객체의 참조값을 
				//ArrayList 객체에 누적 시키기
				list.add(dto);
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
		//모든 회원정보가 담긴 ArrayList 객체의 참조값을 리턴해주기
		return list;
	}
	
	//회원 한명의 정보를 리턴하는 메소드
	public MemberDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //select한 결과를 담을 객체
		//Select 된 결과를 저장해서 리턴할 객체를 저장할 지역변수 선언
		MemberDto dto=null;
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
				dto=new MemberDto();			//dto를 생성하지 않을때 NullPointException 이 발생함
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
	
	//회원 한명의 정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "update member"
					+ " set name=?, addr=?"
					+ " where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (flag > 0) { //성공
			return true;
		} else { //실패
			return false;
		}
	}
	
	//회원 한명의 정보를 삭제하는 메소드
	public boolean delete(int num) {	//num만 받아와서 지우면 되기 때문에 Dto를 안써도 됨.
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "delete from member"
					+ " where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (flag > 0) { //성공
			return true;
		} else { //실패
			return false;
		}
	}
	// MemberDto 객체의 getter 메소드를 이용해서 필요한 값 얻어오기
	public boolean insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member"
					+ " (num,name,addr)"
					+ " values(member_seq.nextval, ?, ?)";		
			pstmt=conn.prepareStatement(sql);			
			pstmt.setString(1, dto.getName());		//번호는 sequence를 통해 집어넣는다.
			pstmt.setString(2, dto.getAddr());	
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
}
