package test.main;

import java.util.HashMap;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  회원 한 명의 번호, 이름, 주소를 하나의 객체로 관리하고 싶다면
		 *  방법1. 클래스를 설계해서 만든다
		 *  방법2. java script 처럼 만드는 HashMap객체를 이용한다.
		 */
		HashMap<String, Object> mem=new HashMap<>();	//K: key는 String으로, V: value는 Object로 어떤 타입이든 받기 위해.	 자바스크립트의 {key: value   ,key2: value2 ...} 이런 느낌으로 만들기 위해. 
		// key, value 의 쌍으로 데이터를 저장하고
		mem.put("num", 1);	//보통 key 값은 알아서 정하고 value는 타입을 정해준다
		mem.put("name", "김구라");
		mem.put("addr", "노량진");
		// 불러올때는 Object type으로 리턴되므로 원래 type으로 casting 한다.
		int num1=(int)mem.get("num");		
		String name1=(String)mem.get("name");
		String addr1=(String)mem.get("addr");
		int a=mem.size();
		
		//특정 key 값으로 저장된 데이터 삭제
		mem.remove("addr");
	}
}
