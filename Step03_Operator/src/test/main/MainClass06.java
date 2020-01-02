package test.main;
/*
 *  [ 연산자 ]
 *  
 *  6. 3항 연산자
 *  
 */
public class MainClass06 {
	public static void main(String[] args) {
		int point=70;
		
//		String msg=null;
//		
//		if(point >= 60) {
//			msg="합격입니다.";
//		}else {
//			msg="불합격 입니다.";
//		}
		//	↓아래와 똑같은 로직이다.
		//	3항 연산자: 1 ? 2 : 3;		1번이 true면 2번이 남고, false면 3번이 남는다. 남는 값이 변수에 대입된다.
		String msg=point >= 60 ? "합격입니다." : "불합격입니다.";
		
		int a=point  >= 60 ? 100:0;	//type에 주의할 것.
		
		System.out.println(msg);
	}
}











