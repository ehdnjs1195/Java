package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();	// new 클래스명() => 소괄호는 생성자(constructor)를 호출한다.
		Student s2=new Student("AHN DOWON");
		Student s3=new Student("해골");
		String yourName="원숭이";
		Student s4=new Student(yourName);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
		
		
	}
}
/*
 * s1.name //name 필드가 나오지 않는다. private로 가려놨기 때문에 객체 안에서만 접근 가능. s1.name="xxx"; 처럼 객체 밖에서는 접근 불가능.
 * 쩜을 찍어서 볼 수 있는것은 public으로 공개된 것만 볼 수 있다. 사용자가 필드 값을 변경할 수가 있기 때문에 =>오작동의 원인이 될 수 있다.
 * 
 * private의 필드에 값을 넣어주는 메소드 setter
 * private의 필드에 값을 받는 메소드 getter
 */
