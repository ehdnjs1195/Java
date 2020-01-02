package test.main;

import test.mypac.MacBook;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  - 코딩을 1번하고 디자인을 2번하고 유튜브를 1번 시청해보세요.
		 */
		MacBook a=new MacBook();
		a.coding();
		a.design();
		a.design();
		a.watchYoutube();
		
	}
}
/*
 *  field & method
 *  - 오직 하나만 있어도 된다면 static으로 만든다. 단, static영역으로 올린것은 자원 회수가 안된다.
 *  - 모든 객체들이 공유하는 어떤 자원에는 static을 붙이는 것이 좋다.
 *  => 하나만 만들어 놓고 모든 객체들이 공유하고 싶을때 static을 사용한다.	ex)저글링들의 공격력을 올릴때 
 */