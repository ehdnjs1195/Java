package test.main;

public class MainClass07 {
	
	static int totalMoney=100000;
	
	public static void main(String[] args) {
		new MoneyThread("김구라").start();
		new MoneyThread("해골").start();
	}
	/*
	 *  여러개의 스레드가 경쟁적으로 호출하는 메소드에 synchronized 예약어를
	 *  붙이면 하나의 스레드가 작업을 끝낼때 까지 다른 스레드는 기다리게 함으로써 
	 *  문제가 발생할 가능성을 없애준다.
	 */
	//호출될 때 마다 1원씩 리턴해주는 메소드
	public synchronized static int getMoney() {
		if(totalMoney == 0) {
			System.out.println("잔고가 없어요");
			return 0;
		}
		totalMoney--;
		return 1;
	}
}
/*
 *	두 개의 쓰레드가 하나의 필드를 사용하다 보면
 *	값이 안 맞아 떨어질 수도 있다.
 *	(두 명이 인출한 값을 합쳤을 때 10만원이 넘는 경우가 생김) 
 *	(잔고가 없는데 해골이 인출하기도 하고 혹은 김구라가 인출하기도 하고)
 *	이런 문제를 방지하기위해 getMoney() 메소드에 synchronized를 붙여준다. 
 *	그러면 총 합은 무조건 10만원에 맞춰진다.
 */
