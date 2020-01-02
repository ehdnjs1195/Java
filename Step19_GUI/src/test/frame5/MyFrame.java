package test.frame5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextField inputText;
	//생성자
	public MyFrame(String title) {	//생성자의 인자로 프레임의 제목을 전달받아서 
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// x, y, width, height 를 한번에 저장하기
		setBounds(200, 200, 300, 300);
		// 기본 레이아웃으로 동작하게 하기
		setLayout(null);
		// 화면에 보이게 하기
		setVisible(true);		//맨아래로 옮기면 실행시 바로 화면이 보인다.
		
		//JTextField 객체의 참조값을 필드에 저장
		inputText=new JTextField(10);	//다른 지역에서도 사용하기 위해선 필드로 선언해야만 한다.
		inputText.setBounds(10, 10, 200, 20);
		add(inputText);
		
		JButton sendBtn=new JButton("send");
		sendBtn.setBounds(210, 10, 80, 20);
		add(sendBtn);
		//버튼에 ActionListener 등록하기
		sendBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		//입력한 문자열 읽어오기
		String msg=inputText.getText();
		//알림에 띄우기
		JOptionPane.showMessageDialog(this, msg);
		//입력한 문자열 삭제하기
		inputText.setText(""); 
	}
	
	
	public static void main(String[] args) {
		new MyFrame("MyFrame");
	}
}


