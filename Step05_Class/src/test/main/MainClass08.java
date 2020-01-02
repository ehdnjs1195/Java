package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 1~45 사이의 랜덤한 정수를 5번 얻어내서 콘솔창에 출력하기
		 */
		Random a=new Random();
		int result=a.nextInt(45) + 1;
		int result2=a.nextInt(45) + 1;
		int result3=a.nextInt(45) + 1;
		int result4=a.nextInt(45) + 1;
		int result5=a.nextInt(45) + 1;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		//반복문을 활용한다면..
		for(int i=0;i<5;i++) {
			int b=a.nextInt(45)+1;
			System.out.println(b);
		}
	}
}
