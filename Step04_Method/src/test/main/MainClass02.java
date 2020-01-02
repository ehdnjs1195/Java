package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 메소드를 호출하면서 참조값을 바로 즉석에서 만들어서 전달하기
		MainClass02.showMsg("안녕하세요");		//method를 호출하면서 어떤 값을 전달할 수 있는데  단,타입이 같아야한다.
		MainClass02.showMsg("java를 배워보아요");
		
		String str="참 재미 있어요";
		//메소드 호출하면서 변수 안에 있는 참조값을 전달하기
		MainClass02.showMsg(str);
		
	}
	//메소드의 인자로 String type 을 전달받는 static 메소드 정의하기
	public static void showMsg(String msg) {	//String type을 전달받아야 한다.
		//전달받은 내용을 가공해서 출력하기
		String result="["+msg+"]";
		System.out.println(result);	
	}
}
/*
 * 		MainClass02.showMsg(10);	//호출하면서 value값을 전달
		MainClass02.showMsg("kim");	//호출하면서 참조값을 전달
		MainClass02.showMsg(10.1);	//호출하면서 value값을 전달
		MainClass02.showMsg(true); 	//호출하면서 value값을 전달
 */
