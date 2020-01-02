package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		//uesWeapon 메소드를 호출해보세요.
		useWeapon(new Weapon() {
		@Override
		public void attack() {
			System.out.println("새로운 공격입니다.");
		}});
		
		//지역 변수 w에 Weapon type의 참조값을 넣어서 전달하기.
		Weapon w=new Weapon() {
			@Override
			public void attack() {
				System.out.println("지역 변수 넣어서 공격하기");
			}
		};
		useWeapon(w);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		
	}
}
