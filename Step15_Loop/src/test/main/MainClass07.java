package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("i: "+i);
			
		}
		System.out.println("while 문으로 같은 반복문 수행하기");
		int count=0;
		while(count<5) {	//count<5 조건이 false일 때 까지 수행한다.
			System.out.println("count: "+count);
			count++;
		}
	}
}
