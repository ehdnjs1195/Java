package test.main3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		try {
			//5000번 port 의 연결 요청을 기다린다.
			serverSocket=new ServerSocket(5000);
			System.out.println("클라이언트의 연결 요청을 대기중 입니다.");
			while(true) {
				//5000 번 port의 연결 요청을 기다린다.
				socket=serverSocket.accept();	//바로 리턴되지 않고 접속할 때 까지 블로킹 되있다. 클라이언트가 접속 요청을 해왔을 때 socket 객체(new Socket)가 리턴된다.	//socket 객체는 다수의 클라이언트를 기다리는 서버소켓역할을 하겠다. 방금 접속한 클라이언트와 그 소켓으로 입출력을 한다.(문자열, 파일, 등등)
				//접속된 클라이언트의 ip 주소 얻어오기
				String ip=socket.getInetAddress().getHostAddress();	//socket객체가 리턴되고 사용한다.
				System.out.println("접속된 클라이언트의 ip: "+ip);
				//접속한 클라이언트로 부터 입력받을 객체
				InputStream is=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(isr);
				//클라이언트가 전송한 문자열을 한 줄 입력받기(개행기호기준)
				String msg=br.readLine();
				System.out.println(msg);
				
				//클라이언트에게 전송할 문자열
				String toClient="안녕 나는 서버야~ 잘 있었니?";
				//클라이언트에게 출력할 객체
				OutputStream os=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(os);
				BufferedWriter bw=new BufferedWriter(osw);
				//문자열 출력하기
				bw.write(toClient);
				bw.newLine();
				bw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket!=null)serverSocket.close();
				if(socket!=null)socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("ServerMain main() 메소드가 종료됩니다.");
	}
}
