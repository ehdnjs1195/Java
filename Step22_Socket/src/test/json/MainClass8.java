package test.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainClass8 {
	public static void main(String[] args) {
		String info="{\"num\":1, \"friends\": [10, 20, 30]}";	//jsonObject안에 jsonArray가 있는 모양
		JSONObject obj=new JSONObject(info);
		JSONArray arr=obj.getJSONArray("friends");
		for(int i=0; i<arr.length(); i++) {
			System.out.println(arr.getInt(i));
		}
		
//		for(Object tmp:arr) {
//			System.out.println(tmp);
//		}
		
	}
}
