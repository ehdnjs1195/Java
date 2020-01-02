package test.main;

import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		// Phone 객체를 생성해서 Phone type 변수에 담기
		Phone p1=new Phone();
		
		// class cast Exception 이 발생한다.
		SmartPhone p2=(SmartPhone)p1;	//Phone 객체를 만들어서 SmartPhone을 캐스팅한다. 컴파일시에 문법적으로는 맞지만 run했을 시에 오류가 발생한다.
		p2.doInternet();				//p1은 Phone 타입이 때문에 캐스팅 되지 않는다.
		
		
	}
}
