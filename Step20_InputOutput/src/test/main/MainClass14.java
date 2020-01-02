package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		FileInputStream fis=null;		//바이트 알갱이를 한 개씩 읽어들이는 객체		파일객체를 넣어주던지 혹은 경로를 넣어주던지
		FileOutputStream fos=null;		//바이트 알갱이를 한 개씩 출력하는 객체
		try {
			//파일로부터 읽어들일 객체의 참조값
			fis=new FileInputStream("c:/myFolder/kim1.png");	//밖에서 지역변수를 만들고 try 안에서 객체를 생성한다.
			//파일에 출력할 객체의 참조값
			fos=new FileOutputStream("c:/myFolder/kim22.png");	//kim1.png를 읽어서 kim11.png로 출력하겠다
			//while 문에서 사용할 byte[] 객체 생성하기
			byte[] buffer=new byte[1024];	//한 번에 1kilo byte씩 읽을수 있다.
			while(true) {
				/*
				 *  .read() 메소드를 호출하면서 byte[] 객체를 전달하면 
				 *  읽어들인 byte 알갱이가 byte[] 객체에 순서대로 담긴다.
				 *  return 되는 정수는 몇개를 읽었는지 숫자가 리턴된다.
				 *  1024, 1024, 1024, ... 가 리턴되다가 마지막에는 1024보다 작은 숫자가 리턴될 가능성이 크다. 마지막 바가지가 만약 10개를 펏는데 나머지 빈공간을 같이 파일에 넣어주면 파일이 깨지게 되기때문에 숫자를 세는것이 중요하다.	
				 */
				int readedByte=fis.read(buffer);	
				if(readedByte==-1)break;
				//byte[] 배열에 있는 값을 읽은 만큼 출력한다.
				fos.write(buffer, 0, readedByte);  //buffer 배열에 있는 값을 0번 인덱스부터 읽은 만큼만(readedByte) 출력하겠다. 마지막 57까지만.
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
