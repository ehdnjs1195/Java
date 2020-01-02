package test.main;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 	HashSet
		 * 
		 * 	- 중복을 허용하지 않는다.
		 * 	- 인덱스도 없고, 키 값도 없다.
		 *  - 순서도 없다.
		 *  - 어떤 데이터를 중복을 허용하지 않는 묶음(집합)으로 관리하고 싶을때 사용한다.
		 *  - 참조할 땐 뭐가 나올지 모른다. 묶음 중에서 하나씩 참조하고싶을 때.
		 */
		HashSet<String> lunch=new HashSet<>();		//Set 은 순서도 없고, 키 값도 없고 그냥 묶음으로 관리할 때.(마치 사탕 한 봉지) 중복을 허용하지 않는다. 중복제거할 때 종종 쓰임		
		lunch.add("자장면");
		lunch.add("샌드위치");
		lunch.add("마라탕");
		lunch.add("갈비");
		lunch.add("김치찌개");
		lunch.add("마라탕");	//중복되서 들어가지 않는다.
		lunch.add("갈비");	//중복되서 들어가지 않는다.
		
		// 저장된 item 의 갯수
		int size=lunch.size();
		
		Iterator<String> it=lunch.iterator();	//iterator 반복자 => 순서에 상관없이 cursor | 뒤에 데이터가 있으면 하나씩 빼낸다.
		// 커서 다음 데이터가 있으면
		while(it.hasNext()) {	//cursor 다음에 데이터가 있으면 true, 없으면 false
			//커서를 이동해서 해당 커서에 위치한 데이터 얻어오기
			String tmp=it.next();
			System.out.println(tmp);
		}
	}
}
