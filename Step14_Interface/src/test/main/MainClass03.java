package test.main;

import text.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {		//{}는 implements Remocon 된 익명의 클래스
			@Override
			public void up() {
				System.out.println("UP!!");
			}
			@Override
			public void down() {
				System.out.println("DOWN!!");
			}
		};
		// useRemocon 메소드 호출하면서 Remocon type 참조값 전달하기
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("메소드 직접호출  UP!");
			}
			@Override
			public void down() {
				System.out.println("메소드 직접호출 DOWN!");
			}
		});
		
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
