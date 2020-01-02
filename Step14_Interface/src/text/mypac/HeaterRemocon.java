package text.mypac;

public class HeaterRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("온도를 UP!UP!");
	}

	@Override
	public void down() {
		System.out.println("온도를 DOWN!");
	}
	
}
