package test.json;

import org.json.JSONObject;

public class MainClass6 {
	public static void main(String[] args) {
		String info="{\"num\":1,\"name\":\"김구라\", \"addr\":\"노량진\"}";
			
		//json 형식의 문자열을 이용해서 JSONObject 객체를 생성한다.(단, JSON형식을 잘 따르고 있다면  가능/형식을 따르지 않으면 Exception 이 발생함.)
		JSONObject obj=new JSONObject(info);	//형식에 맞춰져 있는 문자열은 json을 이용해서 키값으로 정보를 빼내올 수 있다.		//반대 작업은 obj.toString 해주면 다시 위의 형태로 돌아감.
		//메소드를 이용해서 원하는 정보 추출하기
		int num=obj.getInt("num");
		String name=obj.getString("name");
		String addr=obj.getString("addr");
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(addr);
	}
}
