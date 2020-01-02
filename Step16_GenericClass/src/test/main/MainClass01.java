package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		// Generic 클래스를 Apple 로 해서 FruitBox 객체 생성해서 참조값 얻어내기
		FruitBox<Apple> box1=new FruitBox<Apple>();	//T에 어떤 타입을 담을건지 =>필드에 Apple 타입이 들어감.	data type에 Apple클래스를 명시해주어야 함.  (.)찍고 Ctrl+space 했을 때 메소드와 필드의 모양이 달라진다.
		//push() 메소드 사용해보기
		box1.push(new Apple());
		
		//pull() 메소드 사용해보기
		Apple a=box1.pull();
		
		/*
		 *  Generic 클래스를 Banana 로 지정해서 위와 동일한 코드를 작성해 보세요.
		 */
		FruitBox<Banana> box2=new FruitBox<Banana>();
		box2.push(new Banana());
		Banana b=box2.pull();
		
		//Generic 을 Orange 로 지정
		FruitBox<Orange> box3=new FruitBox<>();	//객체 생성할 때 받을때만 Orange를 써줘도 됨. 뒤는 생략 가능
		box3.push(new Orange());
		Orange c=box3.pull();
		
		
	}
}
