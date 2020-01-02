package test.main;
/*
 * 	[ Wrapper Class ]
 * 
 *  - 기본 data type 을 참조 데이터 type 으로 포장하고 싶을때 사용하는 클래스 
 *  - 기본 data type 에 관련된 메소드도 내장되어 있다.
 *  
 *  - 기본 data type의 객체형이다. =>자동으로 객체로 포장해준다.(id값 부여)
 *  - Wrapper Class로 만든 변수는 기본 data type 처럼 그냥 쓸 수 있다. int[] 에 넣는다던지.. 산술연산을 한다 던지.. 등
 *  - 객체이기 때문에 변수에 . 찍어서 활용할 수 있다.
 *  Byte, Short, Integer, Long
 *  
 *  Float, Double
 *  
 *  Character, Boolean
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		int num=10;
		// 정수 10 을 객체형으로 받기
		Integer num2=10;
		
		// 기본데이터 type 과 참조데이터 type 의 산술 연산이 자유롭다.
		int result=num+num2;
		Integer result2=num*num2;
		
	}
}
