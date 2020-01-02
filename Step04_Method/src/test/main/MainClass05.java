package test.main;

import test.mypac.YourUtil;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  노래를 하고 싶다.
		 *  어떻게 하면 될까?
		 */
		MyUtil.sing();	//클래스에 있는 스태틱 메소드의 도움을 받는다.
		MyUtil.printNim("Ahn DoWon");
		MyUtil.goHome();
		new MyUtil().a();
	}
}
//내가 필요한 메소드가 객체에 있을수도 있는것이고, 스태틱영역에 있을 수도 있는것이다. 
// 쩜 (.)을 찍어서 사용하려면 반드시 static이 붙어야 한다. 그래야 클래스와 함께 스태틱 영역에 올라간다.