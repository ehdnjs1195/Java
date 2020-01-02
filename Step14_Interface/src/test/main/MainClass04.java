package test.main;

import text.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {	//인터페이스이면서 메소드가 하나 짜리인 것 일때 쓰는 문법   
		useDrill(new Drill() {					//마치 메소드를 호출하면서 동작을 전달하는 느낌.
			@Override
			public void hole() {
				System.out.println("Drrrrrrrrrrilllllllllll");
			}
		});
		// 람다식을 이용해서 인터페이스 type 의 참조값 전달하기.
		useDrill(()->{	//어차피 메소드 하나니까 그 메소드의 오버라이드를 {}에서 하는것!	()->{} 모양 자체가 참조값을 가져오는 것!
			System.out.println("DDDDDDDrrrrrillllll~!");
		});
		
		useDrill(()->{
			System.out.println("학원 건물 기둥에 구멍을 뚫어버려요~!");
		});
		
		Drill d1=()->{	//Drill의 참조값이다.	()는 전달받는 값 지역변수 선언하는 영역. ex)hole(int num) 이런식으로 전달할 게 있을 때
						//{}는 implements 한 익명의 클래스 영역.
			System.out.println("보이는거 다 뚫어버려~");
		};	
		useDrill(d1);
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		System.out.println("---Drill 객체 사용 완료 ---");
	}
}
