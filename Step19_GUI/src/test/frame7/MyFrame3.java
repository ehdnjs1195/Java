package test.frame7;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame3 extends JFrame implements ActionListener{
	//메소드에서 사용할 필드 선언
	JTextField inputNum1,inputNum2;
	JLabel label_result;
	//생성자
	public MyFrame3(String title) {	//생성자의 인자로 프레임의 제목을 전달받아서 
		super(title);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// x, y, width, height 를 한번에 저장하기
		setBounds(200, 200, 500, 500);
		// 레이아웃 설정하기
		setLayout(new BorderLayout());
		// 패널 객체를 만들어서
		JPanel p1=new JPanel();
		
		// 메소드에서 참조값을 사용할 수 있도록 참조값을 필드에 저장한다.
		this.inputNum1=new JTextField(10);
		inputNum2=new JTextField(10);
		
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JLabel label_equal=new JLabel("=");
		label_result=new JLabel("0");
		p1.add(inputNum1);
		p1.add(plusBtn);
		p1.add(minusBtn);
		p1.add(inputNum2);
		p1.add(label_equal);
		p1.add(label_result);
		add(p1, BorderLayout.NORTH);
		
		//1. 버튼이 동작하게 한다.
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		//두 버튼을 눌렀을때 각각 다른 동작을 해야하기 때문에 액션 command를 설정한다.
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		
		// 화면에 보이게 하기
		setVisible(true);
	}
	// 버튼을 누르면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {	
		String command=e.getActionCommand();
		double result=getResult(command);
		label_result.setText(Double.toString(result));
	}
	
	public double getResult(String command) {
		double result=0;
		try {
			//2. 입력한 숫자를 읽어와서
			String strNum1=inputNum1.getText();
			String strNum2=inputNum2.getText();
			if(command.equals("plus")) {
				result=Double.parseDouble(strNum1)+Double.parseDouble(strNum2);
			}else if(command.equals("minus")) {
				result=Double.parseDouble(strNum1)-Double.parseDouble(strNum2);
			}
		}catch(NumberFormatException nfe){
//			nfe.printStackTrace();
			JOptionPane.showMessageDialog(this, "숫자 형태로 입력하시오");
		}
		return result;
	}
	
	public static void main(String[] args) {
		new MyFrame2("MyFrame");
	}
}


