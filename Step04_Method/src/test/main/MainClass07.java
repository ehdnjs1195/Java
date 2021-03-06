package test.main;

import test.mypac.Counter;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main() 메소드가 시작 되었습니다.");
		
		// Counter 클래스의 static 메소드 호출하기
		Counter.addCount();
		Counter.addCount();
		Counter.addCount();
		// Counter 클래스의 static 필드 참조하기
		System.out.println("Counter.count :"+Counter.count);
		
		System.out.println("main() 메소드가 종료 됩니다.");
	}
}
/*
 * 	클래스의 역활
 *  1. 스태틱필드 스태틱메소드를 감싸는 역활
 *  2. 객체의 설계도역활
 *  3. 객체의 타입역활
 */
