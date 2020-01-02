package test.main;

import text.mypac.HeaterRemocon;
import text.mypac.Remocon;
import text.mypac.TvRemocon;

public class MainClass01 {
	public static void main(String[] args) {
		//Remocon type 의 참조값이 필요하다면?
		Remocon r1=new TvRemocon();
		MainClass01.useRemocon(r1);
		
		System.out.println("-------------");
		
		Remocon r2=new HeaterRemocon();
		MainClass01.useRemocon(r2);
		System.out.println(r2.COLOR);
	}	
	
	//메인 메소드에 코딩을 하기 전에 미리 아래처럼 정해놓을 수 있다.
	public static void useRemocon(Remocon r) {
		r.up();
		r.up();
		r.down();
	}
}
