package text.mypac;
/*
 * 	[ interface ]
 * 
 *  - 생성자가 없다. (단독 객체 생성 불가)
 *  - 구현된 메소드는 가질수 없다. (추상 메소드만 가질수 있다.)
 *  - 필드는 static final 필드만 가질 수 있다.
 *  - data type 의 역할을 할 수 있다.
 * 	- 인터페이스 type 의 참조값이 필요하다면 해당 인터페이스를 implements 한 클래스를 이용해서 객체를 생성해서 얻어낸다.
 *  - 인터페이스는 다중 implements 가 가능하다. (클래스는 단일 extends 만 가능)
 */
public interface Remocon {	//implements 어떤 객체에 부가기능을 넣는다. 객체를 그 기능을 수행하는 것으로만 보고 작업을 할 수 있다.
	//static final 상수
	public String COLOR="#000000";	//안적어도 static final 이다.
	//추상 메소드
	public void up();	//안적어도 추상메소드이다. abstract 생략.
	public void down();
	
}
