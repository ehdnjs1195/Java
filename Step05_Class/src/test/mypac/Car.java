package test.mypac;
/*
 * 	[ 클래스의 용도 ]
 * 
 * 1. static 필드나 메소드를 감싸는 역활
 * 2. 객체의 설계도 역활
 * 3. Data Type 역활
 */
public class Car {	//static을 붙이지 않고 객체를 만들면 heap 영역에 올라간다.	Car class에 설계한 대로 field와 method를 만들면 그에 따른 객체가 만들어진다.
	//제조사
	public String brand=null;	// field(참조데이터타입)는 선언만 해도 알아서 null이 들어간다. =>알아서 빈 공간이 만들어진다.
	
	//달리는 기능
	public void drive() {
		System.out.println("달려요");
	}
	public void showBrand() {
		System.out.println("제조사: "+this.brand);	//this: 내가 객체가 되었을때 나의 참조값. 즉, 내 클래스 안에서 참조값을 가져오는 것. 타입은 Car.
	}												//여기서는 this가 생략이 가능하다. 같은 클래스이므로.
}
