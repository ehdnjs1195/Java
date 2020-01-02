package test.main;

import java.sql.Connection;			//DB와 연결할 객체
import java.sql.DriverManager;		//
import java.sql.PreparedStatement;	
import java.sql.ResultSet;			//셀렉된 결과를 받아올 객체

/*
 *  Java DataBase Connectivity(JDBC)
 *  
 *  - oracle 에 연결하기 위해서는 ojdbc6.jar 파일이 필요하다
 */
public class MainClass01 {
	public static void main(String[] args) {
		//DB 연결객체를 담을 지역변수
		Connection conn=null;	//Connection 객체가 무조건 있어야만 DB와 연동이 가능해진다.
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 정보
			String url="jdbc:oracle:thin:@localhost:1521:xe";			//localhost 는 현재 내 컴퓨터. 다른 컴퓨터의 IP주소를 적으면 그 곳으로 접속. 1521은 port, xe는 DB명
			//접속하고 Connection 객체의 참조값 얻어오기					//java어플이 돌아가는 해당 컴퓨터를 뜻함(내 IP주소 127.0.0.1와 같다)
			conn=DriverManager.getConnection(url, "scott", "tiger");	//계정에 잘 들어가면 참조값이 잘 들어간다.
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//emp 테이블의 사원번호, 사원이름, 급여 select 해보기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//실행할 sql 문
			String sql="select empno,ename,sal from emp";
			//Connection 객체의 메소드를 이용해서 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql);			//PrepareStatement 메소드는 sql문을 대신 실행시켜준다.
			//select 문 수행하고 결과를 ResultSet으로 받아오기
			rs=pstmt.executeQuery();	//결과는 ResultSet으로 리턴된다. select문 실행하는 것을 query라고 한다.
			//반복문 돌면서 ResultSet 객체에 들어있는 정보를 출력하기
			while(rs.next()) {									//결과는 ResultSet에 담겨있고 위에는 항상 cursor가 대기하고 있다고 생각. next()는 true 혹은 false가 리턴이 되는데
				int empno=rs.getInt("empno");					//커서 바로 다음에(next) row가 있는지 확인하고(아랫줄) 있으면 한 줄 내려오고 true를 반환한다. 읽을 row가 없으면 false를 반환함. 
				String ename=rs.getString("ename");				//이때 while문 안으로 들어와서 칼럼명으로 하나씩 데이터를 빼낸다.
				int sal=rs.getInt("sal");
				System.out.println(empno+"|"+ename+"|"+sal);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
