package test.main;
/*
 * [ Java 기본 데이터 type ]
 * 
 * 2. 논리형(boolean)
 * 
 * - 가질수 있는 값의 범위: true, false
 * - 만드는 방법: true, false 예약어를 직접 쓰거나, 비교연산 혹은 논리연산의 결과로 얻어낼 수 있다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean isRun=true;
		if(isRun) {
			System.out.println("달리는중~");
		}
		//비교 연산의 결과로 얻어내기
		boolean isGreater=10>2;
		if(isGreater) {
			System.out.println("나: 10이 2보다 크당께");
		}
		//논리 연산의 결과로 얻어내기
		boolean result=true||false;
		if(result) {
			System.out.println("진구: 그것이 참말이여?");
		}
	}
}
