package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		FileInputStream fis=null;		//바이트 알갱이를 한 개씩 읽어들이는 객체		파일객체를 넣어주던지 혹은 경로를 넣어주던지
		FileOutputStream fos=null;		//바이트 알갱이를 한 개씩 출력하는 객체
		try {
			//파일로부터 읽어들일 객체의 참조값
			fis=new FileInputStream("c:/myFolder/kim1.png");	//밖에서 지역변수를 만들고 try 안에서 객체를 생성한다.
			//파일에 출력할 객체의 참조값
			fos=new FileOutputStream("c:/myFolder/kim11.png");	//kim1.png를 읽어서 kim11.png로 출력하겠다
			while(true) {
				//1 byte 를 읽어들이고
				int data=fis.read();	// 알갱이 하나씩 읽어오므로 65000 번의 과정을 반복해야 한다. data 는 0~255 의 숫자가 들어간다.
				if(data==-1)break;	//다 읽었으면 (-1를 반환하므로 )반복문 탈출.
				//읽어들인 1byte 출력하기
				fos.write(data);
				fos.flush();		
			}
			System.out.println("파일을 복사 했습니다.");
			//while문 안에서 Exception이 발생하면 건너 뛸 가능성이 있으므로 
			//여기서 close()하면 안된다.
		} catch(Exception e) {	//Exception으로 받으면 모든 타입의 부모타입이므로 한 번에 다 잡힌다고 볼 수 있다
			e.printStackTrace();
		} finally {	//finally절은 Exception이 발생하든 안하든 반드시 수행하는 구간이므로 여기서 close()
			try {
				if(fis!=null)fis.close();	//fis 과 fos 는 사용하고 나면 안전하게 close()를 해주어야 한다. 그래야 파일이 생성됨
				if(fos!=null)fos.close();	//만약 파일명을 잘못 작성하여 fis와 fos 객체가 생성되지 않으면 fis,fos 는 null이 들어가있는 상태이므로 null이 아닐때를 체크해야 한다.
											//NullPointException이 발생하지 않는다.
			} catch(IOException e) {
				e.printStackTrace();
			}
		}//try
	}//main
}//class
