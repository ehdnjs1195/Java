package test.mypac;

public class FruitBox<T> {	//<T> : type 을 의미하기 위해서. =>Generic Class, 여러개를 지정할 수도 있다. 대부분 하나 or 두개
	//필드의 data type 을 Generic 클래스로 지정하기
	private T item;
	//메소드에 전달받는 data type 을 Generic 클래스로 지정하기
	public void push(T item) {	
		System.out.println("push 메소드 사용");
		this.item=item;
	}
	//메소드의 return type 을 Generic 클래스로 지정하기
	public T pull() {
		System.out.println("pull 메소드 사용");
		return this.item;
	}
}
// 동적으로 필드와 메소드의 타입이 바뀐다.