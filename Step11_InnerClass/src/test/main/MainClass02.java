package test.main;


public class MainClass02 {
	public static void main(String[] args) {
		Pen p=new Pen(); // static 메소드 안이기 때문에 static 자원만 접근가능하다.
		p.write();
//		new MainClass02().new Pen().write();	
		//Pen 클래스를 static 없이 만들려면 이렇게 써야 객체를 생성할 수 있다.
		
	}
	//내부 클래스에 한해서 필요하다면 static 예약어를 붙일 수 있다. 
	public static class Pen{
		public void write() {
			System.out.println("필기를 해요!");
		}
	}
}
