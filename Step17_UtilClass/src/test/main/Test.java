package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import test.auto.Car;
import test.auto.Engine;
import test.mypac.Pen;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("김구라");
		List<Integer> nums=new ArrayList<>();
		nums.add(10);
		ArrayList<Pen> pens=new ArrayList<>();
		pens.add(new Pen("red"));
		for(Pen tmp:pens) {
			tmp.write();
		}
		ArrayList<Car>	cars=new ArrayList<>();
		cars.add(new Car(new Engine()));
		pens.get(0).write();
		cars.get(0).drive();
		
		HashMap<String, Object> mem=new HashMap<>();
		mem.put("num", 1);
		mem.put("name","김구라");
		System.out.println(mem);
		int num=(int)mem.get("num");
	}
}
