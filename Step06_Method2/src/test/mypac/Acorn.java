package test.mypac;

public class Acorn {
	
	public void study() {
		System.out.println("study() 호출됨");
	}
	
	public void study(int num) {
		System.out.println("study(int num) 호출됨");
	}
	
	public void study(String name) {
		System.out.println("study(String name) 호출됨");
	}
	/*
	 * 메소드는 같은 이름으로 오버로드 할 수 있다. 같은 이름으로 여러개 쓸 수 있다.
	 */
}
