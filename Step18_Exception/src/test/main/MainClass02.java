package test.main;
/*
 *  Exception 의 종류
 *  
 *  1. 실행시에 발생하는 Exception
 *  	- RuntimeException 을 상속받은 예외 type 이다.		(RuntimeException: 실행중에 발생할 수 있는 예외)
 *  	- try~catch 블럭을 작성해도 되고 안해도 된다.
 *  
 *  2. 컴파일시에 발생하는 Exception
 *  	- RuntimeException 을 상속받지 않은 예외 type 이다.
 *  	- 반드시 try~catch 블럭을 작성해야 한다. 
 */
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		try {
			Thread.sleep(1000);	//원하는 시간 만큼 실행 흐름을 잡아둘 수 있다.(1000 => 1초)	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 되었습니다.");
	}
}

//java.lang.Thread  처럼 java.lang 패키지에 있는 클래스는 import 하지 않아도 사용가능하다. String, double .. 등

/*
 *  모든 Exception 은 Exception 클래스를 상속받으므로 
 *  catch에서 어떤 Exception인지 몰라도 Exception으로 받을 수 있다.
 *  
 *   Exception을 내가 직접 발생시키고 싶으면
 *   => throw new Exceptionclass();
 */
