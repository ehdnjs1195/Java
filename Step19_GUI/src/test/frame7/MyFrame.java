package test.frame7;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextField inputNum1;
	JTextField inputNum2;
	JLabel label_result;
	//생성자
	public MyFrame(String title) {	//생성자의 인자로 프레임의 제목을 전달받아서 
		super(title);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// x, y, width, height 를 한번에 저장하기
		setBounds(200, 200, 500, 500);
		// 레이아웃 설정하기
		setLayout(new BorderLayout());
		
		// 패널 객체를 만들어서
		JPanel p1=new JPanel();
		inputNum1=new JTextField(10);
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
		add(p1, BorderLayout.NORTH);	//frame에 add
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		
		// 화면에 보이게 하기
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	
		String command=e.getActionCommand();
		if(command.equals("+")) {
			try {
				String n1=inputNum1.getText();
				String n2=inputNum2.getText();
				double result=Double.parseDouble(n1)+Double.parseDouble(n2);
				label_result.setText(Double.toString(result));
			}catch(NumberFormatException e1){
//				e1.printStackTrace();
				JOptionPane.showMessageDialog(this, "숫자형태로 입력하시오");
			}
		}else if(command.equals("-")) {
			try {
				String n1=inputNum1.getText();
				String n2=inputNum2.getText();
				double result=Double.parseDouble(n1)-Double.parseDouble(n2);
				label_result.setText(Double.toString(result));
			}catch(NumberFormatException e1){
//				e1.printStackTrace();
				JOptionPane.showMessageDialog(this, "숫자형태로 입력하시오");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new MyFrame("MyFrame");
	}
}


