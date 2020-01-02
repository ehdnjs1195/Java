package test.json;

import org.json.JSONObject;

public class MainClass4 {
	public static void main(String[] args) {
		//json 문자열 만들기
		String json="{\"num\":1, \"name\":\"김구라\",\"isMan\":true}";	//따옴표 안에서 따옴표를 쓰고 싶으면 \" 이런식으로 사용함. 따옴표 앞에 역슬래쉬
		//json 문자열을 이용해서 JSONObject 만들기
		JSONObject jsonObj=new JSONObject(json);
		int num=jsonObj.getInt("num");	//1
		String name=jsonObj.getString("name");	//"김구라"
		boolean isMan=jsonObj.getBoolean("isMan");	//true
		System.out.println(num+name+isMan);
	}
}
//클라이언트와 서버 사이에 값을 전달하고 빼내오는 과정을 할 수 있다.