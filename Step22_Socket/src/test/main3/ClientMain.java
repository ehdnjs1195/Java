package test.main3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		System.out.print("서버에 전송할 문자열: ");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine();
		
		Socket socket=null;
		try {
			// new Socket(접속할 ip주소, port 번호)
			/*
			 *  나의 아이피 주소는
			 *  127.0.0.1 또는 localhost
			 *  혹은 ipconfig 를 통해서 얻어낸 아이피 주소를 사용하면 된다.(192.168.0.10)
			 */
			socket=new Socket("192.168.0.10",5000);	//socket이 생성되는 시점에 서버에 연결 요청이 됨.	
			System.out.println("Socket 연결 성공");
			// 서버에 출력할 수 있는 객체의 참조값 얻어오기
			OutputStream os=socket.getOutputStream();	//문자열을 출력하기 힘들다
			OutputStreamWriter osw=new OutputStreamWriter(os);
			BufferedWriter bw=new BufferedWriter(osw);
			bw.write(msg);	//문자열을 서버에 출력하기
			bw.newLine(); 	//개행기호 출력. 개행기호를 출력해야만 서버에서 줄 단위로 읽어낼 수 있다.
			bw.flush(); 	//밀어내기
			
			//서버로부터 입력받을 객체
			InputStream is=socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			//서버가 출력한 문자열 읽어들여 출력하기
			String fromServer=br.readLine();	//읽는 쪽이 readLine이기 때문에 보내는 쪽에서 항상 newLine이 있어야 한다.
			System.out.println("서버로 부터: "+fromServer);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket!=null)socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("ClientMain main() 메소드가 종료됩니다.");
	}
}
