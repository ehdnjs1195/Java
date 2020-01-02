package test.main;

import test.mypac.MyUtil;
import test.mypac.Pen;

public class MainClass01 {
	public static void main(String[] args) {
		//날씨가 궁금하다면?
		//static 메소드는 클래스명으로 호출하고,
		MyUtil.showWeather();
		//non static 메소드는 참조값으로 호출한다.
		new MyUtil().printWeather();
		String result=new MyUtil().getWeather();		//new MyUtil().getWeather(); 는 메소드를 호출해서 String type을 리턴한다.
		System.out.println(result);
		
		Pen p=new MyUtil().getPen();
		p.write();
		
		new MyUtil().getPen().write();
	}
}
