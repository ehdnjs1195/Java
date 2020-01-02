package test.mypac;
/*
 *  [ 메소드를 만들때 고려해야 할 사항 ]
 *  
 *  1. 접근 지정자
 *  2. static or non static
 *  3. return type
 *  4. 메소드명
 *  5. 메소드에 전달 받는 인자의 갯수와 데이터 type
 */
public class MyUtil {
	//날씨를 콘솔창에 출력하는 메소드
	public static void showWeather() {
		System.out.println("오늘은 첫눈이 와요!");
	}
	//날씨를 콘솔창에 출력하는 메소드
	public void printWeather() {
		System.out.println("오늘은 쌀쌀해요!");
	}
	//날씨를 String type 으로 리턴하는 메소드
	public String getWeather() {
		//날씨를 얻어오는 작업을 수행했다고 가정
		String msg="오늘은 흐려요";
		//String type 을 리턴해주기. (String type을 리턴해주면 위에 getWeather가 오류가 안난다.) 
		return msg;
	}
	//Pen 객체를 리턴해주는 메소드
	public Pen getPen() {
		Pen p=new Pen();	//p에 Pen type의 참조값을 넣어주어 return 해준다.
		return p;
	}
	//총을 발사하는 메소드
	public MyUtil fire() {
		System.out.println("BAAMM~");
		//this 는 메소드를 감싸고 있는 클래스로 생성된 객체의 참조값을 가리킨다.	=>MyUtil type  ex) MyUtil a=this; 성립함.
		return this;
	}
	
	// 인자로 전달받은 int type을 콘솔에 출력하는 메소드
	public void showNum(int num) {
		System.out.println("num: "+num);
	}
	// int type과 String type 을 전달 받는 메소드
	public void showInfo(int num, String name) {
		System.out.println("num: "+num+" name: "+name);
	}
	// Pen type 을 전달 받는 메소드
	public void usePen(Pen p) {		//같은 패키지에 있으므로 Pen type은 임포트 하지 않아도 된다.
		p.write();
	}
}






