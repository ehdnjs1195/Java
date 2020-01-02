package test.main;
/*
 *  [ 연산자 ]
 *  
 *  3. 비교 연산자
 * 
 *  종류 : ==, !=, >, >=, <, <=	// javascript 에서 ===는 java의 ==와 같다. javascript에서 ==는 null 과 undefined를 비교하지 못한다.
 *  															ex) null == undefined (true), null === undefined (false) =>더 정확한 비교.
 *  - 비교 연산의 결과는 boolean type 으로 나타낸다.
 *  
 */
public class MainClass03 {
	public static void main(String[] args) {
	
		boolean result1 = 10 == 10; //true
		
		boolean result2 = 10 != 10; //false
		
		boolean result3 = 10 > 100; //false;
		
		boolean result4 = 10 >= 10; //true
	
		boolean result5 = 10 < 100; //true
		
		boolean result6 = 10 <= 10; //true	
		
		String name=null;
		// oracle 과 달리 java 에서는 null 값도 비교 가능하다.
		boolean result7 = name == null; //true
		boolean result8 = name != null; //false
	}
}























