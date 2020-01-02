package test.main;

import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		MyUtil.draw();
		
		try {
			MyUtil.send();		//안에서 처리를 안했기 때문에 호출하면서 처리를 해야만 한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		MyUtil.send();   main 메소드에 throw InterruptedException 해주면 JVM이 처리한다.
	}
}
