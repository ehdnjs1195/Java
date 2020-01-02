package test.main;

import java.io.PrintStream;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  달려야 한다면?
		 */
		Car c1=new Car();	//필요할때 사용하기 위해서 변수에 담아둔다		이때 타입은 클래스명이다. 클래스명이 곧 타입이다.
		c1.drive(); 		//new Car()는 참조값으로 변하므로 c1에 쩜(.)을 찍어 사용할 수 있다.
		//Car type 객체의 field에 String type 참조값 대입히기
		c1.brand="테슬라";
		c1.showBrand();
		
		PrintStream a=System.out;	//out의 type이 PrintStream이다.
		a.println("오잉");
		
	}
}


//클래스명에 쩜 찍으면 static을 찾아가는거고
//참조값에 쩜찍으면 heap을 찾아가는거다.