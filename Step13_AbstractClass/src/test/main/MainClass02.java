package test.main;

import test.mypac.SuperWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//다른 공격을 하는 Weapon type 의 참조값을 얻어내서 
		// .prepare()	.attack() 메소드를 호출해보세요.
		
		//anonymous Local Inner Class
		Weapon w1=new Weapon() {
			@Override
			public void prepare() {
				System.out.println("나이프를 준비합니다...");
			}
			@Override
			public void attack() {
				System.out.println("귤을 까버려요!");	
			}
		};
		w1.prepare();
		w1.attack();
		
		//Local Inner Class
		class YourWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("후드러패기 시작합니다.");	
			}
			
		}
		YourWeapon w2=new YourWeapon();
		w2.attack();
		
		//새로만든 Class
		Weapon w3=new SuperWeapon();
		w3.prepare();
		w3.attack();
		
//		new MainClass02().new NewWeapon();	//non static일 때: MainClass02의 참조값을 얻어와서 그 안에 있는 클래스를 가져온것.
		new NewWeapon();		//static을 붙이면 바로 부를 수 있다. 메인 메소드가 static 영역이기 때문에
		
	}
	//Inner Class
	public static class NewWeapon extends Weapon{	//public 을 붙여주어야 다른 패키지에서 호출이 가능하다.
		@Override									
		public void attack() {
			System.out.println("Inner Class OK");
		}
	
	}
}
