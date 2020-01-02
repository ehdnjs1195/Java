package test.main;
/*
 * [ Java 참조 데이터 type ]
 * 
 * 	String
 * 
 * - 문자열을 다룰때 사용하는 데이터 type 이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		String name="김구라";
		String msg="안녕하세요!";
		String fortune="동쪽으로 가면 귀인을 만나요";
		String fortuneToday="행신동으로 가면 반장님을 만나요!";
		
		//name 안에 들어있는 참조값을 tmp1 변수에 대입하기(참조값 복사)
		String tmp1=name;
		String tmp2=msg;
		
		
		int num=10;
		//num 안에 들어있는 value 를 tmp3 변수에 대입하기(value복사)
		int tmp3=num;
		
		
	}
}
/*
 * 참조데이터타입은 변수안에 아이디값이 들어간다. (참조키값) 사물함으로 비유하면 참조값(id): 사물함키, 사물함 안에들어 있는것 : 객체 (object)
 * tmp1,2 는 위의 참조키값을 복사한 것과 같다. 
 * tmp3는 참조값을 복사한 것이 아니고 value값을 복사한것이다.(기본데이터타입이므로)
 * 
 *  - 참조데이터 타입은.
 * 	객체는 저장소(field)와 기능(method)으로 이루어져있다.
 * (사물함(heap)안에는 객체가 있고, 몇번 사물함에 있는지 알려주는 것을 참조값.)
 * 객체는 반드시 타입을 가지고 있다.
 * 객체의 타입에 따라 무슨 저장소를 가질지, 무슨 기능을 가질지 다 다르다.
 * ex) System.out.println(); => System 안에 있는 out이라는 저장소에 println이란 기능을 사용하겠다.
 * ex) tmp1에 . 을 찍어서 나오는 것들이 String 타입이 가지고 있는 기능들이다. 
 * 
 * 
 */