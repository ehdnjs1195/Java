package test.main;

import test.mypac.Academy;
import test.mypac.Animal;

public class MainClass04 {
	public static void main(String[] args) {
		
		/*
		 *  1. Academy 클래스의 teaching() 메소드를 재정의 하고 싶은데(파일을 따로 만들까?)
		 *  2. teaching() 메소드 하나 때문에 파일을 새로 만들기는 싫다.(내부클래스로 만들까?)
		 *  3. 내부 클래스로 만들기도 싫어! (로컬 내부클래스로 만들까?)
		 *  4. local 내부 클래스로 만들고 싶은데 type 을 만들어 내기도 싫다! 
		 */
		
		Academy ac=new Academy() {	//{}는 class이고, 이름은 익명, extends Academy 이다. 즉, {}는 extends Academy한 익명의 클래스 이다.
			@Override
			public void teaching() {
				System.out.println("스파르타 방식으로 학생들을 갈구면서 가르쳐요*^-^*");
				
			}
		};
		ac.teaching();
		ac.provideRoom();
		
	}
	
}
