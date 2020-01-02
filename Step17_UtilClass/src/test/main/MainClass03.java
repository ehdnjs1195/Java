package test.main;

import java.util.ArrayList;

import test.mypac.Pen;

public class MainClass03 {
	public static void main(String[] args) {
		//1. Pen type 을 담을 수 있는 가변 배열객체를 생성해서 참조값을 pens라는 지역변수에 담기
		ArrayList<Pen> pens=new ArrayList<>();
		//2. pens 배열에 pen 객체를 각각 3개 생성해서 순서대로 담아보세요.
		pens.add(new Pen("red"));
		pens.add(new Pen("blue"));
		pens.add(new Pen("white"));
		//3. 반복문을 이용해서 pens 배열에 저장된 Pen 객체의 참조값을 이용해서 순서대로 참조해서 .write() 메소드를 호출해 보세요.
		for(int i=0;i<pens.size();i++) {
			Pen tmp=pens.get(i);
			tmp.write();	//tmp변수는 for문 안에서 돌 때마다 생겼다가 지워졌다가를 반복한다.	for문을 빠져나오면 i도 사라진다.
		}
	}
}
