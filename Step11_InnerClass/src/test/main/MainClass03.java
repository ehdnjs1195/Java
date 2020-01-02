package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// 메소드 안에서 클래스 정의가능 ( local inner class )  => 이름 익히기!
		class Coffee {
			public void eat() {
				System.out.println("냠냠~");
			}
		} 
		// 객체 생성 가능?
		Coffee c=new Coffee();
		c.eat();
	}
}
