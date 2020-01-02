package test.main;

import text.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		class MyRemocon implements Remocon{
			@Override
			public void up() {
				System.out.println("UP!");
			}
			@Override
			public void down() {
				System.out.println("DOWN!");
			}
		}
		Remocon r1=new MyRemocon();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
