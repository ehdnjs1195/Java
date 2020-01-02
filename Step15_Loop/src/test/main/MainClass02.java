package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		String[] names= {"김구라","해골","원숭이","주뎅이","덩어리","추가"};
		for(int i=0;i<names.length;i++) {
			//i번째 String type 참조하기
			String tmp=names[i];		//확장 for문: for(String tmp:names){} 으로 줄여쓸 수 있다.	반복문 도는동안 i값(제어변수)을 활용할 필요가 없을때, 0번방에서 순서대로 쭉 쓸때 사용한다.
			System.out.println(tmp);
		}
		System.out.println("--확장 for 문을 활용하면--");
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
