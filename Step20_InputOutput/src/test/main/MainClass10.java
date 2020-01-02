package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass10 {
	public static void main(String[] args) {
		//이미 만들어진 memo.txt 파일에 Access 할 수 있는 객체 생성
		File f1=new File("c:/myFolder/memo.txt");		//파일 객체는 파일에 대한 정보에 대해서만 집중적일 뿐이고, 문자열을 출력하거나 하는 등의 기능이 없다.
		try {
//			// new FileWriter(File 객체, append 여부)
			FileWriter fw=new FileWriter(f1,true);	
			
//			fw.write("내 이름은 이.효.리 ");
//			fw.write("\r\n");	//개행 기호
//			fw.write("거꾸로 해도 이.효.리");
//			fw.write("\r\n");		//write로 실행하면 계속 덮어쓴다. append를 하면 입력한 내용이 계속 쌓인다.
			
			fw.append("A-yo\n");	//String 은 CharSequence 타입이기도 하다는 뜻! 따라서 CharSequence는 그냥 String을 전달해도 된다!
			fw.append("내 이름은 이.효.리 거꾸로 해도 이.효.리");
			fw.write("\r\n");
			
			fw.flush();
			fw.close(); 	//가급적이면 이런 수정중인 작업은 마무리를 해주어야 파일이 손상되는 경우를 막을 수 있다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 리턴됩니다.");
	}
}


//FileWriter를 생성하려 할때 Exception 이 발생하는 것을 try~catch 해야만 하는 것은 
//FileWriter 객체를 생성할 때 생성자에 throw를 했기 때문이다.(던져 주었기 때문이다.)
//따라서 메인메소드에서 생성할 때 try~catch로 묶어주어야만 한다.
