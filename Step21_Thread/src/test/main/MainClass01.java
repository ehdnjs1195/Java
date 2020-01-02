package test.main;

public class MainClass01 {
	public static void main(String[] args) {	//run 버튼을 눌렀을 때 시작되는 메인쓰레드.
		System.out.println("main 메소드가 시작되었습니다.");
		//새로운 스레드 시작 시키기
		CounterThread ct=new CounterThread();	//주의! run()을 호출하는것은 그냥 run()메소드를 호출하게 되는 것 뿐이고 start()를 해야 독립적인 스레드가 시작되는 것이다.
		//새로운 스레드는 1회용으로 사용하고 나면 사라진다. 
		//스레드는 메인과 sub들이 동시에 물길이 지나가는것이 아니고 둘이 번갈아가면서 물길이 흐른다. (여러 물줄기가 동시간대에 같이 흐르지 않는다. 하나 흐르고 다음거 흐르고 또 다음거 흐르고 ...)
		//따라서 스레드가 많으면 동시에 여러 쓰레드가 흐르기 때문에 속도가 느려질 수 있다.
		ct.start();
		
		draw();
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/*
	 *  - 새로운 작업단위(Thread) 만들기
	 *  1. Thread 클래스를 상속받은 클래스를 정의한다.
	 *  2. run() 메소드를 오버라이드 한다.
	 *  3. 만든 클래스를 이용해서 객체를 생성하고 start() 메소드를 호출하면
	 *     생성된 객체의 run() 메소드에서 새로운 작업단위가 시작된다.
	 */
	static class CounterThread extends Thread{	
		@Override
		public void run() {
			System.out.println("새로운 Thread가 시작됨.");
			int count=0;
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count++;
				System.out.println(count);
				if(count==10)break;
			}
		}
	}
}


/*
 * 언제 사용하는가?
 * 예를 들어 무언가 다운로드를 하려고 다운 버튼을 눌렀을 때 시간이 걸릴것이다. 그 시간동안 
 * 다른 작업을 하려면 새로운 스레드에 다운로드 작업을 시키고 메인 스레드에서 작업을 하면 된다.
 * 
 * 
 * 여러 작업단위(스레드)에서 동일한 자원을 사용하고자 할 때가 있을것이다. 
 * 그 때 물줄기는 번갈아가며 흐르므로 그 어떤 자원을 사용하고자 하다가 마침 딱 흐름이 다음으로 넘어가고 그 곳에서 그 자원의 값이 바뀔 수도 있다.
 * 그렇게 될 경우 다시 내 차례로 흐름이 넘어왔을 때 제대로 된 값을 사용하지 못 할 수도 있는것이다.
 */










