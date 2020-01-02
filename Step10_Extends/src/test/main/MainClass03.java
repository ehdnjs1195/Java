package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		//p1에는 SmartPhone 객체의 참조값이 들어있다.
		SmartPhone p1=new SmartPhone();
		
		SmartPhone p2=p1;	//참조값 복사
		HandPhone p3=p1;		
		Phone p4=p1;
		Object p5=p1;		//key는 모두 같지만 사용설명서가 모두 다르다.
		//자식 클래스를 객체생성을 하면 상속된 부모객체가 만들어지는데 자식객체 사물함에 같이 만들어진다. 하나의 사물함에 모든 기능이 다 생기기 때문에.
		
		/*
		 *  Object type 을 casting 연산자 (Phone) 을 이용해서
		 *  Phone type 으로 강제 형 변환을 한 다음 Phone type 변수에 담을 수 있다.
		 */
		Phone p6=(Phone)p5;	//p5는 Object type 이기 때문에 그냥 Phone 타입으로 못 받는다.	=>사용설명서를 교체하는 모양세.
		p6.call();
		
		//HandPhone type 으로 캐스팅
		HandPhone p7=(HandPhone)p5;
		//SmartPhone type 으로 캐스팅
		SmartPhone p8=(SmartPhone)p5;
		
		
	}
}
