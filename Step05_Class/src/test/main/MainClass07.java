package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  Programming 의 목적?
		 *  - 0~100 사이의 랜덤한 정수를 1개를 얻어내서 콘솔창에 출력하기
		 */
		
		int result=new Random().nextInt(101);		// ()안에는 boundary 값을 넣어준다. ex) 10이면 0-9, 100이면 0-99
		System.out.println(result); 
		
		// Random 객체를 생성하고 참조값을 Random type 지역변수 ran에 담기
		Random ran=new Random();
		int result2=ran.nextInt(101);
		System.out.println(result2);
		
		
		double a=Math.random();
		System.out.println(a);	
		
	}
}
/*
 * new Random(); 는 import를 하지만 
 * System. 은 자주쓰기 때문에  import 하지 않아도 된다.(만든사람 맘) java.lang 패키지에 있다.  
 * System.out. =>PrintStream type이다. 
 * System.out. 에 있는 메소드는 PrintStream 클래스 안에 있는 메소드를 사용하는것이다. 
 */