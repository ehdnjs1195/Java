package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//showNum() 메소드를 호출하는 코드를 작성해보세요.
		MainClass03.showNum(39900);
		int a=999;
		//showNum() 메소드를 호출할 때 a 변수 안에 있는 값을 전달해 보세요
		MainClass02.showMsg("아닙니다!!");
		MainClass03.showNum(a);
		
		MainClass02.showMsg("입니다!~매우 싸쥬?");
		
	}
	public static void showNum(int num) {
		System.out.println("가격: "+num+"원");
		
	}
}
