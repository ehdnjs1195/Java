package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  기본 data type은 Generic class 로 지정할 수 없다.
		 *  따라서 기본 data type 을 Generic 으로 지정하려면 
		 *  기본 data type의 객체형을 사용해야 한다.
		 */
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//반복문 돌면서 사용하기
		for(int i=0;i<nums.size();i++) {	//고정배열이었으면 i<nums.length 를 사용했지만 가변 배열이기 때문에 nums.size()를 사용함.
			int tmp=nums.get(i);			//고정배열이었으면 nums[i] 형태였겠지만 가변 배열이기 때문에 .get(i) 을 사용함. 
			System.out.println(tmp);
		}
		System.out.println("확장 for 문을 활용하면");
		for(int tmp:nums) {		//Integer로 받아도 되지만 자동으로 int type으로 만들어주기 때문에 상관 없다.
			System.out.println(tmp);
		}
	}
}
