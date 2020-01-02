package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//Car type 의 참조값을 담을수 있는 car1이라는 이름의 빈 지역변수 만들기
		Car car1=null;	//Car type 이기 때문에 String 이나 다른 참조데이터 타입의 참조값은 들어갈 수 없다. ex) car1="HI"; 안됨.
		//car1 에 Car 객체의 참조값을 담아보세요.
		car1=new Car();
		
		Car car2=null;	
		//car2에 참조값이 없기때문에 실행하면 에러 발생.
		car2.drive();	//참조값에 .찍어야 하는데 지금 car2에는 참조값이 없는 상태이다. null로 빈 공간을 만든것 뿐이기 때문에
		
	}
}
