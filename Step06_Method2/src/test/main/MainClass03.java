package test.main;

import test.mypac.MyUtil;
import test.mypac.Pen;

public class MainClass03 {
	public static void main(String[] args) {
		//MyUtil 클래스에 정의된 showNum() 메소드를 호출해보세요
		new MyUtil().showNum(10);
		//MyUtil 클래스에 정의된 showInfo() 메소드를 호출해보세요
		new MyUtil().showInfo(10, "DOWON");
		//MyUtil 클래스에 정의된 usePen() 메소드를 호출해보세요
		new MyUtil().usePen(new Pen());
		
		
//		new MyUtil().usePen(null);	=>NullPointerException 객체의  참조값이 없다!
	}
}
