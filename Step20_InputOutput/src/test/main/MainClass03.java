package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
//		InputStream is=System.in;								//1byte
//		InputStreamReader isr=new InputStreamReader(is);		//2byte
//		BufferedReader br=new BufferedReader(isr);				//문자
		// 위의 3줄을 1줄로 작성하면 아래와 같다.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		//키보드로부터 입력받을 땐 반드시 System.in 이 필요하다.
		
		System.out.print("문자 입력(한글가능): ");
		try {
			String line=br.readLine();
			System.out.println("line: "+line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
