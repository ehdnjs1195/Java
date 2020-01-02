package test.mypac;

public class SuperWeapon extends Weapon{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("이제 오함마를 가져옵니다.");
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("뭉개버려요~");
	}
}
