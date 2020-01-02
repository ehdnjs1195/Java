package test.main;

public class MainClass01 {		//클래스 안에 정의할 수 있는것  field, method, class
	
	// run 했을때 실행순서가 시작되는 특별한 메소드
	public static void main(String[] args) {
		System.out.println("main() 메소드 시작됨");
		/*
		 *  [static 메소드 호출하는 방법]
		 *  static 메소드를 가지고 있는 클래스들은 반드시 
		 *  클래스명.메소드명();
		 *  과 같은 형식으로 호출해야한다.
		 *  
		 *  객체도 필드,메소드를 가질 수 있고, 클래스도 필드,메소드를 가질 수 있는데 클래스 안에 static이라는 메소드는 호출할때 클래스명 뒤에 마침표(.)를 찍도록한다.
		 *  객체는 사물함 번호가 들어있는 참조값에 마침표를 찍고
		 *  클래스는 클래스명에 마침표를 찍고 사용
		 *  
		 *  동일한 클래스 내에 있는 메소드인 경우에는 클래스명 생략가능
		 */
		MainClass01.gura();		//메소드를 콜한다.	
		System.out.println("main() 메소드 종료됨");
		
	}	//메소드는 종료되면 return된다. 
	public static void gura() {		//인자를 전달받지 않을거면 ()를 비워둔다.
		System.out.println("gura() 메소드 시작됨");
		
		System.out.println("gura() 메소드 종료됨");
	}	//디버그에서 step into(F5)를 누르면 gura(); method로 들어오고  괄호가 끝나면 return 되어 다시 돌아간다. return 값이 있으면 가지고 돌아감.
}


/*
 * 클래스의 용도
 * 1. 스태틱 메소드와 스태틱 필드를 감싸주어 같이 올라가는 역할
 * 2. heap영역에 만들어지는 객체의 설계도 역할을 한다.(객체가 필드와 메소드를 가지도록)
 * 3. 데이터타입의 역할.클래스명이 곧 데이터타입이다.
 * 
 * 
 * 메소드를 정의할때 스태틱을 붙이면 클래스와 함께 static이라는 영역으로 올라간다~ 
 * 그 안에는 main()이라는 기능, gura()라는 기능이 있는것이다~ 이런뜻..
 * 그래서 메소드를 호출할때 MainClass01.gura() 이런식으로 쩜을 찍어서 호출한다!
 */