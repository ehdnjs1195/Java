package test.main;

import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		p1.doInternet();
		p1.takePicture();
		
	}
}
/*
 * new SmartPhone 을 하면 
 * Object -> Phone -> HandPhone -> SmartPhone 순으로 객체가 만들어지고
 * 하나의 사물함(참조값)에 담긴다. 
 * 그 참조값은 SmartPhone 타입이다. 
 */
