package test.main;
/*
 * [ Java 기본 데이터 type ]
 * 
 * 3. 문자형(char)
 * 
 * - 65536 가지의 코드값을 가질수 있고 전세계에 있는 모든 문자 한 글자를 표현할 수 있다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		//char 형 변수 선언과 동시에 값 대입하기
		char ch1='a';	//char 싱글따옴표로 감싸서 한글자만 표시.
		char ch2='b';
		char ch3='c';
		char ch4='가';
		char ch5='갸';
		
		//내부적으로 정수 code 값으로 처리된다.
		int code1=ch1;
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
		int code5=ch5;
		
	}
}
