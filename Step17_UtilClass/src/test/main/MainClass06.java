package test.main;

import java.util.HashMap;

import test.mypac.Pen;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. Pen 객체를 담을수 있는 HashMap 객체를 생성해서 참조값을 pens 라는 지역변수에 담아보세요
		HashMap<String, Pen> pens=new HashMap<>();

		// 2. pens 객체에 Pen 객체를 3개 생성해서 담아 보세요. 
		// 단, 담을때 key 값은 "red_pen", "green_pen", "blue_pen" 으로 담아보세요
		pens.put("red_pen", new Pen("red"));
		pens.put("green_pen", new Pen("green"));
		pens.put("blue_pen", new Pen("blue"));
		
		//3. Pens 에 들어있는 Pen 객체의 참조값 불러오기, 객체의 메소드 호출해보기
		pens.get("red_pen").write();
		pens.get("blue_pen").write();
		Pen pen1=pens.get("green_pen");
		pen1.write();
		
		
		boolean a=pens.isEmpty();
		System.out.println("pens 객체가 비어있는가? "+a);
		
		pens.clear();
		boolean b=pens.isEmpty();
		System.out.println("clear 후 pens 객체가 비어있는가? "+b);
		
		boolean c=pens.containsKey("red_pen");
		System.out.println("red_pen의 key가 있는가?"+c);
		
		
		
	}
}
//HashMap : Key 값으로 Value를 관리한다. => key에 부여된 id값이 value에 부여된 id값을 관리하는 것이다.

//key, value 로 관리하고 싶으면 HashMap<>	=> {key: value, key:value, ...}
//순서대로 관리하고 싶으면 ArrayList<>		=> [ A, B, C, ...]

// ArrayList<Map<String,Pen>> list=new ... => key, value로 되어있는 것을 순서대로 관리하고 싶으면...
// java script로 치면 => [{},{},{}, ...]	게임 만들때 사용했던 모양

// 간략히 쓰면 List<Map<String, Pen>> list=new ArrayList<>();	=>인터페이스로 쓴다.	ArrayList는 List를 구현한 클래스. 객체는 클래스로 만들수 있으므로 List로 쓸 수는 없다.















