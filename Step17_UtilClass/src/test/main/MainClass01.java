package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//String type 을 담을수 있는 가변배열 객체를 생성해서 참조값을 변수에 담기
		ArrayList<String> names=new ArrayList<>();	//generic에는 기본데이터타입은 올 수 없다. int->Integer 로 들어와야 한다.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		System.out.println(names);
		//배열의 방의 크기 참조
		int size=names.size();
		
		//0번방에 저장된 참조값 얻어오기
		String name0=names.get(0);
		
		//1번방 없애기(삭제하기)
		names.remove(1);	//중간에 삭제하면 뒤의 데이터 인덱스가 바뀐다.
		
		//모든 방 없애기(삭제하기)
		names.clear();
		
	}
}
