package test.mypac;

public class MyWeapon extends Weapon{

	//추상 메소드 오버라이드가 강제 되어있다.
	@Override
	public void attack() {
		System.out.println("반장님을 후드러패요~!신명나게 패요~!");
	}
	public void abc() {
		System.out.println("abc 메소드 ");
	}

}
