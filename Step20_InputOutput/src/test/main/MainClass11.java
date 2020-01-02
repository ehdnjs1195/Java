package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		File f1=new File("c:/myFolder/memo.txt");
		
		try {
			//파일에서 문자열을 읽어들일 객체 생성
			FileReader fr=new FileReader(f1);		//문서를 읽어올 때는 한 글자, 한줄, 지정된 갯수, 등등 단위로 읽어온다. 문자열이 끝날 때 까지.
			//반복문 돌면서 한 글자씩 읽어오기
			while(true) {
				//FileReader 객체를 통해서 읽어들이고
				int code=fr.read();
				System.out.println("code: "+code);	//대응되는 유니코드값
				if(code==-1)break;	//더이상 읽을게 없으면(-1) 반복문 탈출, if문이 간단한 한 줄이면 괄호 없이도 사용할 수 있다.
				//code 값을 char type 으로 변환해서
				char ch=(char)code;
				//출력하기
				System.out.print(ch);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	//try문 안에 try를 쓰기보다 catch를 하나 더 잡아주는 것이 좋다.
			e.printStackTrace();
		}
	}
}
