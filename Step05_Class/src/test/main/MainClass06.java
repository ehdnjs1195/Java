package test.main;

import test.mypac.Dragon;

public class MainClass06 {
	int a=10;
	public static void main(String[] args) {
		//Dragon 객체를 생성해서 공격하고, 움직여보세요
		Dragon d1=new Dragon();
		d1.attack();
		d1.move();
		
		//Dragon 객체를 생성해서 데미지 입히기
		Dragon d2=new Dragon();
		d2.attack();
		d2.demage();
		
		System.out.println("---공격력 upgrade 후---");
		Dragon.attDemage=30;	//Dragon static 필드에 업그래이드 함. 모든것에 변경을 줌.
		
		d1.attack();
		d2.attack();
		
	}
}

/*
 * 	void 는 어떤 값도 리턴하지 않겠다
 *  만약 정수를 return 하고 싶으면 void 자리에는 int가 와야한다.
 */
