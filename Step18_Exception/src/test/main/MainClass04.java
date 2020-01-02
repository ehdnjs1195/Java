package test.main;

import java.util.Scanner;

import test.mypac.GuraException;

public class MainClass04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("클럽입니다.");
			System.out.print("이름을 입력하세요: ");
			String name=scan.nextLine();
			if(name.equals("김구라")) {
				throw new GuraException("김구라 출입금지!");	//프로그래머가 원하는 시점에 Exception을 발생시킴. throw 예약어를 이용해서 예외를 생성함. RuntimeException을 상속받으면 try~catch로 묶을 필요가 없다.
			}											//무조건 try~catch를 사용하게 하고싶으면 그냥 Exception을 상속받는다.
			System.out.println(name+" 님 클럽에서 신나게 놀아요");
		}catch(GuraException ge) {
			ge.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
/*
 *	Java Virtual Machine (자바 가상머신)
 *	예외처리는 JVM이 해준다. 
 */
