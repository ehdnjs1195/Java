package test.main;

import test.mypac.Car;	

public class MainClass01 {
	public static void main(String[] args) {
		//Car type 객체의 drive() 메소드 호출하기
		new Car().drive();	
		//Car type 객체의 필드에 값 대입하기
		new Car().brand="Tesla";	
		//Car type 객체의 필드에 저장된 값 읽어오기. 지역변수를 선언하여 값을 가져온다.
		String a=new Car().brand;	
	}
}
/*
 *  heap 영역에는 new 할때마다 각각의 객체가 생성된다.
 *  객체를 생성하고 1회용으로 한 번 사용하고 사라짐. 다음에 사용 불가능. 여러번 사용하려면 변수를 선언해야한다.
 *  
 *  - new Car()를 하면 heap 영역에 객체가 만들어진다. 실행을 하면 이 자리는 id값(참조값)으로 대체된다. 
 *  - new Car() 에 쩜(.)을 찍으면 참조값에 쩜찍은것이다. ex) id=15면 		15.drive(); 15.brand; 
 */