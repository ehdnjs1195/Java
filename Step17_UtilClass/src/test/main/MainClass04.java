package test.main;

import java.util.ArrayList;

import test.auto.Car;
import test.auto.Engine;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car type 을 담을 수 있는 가변 배열객체를 생성해서 참조값을 cars라는 지역변수에 담기
		ArrayList<Car> cars=new ArrayList<>();
		//2. cars 배열에 pen 객체를 각각 3개 생성해서 순서대로 담아보세요.
		cars.add(new Car(new Engine()));
		cars.add(new Car(new Engine()));
		cars.add(new Car(null));
		//3. 반복문을 이용해서 cars 배열에 저장된 Car 객체의 참조값을 이용해서 순서대로 참조해서 .drive() 메소드를 호출해 보세요.
		for(Car tmp:cars) {
			tmp.drive();
		}
	}
}
//List<Car> cars=new ArrayList<>(); 	ArrayList 에는 List를 인터페이스로 구현하고 있으므로 List로 받을 수 있다. 
//기능 목록을 더 간결하게 볼 수 있음. 
