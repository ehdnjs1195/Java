package test.json;

import org.json.JSONArray;

public class MainClass {
	public static void main(String[] args) {
		JSONArray jsonArr=new JSONArray();	//=> [] 대괄호
		jsonArr.put("김구라");
		jsonArr.put("해골");
		jsonArr.put("원숭이");
		//JSONArray 객체 안에 있는 정보를 JSON 문자열로 얻어내기.
		String result1=jsonArr.toString();	//json 형태의 문자열로 저장됨.
		System.out.println(result1);
	}
}
