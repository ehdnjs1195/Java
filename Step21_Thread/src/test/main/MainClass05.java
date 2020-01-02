package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//Runnable type 을 람다식으로 표현하기
		new Thread(()->{	//메소드 하나짜리 구현할 때 람다식을 쓸 수 있으므로. {}가 메소드
			//여기는 새로운 스레드가 시작되는 run() 메소드 입니다.
			System.out.println("새로운 스레드가 시작됩니다.");
			
		}).start();	
	}
}
