package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		int count=0;
		while(true) {	//무한 루프		실행시점에 정확한 반복 횟수를 알 수 없을때, 
			System.out.println("반복 수행중...");
			count++;
			if(count==10) {	//무한 루프 탈출 조건
				System.out.println(count);
				break;	//반복문 탈출하는 예약어
			}
		}
	}
}
