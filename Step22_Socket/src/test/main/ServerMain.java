package test.main;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		try {
			//5000번 port 를 사용할 준비를 한다.
			serverSocket=new ServerSocket(5000);
			System.out.println("클라이언트의 연결 요청을 대기중 입니다.");
			while(true) {
				//5000 번 port의 연결 요청을 기다린다.
				socket=serverSocket.accept();	//바로 리턴되지 않고 접속할 때 까지 블로킹 되있다. 클라이언트가 접속 요청을 해왔을 때 socket 객체(new Socket)가 리턴된다.	//socket 객체는 다수의 클라이언트를 기다리는 서버소켓역할을 하겠다. 방금 접속한 클라이언트와 그 소켓으로 입출력을 한다.(문자열, 파일, 등등)
				//접속된 클라이언트의 ip 주소 얻어오기
				String ip=socket.getInetAddress().getHostAddress();	//socket객체가 리턴되고 사용한다.
				System.out.println("접속된 클라이언트의 ip: "+ip);
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
