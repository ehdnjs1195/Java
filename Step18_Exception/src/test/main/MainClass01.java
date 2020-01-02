package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);	//System.in =>키보드로 부터 입력받을 수 있도록. 생성자 인자로 넣어줌.
		
		//Exception 이 발생할 수 있는 code 블럭을 try{} 안에 위치 시킨다.
		try {
			System.out.print("나눌 수 입력(젯수): ");
			int num1=scan.nextInt();
			
			System.out.print("나누어 지는 수 입력(피젯수): ");
			int num2=scan.nextInt();
			
			double result=num2/num1;
			System.out.println(num2+"/"+num1+" = "+result);
		}catch(InputMismatchException ime) {	//catch(예외type 변수)		ime에 예외객체 참조값이 전달된다.	Exception 이 발생하면 실행 순서가 catch로 뛰어버린다. 
			System.out.println("숫자로 입력하시오.");
			ime.printStackTrace(); 	//stack 에서 일어난 정보를 출력해라(오류정보를 알고싶을때)
		}catch(ArithmeticException ae) {
			System.out.println("0으로는 나눌 수 없습니다.");
			ae.printStackTrace();
		}
		
		
		System.out.println("main 메소드가 종료되었습니다.");
	}
}

/*
 * Exception 도 타입이다.
 * 값을 정해진 타입으로 넣지않고 잘못된 값을 넣으면 InputMismatchException 이 발생한다.
 * =>흐름이 다른곳으로 이동하여 end 되어버린다. (정상적으로 마무리 되지 못함)
 * 
 * 예외가 발생할 수 있는 블럭을 try 문안에 위치시키고 catch문으로 예외를 처리한다.
 */