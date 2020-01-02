package test.mypac;

public class SmartPhone extends HandPhone{
	
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//부모 클래스(HandPhone) 클래스에 정의된 메소드 오버라이드 하기(재정의)
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
//		super.takePicture();	//super.메소드명 => 부모메소드 호출.	부모메소드를 호출해야만 동작을 하는 경우가 있다.
		//super 는 부모객체
		
		System.out.println("1000만 화소의 사진을 찍어요");
	}
	
}
