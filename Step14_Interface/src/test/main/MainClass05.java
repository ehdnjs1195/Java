package test.main;

import text.mypac.Calculator;

public class MainClass05 {
	public static void main(String[] args) {	//메소드 한 개짜리 인터페이스를 활용하는 방법
		
		Calculator add=(a, b)->{return a+b;};	
		Calculator sub=(a, b)->a-b;		// 위 같은 모양이 한 줄일때 줄여서 이렇게 쓸 수 있다. (바로 리턴할 값)
		Calculator multi=(a, b)->a*b;
		
		double result1=add.execute(10,20);
		double result2=sub.execute(100,90);
		double result3=multi.execute(10,10);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
