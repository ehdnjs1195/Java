package test.json;

import org.json.JSONObject;

public class MainClass2 {
	public static void main(String[] args) {
		JSONObject jsonObj=new JSONObject();	//=> {} 중괄호
		jsonObj.put("num", 1);
		jsonObj.put("name", "김구라");
		jsonObj.put("isMan", true);
		
		String result=jsonObj.toString();
		System.out.println(result);
		String a="가나다";
		System.out.println(a.chars());
	}
}
