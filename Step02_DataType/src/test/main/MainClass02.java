package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어 점수
		int kor=95;
		//영어 점수
		int eng=100;
		
		//국어 점수와 영어 점수의 평균을 구해서 콘솔창에 출력하고 싶다면?
		
		//두 점수의 합
		int sum=kor+eng;
		/*
		 * 정수와 정수를 연산하면 결과는 정수
		 * 정수와 실수를 연산하면 결과는 실수가 나온다.
		 * 정확한 실수 값을 얻어내기 위해
		 * 나누기 할 때 두 수중 하나는 실수가 와야 정확한 결과값이 나온다.
		 */
		float ave=sum/2f;	//정수와 정수로 계산하면 정수로만 출력됨. 따라서 sum이나2 둘중 하나를  실수로 만들어 준다.2 뒤에 f 붙이기.
		
		System.out.println(ave);
	}
}
/*
 * 변수 안에 실제 값이 들어 있으면 기본 데이터 타입이다. => in,float,double,boolean 등
 * 변수안에 id 값이 있는것 => ex) args 는 참조 데이터 타입.
 */
