package test.main;

import test.mypac.YourUtil;

//다른 package 에 있는 클래스를 사용하려면 import를 해야한다. 자동완성이 된다.


public class MainClass06 {
	// run 했을때 실행순서가 시작되는 특별한 main() 메소드
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적
		 *  1. 파일을 업로드하고
		 *  2. 파일을 다운로드 하는것이 목적이라면?
		 */
		YourUtil.fileUp();
		YourUtil.fileDown();
	}
}
