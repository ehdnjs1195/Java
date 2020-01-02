package test.mypac;

public class Counter {
	
	// int type 을 저장할 field 정의하기
	public static int count=0;	//static field : 어떠한 데이터를 가지는 저장소		Counter.count (참조방법)
	// public을 붙여주어야만 다른 패키지에서 참조할 수 있다.(공개하는 기능)
	public static void addCount() {	// static method	Counter.addCount()  (호출방법)
		// 이 메소드가 몇 번 호출되었는지 자체적으로 저장을 하고 싶다면?
		// 지역변수에 저장하는 것은 안된다. why? 지역변수는 한 번만 만들어졌다가 클래스를 빠져나가면 사라지기 때문이다. 
		// 따라서 클래스 자체에 저장소로 공간이 필요하다.
		Counter.count++;	//Counter는 생략 가능. 같은 클래스에 있으므로 
	}
}
