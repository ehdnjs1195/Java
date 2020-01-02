package test.main;

import java.util.HashMap;
import java.util.Map;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto_1;

public class MainClass08 {
	public static void main(String[] args) {
		//새로 추가할 회원의 정보이다.
		int num=6;
		String name="돼지";
		String addr="독산동";
		
		//3 개의 정보를 HashMap 객체에 담기
		Map<String , Object> map=new HashMap<>();
		map.put("num", num);
		map.put("name", name);
		map.put("addr", addr);
		//저장할 회원의 정보를 MemberDto 객체에 담기
		MemberDto_1 dto=new MemberDto_1(num, name, addr);
		
		MemberDao dao=new MemberDao();
//		dao.insert(num, name, addr);
//		dao.insert(map);
		
		//insert() 메소드를 이용해서 회원정보를 추가 하고 성공여부를 리턴 받는다.
		boolean isSuccess=dao.insert(dto);
		if(isSuccess) {
			System.out.println("회원 정보를 추가 했습니다.");
		}else {
			System.out.println("회원 정보 추가 실패");
		}
		
	}
}
//HashMap도 캐스팅의 부담이 있기 때문에
//DAO에서는 Dto를 많이 사용한다. new MemberDto(); 에 멤버 정보를 하나씩 담아서 사용.
