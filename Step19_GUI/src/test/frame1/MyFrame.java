package test.frame1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	
	//생성자
	public MyFrame(String title) {	//생성자의 인자로 프레임의 제목을 전달받아서 
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// x, y, width, height 를 한번에 저장하기
		setBounds(200, 200, 300, 300);
		// 기본 레이아웃으로 동작하게 하기
		setLayout(null);
		// 화면에 보이게 하기
		setVisible(true);
		
		// 버튼
		JButton btn=new JButton("Click Me!");
		// x, y, width, height 를 한번에 지정
		btn.setBounds(10, 10, 100, 40);
		// 버튼을 프레임에 추가하기
		add(btn);
		// 버튼에 리스너 등록하기
		btn.addActionListener(this);		// ActionListener 를 구현해야 this로 ActionListener를 받을 수 있다. 구현하기 위해 오버라이드는 필수.
		//MyFrame 자체가 ActionListener임
		
	}
	
	//필드
	private int count;
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		/* 
		 * ActionListener 를 구현해야 this로 ActionListener를 받을 수 있다. 구현하기 위해 오버라이드는 필수.
		 * 버튼을 클릭했을 때 실행순서가 이 안으로 들어온다. 그래서 클릭했을 때 작업할 내용을 작성한다.
		 */
		
		//필드값 1 증가시키기
		count++;
//		System.out.println(count+"번 클릭함");
		
		//.showMessageDialog(컴포턴트의 참조값, 메세지)
		JOptionPane.showMessageDialog(this, count+"번 클릭함");		//frame의 참조값 => this
	}
	
	
	public static void main(String[] args) {
		new MyFrame("MyFrame");
		new MyFrame("MyFrame");	// 각각 고유한 필드를 갖는다.
		
	}
}

/*
 * 
   class MyListener implements ActionListener{		//ActionListener의 참조값을 new MyListener(); 로 전달할 수 있고
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	ActionListener listener=new ActionListener() {	//ActionListener의 참조값을 listener 로 전달 할 수 있다.
		@Override
		public void actionPerformed(ActionEvent e) {
			//이 지역에서의 this는 listener를 가리키므로 MyFrame의 참조값을 가져오기 위해서는 MyFrame.this 라고 클래스를 명시해주어야만 한다.
		}
	};
	
 */
