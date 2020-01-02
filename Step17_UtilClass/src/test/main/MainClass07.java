package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  영어 사전
		 *  
		 *  apple	: 사과
		 *  ball	: 공
		 *  money	: 돈
		 *  game	: 놀이
		 *  book	: 책
		 */
		Map<String, String> dic=new HashMap<>();
		dic.put("apple"	, "사과");
		dic.put("ball"	, "공");
		dic.put("money"	, "돈");
		dic.put("game"	, "놀이");
		dic.put("book"	, "책");
		/*
		 *  키보드로 부터 입력 받을 수 있는 Scanner 객체 생성하기
		 *  System.in 은 키보드와 연결된 InputStream 객체이다. 키보드로 입력받을 수 있는 객체의 참조값. 
		 */
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("찾을 단어 입력(종료버튼 q) : ");
			//문자열 한 줄 입력받기
			String word=scan.nextLine();	//문자열을 입력하기 전까지 블록킹 되있는 상태. 문자열을 입력하면 String type 으로 리턴되고 넘어간다.
			//단어 찾기
			String mean=dic.get(word);
			
			//문자열의 내용이 같은지 여부는 .equals() 메소드를 이용해야 한다.
			if(word.equals("q")) {			//java에서 문자열은 비교연산자로 비교할 수 없다. why? 참조값을 비교하는 것이기 때문에. 따라서 참조값은 달라도 문자열의 내용은 같을 수도 있다.
				break;
			}else if(mean==null) {
				System.out.println("찾을 수 없는 단어입니다.");
			}else {
				System.out.println(word+" 의 뜻은 '"+mean+"' 입니다.");
				break;
			}
		}
		
		
		System.out.println("main 메소드가 종료 됩니다.");
		
	}
}





