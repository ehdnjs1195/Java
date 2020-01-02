package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		File f1=new File("c:/myFolder/memo.txt");
		
		try {
			//파일에서 문자열을 읽어들일 객체 생성
			FileReader fr=new FileReader(f1);		//문서를 읽어올 때는 한 글자, 한줄, 지정된 갯수, 등등 단위로 읽어온다. 문자열이 끝날 때 까지.
			BufferedReader br=new BufferedReader(fr);	//file reader의 기능이 별로라서 buffered reader를 사용
			//반복문 돌면서 한 글자씩 읽어오기
			while(true) {
				//개행기호 빼고 한줄의 문자열 읽어오기
				String line=br.readLine();	//개행기호를 기준으로 한줄씩 읽어온다. 이때 개행기호는 빼고 읽어옴. 다 읽고 나면 null을 return함.
				if(line==null)break;	//다 읽어왔으면 탈출
				System.out.println(line);	//print로 출력하면 개행기호를 읽어오지 않기때문에 문자열이 한 줄로 출력된다.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	//try문 안에 try를 쓰기보다 catch를 하나 더 잡아주는 것이 좋다.
			e.printStackTrace();
		}
	}
}
