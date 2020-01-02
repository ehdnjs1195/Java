package test.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainClass9 {
	public static void main(String[] args) {
		int num=1;
		String name="김구라";
		String addr="노량진";
		
		String json1="{\"num\":"+num+",\"name\":\""+name+"\","+ "\"addr\":\""+addr+"\"}";	//이렇게 만드는 것은 매우매우 힘들기 때문에!
		System.out.println("json1: "+json1);
		
		//json 문자열로 변환할 값을  JSONObject 의 메소드를 이용해서 담은 다음
		JSONObject obj=new JSONObject();
		obj.put("num", num);
		obj.put("name", name);
		obj.put("addr", addr);
		// .toString() 메소드를 호출하면 변환된다.
		String json2=obj.toString();		//toString을 하면 바로 json 형태의 배열 모양이 만들어진다.
		System.out.println("json2: "+json2);
		
		Map<String, Object> map=new HashMap<>();
		map.put("num", 2);
		map.put("name", "해골");
		map.put("addr", "행신동");
		System.out.println(" map : "+map);
		
		JSONObject obj2=new JSONObject(map);
		String json3=obj2.toString();
		System.out.println("json3: "+json3);
	}
}
