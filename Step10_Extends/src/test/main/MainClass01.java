package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass01 {
	public static void main(String[] args) {
//		Phone p1=new Phone();
//		Object p2=new Phone();	//Phone클래스는 Object클래스의 자식클래스로 볼 수 있으므로 부모클래스 타입으로 받을 수 있다. => 하나의 객체가 두개의 타입을 가지고 있다.(다형성) 
								//객체는 Phone 이지만 사용설명서는 Object이다.
		
		//Phone 객체의 기능 사용해보기
		Phone p1=new Phone();
		p1.call();
		System.out.println("------");
		//HandPhone 객체의 기능 사용해보기
		HandPhone p2=new HandPhone();
		p2.call();
		p2.mobileCall();
		p2.takePicture();
		System.out.println("------");
		//SmartPhone 객체의 기능 사용해보기
		SmartPhone p3=new SmartPhone();
		p3.call();
		p3.mobileCall();
		p3.takePicture();
		p3.doInternet();
		
	}
}
/*
 *  어떤 객체를 부모 타입으로 받으면  
 *  유연해진다. (유지보수가 편해진다.)
 *  
 */
