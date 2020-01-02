package test.mypac;

public class Dragon {
	//에너지(체력)
	public int energy=200;	//드라군 객체 하나하나당 에너지가 따로이어야 하므로 static을 뺌. static을 붙이면 모든 객체가 같이 움직이게 된다.
	//공격력
	public static int attDemage=20;	//공격력은 공통으로 참조하는 성격이므로 static을 붙임.
	
	//공격하는 메소드
	public void attack() {
		System.out.println(Dragon.attDemage+" 만큼 데미지의 공격을 해요");	//static 필드는 클래스명에 . 찍어서 참조.
	}
	//움직이는 메소드
	public void move() {
		System.out.println("움직여요");
	}
	//데미지를 입는 메소드(에너지를 줄이는)
	public void demage() {
		this.energy -= 10;	//일반 필드는 this에 . 찍어서 참조.
	}
	
}
/*
 *  field & method
 *  - 오직 하나만 있어도 된다면 static으로 만든다. 단, static영역으로 올린것은 자원 회수가 안된다.
 *  - 모든 객체들이 공유하는 어떤 자원에는 static을 붙이는 것이 좋다.
 *  => 하나만 만들어 놓고 모든 객체들이 공유하고 싶을때 static을 사용한다.	ex)저글링들의 공격력을 올릴때 
 */