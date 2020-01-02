package test.main;

import test.mypac.MyPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		MyPhone p1=new MyPhone();
		MainClass06.usePhone(p1);
	}
	
	//이미 준비된 메소드를 다운받아왔다고 가정하고 메소드를 재정의 하고 싶을때
	public static void usePhone(SmartPhone p) {
		System.out.print("유석이에게 ");
		p.call();
		System.out.print("도원이의");
		p.takePicture();
		System.out.print("하루종일");
		p.doInternet();
	}
}
// SmartPhone의 동작을 수정하기 위해 자식클래스를 만들고 오버라이드를 통해 Phone의 메소드를 재정의한다.
// 다른동작,원하는 기능을 사용하고 싶으면 하위클래스를 만들고 오버라이드를 한다.

//의미: 이미 만들어진 메소드를 가져다 사용을 할 때, 원하는 기능 등으로 오버라이드하여 사용한다.
