package test.frame3;

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
		JButton saveBtn=new JButton("저장");
		JButton deleteBtn=new JButton("삭제");
		// x, y, width, height 를 한번에 지정
		saveBtn.setBounds(10, 10, 100, 40);
		deleteBtn.setBounds(110, 10, 100, 40);
		// 버튼을 프레임에 추가하기
		add(saveBtn);
		add(deleteBtn);
		// 버튼에 리스너 등록하기
		saveBtn.addActionListener(this);		
		deleteBtn.addActionListener(this);	
		// 버튼에 ActionCommand 추가하기
		saveBtn.setActionCommand("save");	//이 버튼은 save 버튼이다 라고 이름을 붙이는 것.
		deleteBtn.setActionCommand("delete");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		//메소드에 전달된 ActionEvent 객체에 발생한 이벤트의 정보가 들어있다.
		String command=e.getActionCommand();	//어떤 버튼을 눌렀는지 구분하기 위해
		if(command.equals("save")) {
			JOptionPane.showMessageDialog(this, "저장합니다.");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "삭제합니다.");
		}
	}
	
	
	public static void main(String[] args) {
		new MyFrame("MyFrame");
	}
}


