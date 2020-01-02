package test.mypac;

public class MyUtil {
	public static void draw()  {	//메소드 내에서 예외를 처리했다
		System.out.println("5초 동안 그림을 그려요");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		System.out.println("그림 그리기 완료");
	}
	public static void send() throws InterruptedException {	//send라는 메소드는 예외를 발생시킨다는 뜻. 따라서 예외를 처리해야 메소드를 호출할 수 있다. (예외 처리후 호출 가능)
		System.out.println("5초 동안 전송을 해요");
		Thread.sleep(5000);
		System.out.println("전송 완료");
	}
}
