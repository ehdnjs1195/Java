package test.main;

import test.mypac.Animal;
import test.mypac.Animal.Monkey;	//Monkey는 Animal클래스의 내부클래스구나!
import test.mypac.Animal.Rabbit;

public class MainClass01 {
	public static void main(String[] args) {
		//Animal 객체를 생성해서
		Animal ani=new Animal();
		//메소드를 이용해서 Monkey 객체 참조값 얻어오기
		Monkey m=ani.getMonkey();
		//메소드를 이용해서 Rabbit 객체 참조값 얻어오기
		Rabbit r=ani.getRabbit();
		//Monkey 와 Rabbit 객체의 메소드 호출하기
		m.say();
		r.say();
		
		new Animal.Monkey();//이너 클래스의 객체를 생성하려면 메소드를 호출하는 방식으로만 가능한가? 아니다 하지만 이런식으론 접근하지 안는다!
		
	}
}
