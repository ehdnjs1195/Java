package test.main2;

import java.io.BufferedWriter;
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
			socket=new Socket("192.168.0.2",5000);	//socket이 생성되는 시점에 서버에 연결 요청이 됨.
			System.out.println("Socket 연결 성공");
			// 서버에 출력할 수 있는 객체의 참조값 얻어오기
			OutputStream os=socket.getOutputStream();	//문자열을 출력하기 힘들다
			OutputStreamWriter osw=new OutputStreamWriter(os);
			BufferedWriter bw=new BufferedWriter(osw);
			bw.write(msg);	//문자열을 서버에 출력하기
			bw.newLine(); 	//개행기호 출력. 개행기호를 출력해야만 서버에서 줄 단위로 읽어낼 수 있다.
			bw.flush(); 	//밀어내기
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
