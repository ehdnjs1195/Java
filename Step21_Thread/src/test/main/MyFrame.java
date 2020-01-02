package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	public MyFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		setBounds(100, 100, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임에 버튼 추가
		JButton downBtn=new JButton("다운로드");
		add(downBtn, BorderLayout.NORTH);
		//버튼에 ActionListener 등록
		downBtn.addActionListener(this); 	//등록했기 때문에 버튼을 누르면 실행순서는 actionPerformed로 넘어간다.
		
		
	}

	public static void main(String[] args) {
		MyFrame f=new MyFrame("Thread test");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {	//버튼을 누르면 들어오는 이곳 Thread는 main Thread.
		JOptionPane.showMessageDialog(this,"다운로드를 시작합니다.");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//새로운 스레드에서 다운로드 작업을 한다.
				String data=download();		//메소드를 리턴하는데 10초가 걸린다. 그 동안은 다른 반응을 할 수가 없다. 따라서 새로운 Thread를 만들어 준다.
				System.out.println("다운로드 결과: "+data);
			}
		}).start();	//새로운 작업을 start() 시키고 바로 리턴을 하게끔(1회용 객체). 그 안에서 새로운 스레드는 계속 진행되고 있다. 
	}				//필요할 때 마다 new를 해야한다. 필드변수에 담아두고 쓰는 구조는 불가능.(run() 메소드가 한 번 호출되고 나면 두 번은 사용할 수 없기 때문에 필드에 두고 사용 불가능하다.)
	//가상의 다운로드를 하는 메소드
	public String download(){
		//작업이 끝나는데 10초가 걸린다고 가정하다
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String data="html, css, javascript, image...";
		return data;
	}
}



