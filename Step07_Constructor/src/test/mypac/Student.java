package test.mypac;
/*
 *  생성자 (Constructor)
 *  
 *  1. 정의 하지 않아도 default 생성자는 있다고 간주된다.
 *  2. 생성자는 return type이 없고 이름은 클래스명과 동일하다.
 *  3. 객체를 생성(new)하는 시점에 호출된다.
 *  4. 초기화 작업을 할게 있을 때 생성자 안에서 하면된다.
 *  5. 생성자는 다중정의(overloading) 할 수도 있다.
 *  6. 생성자를 하나라도 정의하면 default 생성자는 없어진다.		=>다른 생성자를 사용하려면 명시적으로 default 생성자를 써놔야 한다. 아니면 default를 못 만드므로.
 *  7. 생성자도 메소드와 마찬가지로 인자를 전달 받을수 있다.
 */
public class Student {
	//필드
	private String name;	//private는 이 클래스에서만 쓰겠다. 생성자에 전달받은 인자를 저장하는 필드.
	//default 생성자		=>new Student(); 이 모양이 default 이다.
	public Student() {	//생략되어 있는 Student 클래스의 생성자. 리턴타입이 없으므로 메소드는 아니다.	객체를 생성할때 실행순서가 이쪽으로 한 번 들어온다.
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	//String type 을 인자로 전달받는 생성자
	public Student(String name) {	// 보통 생성자에 전달 받은것은 필드에 저장 해두었다가 메소드에 전달하여 특정 작업을 할 수도 있다.
		//생성자의 인자로 전달받은 data 를 필드에 저장하기
		this.name=name;		//this.name 은 null 이었지만 인자로 name을 받아서 private String name=name; 이란 필드가 생기는 .. 마치 옵션을 준것처럼 된다.
	}
	//메소드
	public void showInfo() {
		System.out.println("내 이름은: "+this.name+" 입니다.");
	}
}





/*
 *  의미: 어떤 클래스는 용도에 따라 객체를 다르게 생성 할 수가 있다.
 *  마치 객체를 생성할때 옵션을 전달하는 느낌적인 느낌.
 */