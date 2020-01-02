package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AcornFrame extends JFrame implements ActionListener{
	public AcornFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btn=new JButton("전송");
		add(btn, BorderLayout.NORTH);
		btn.addActionListener(this);
		setVisible(true);//편의상 맨 아래에 두었습니다.
	}
	public static void main(String[] args) {
		new AcornFrame("acorn");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int sf=JOptionPane.showConfirmDialog(this, "gd");
		System.out.println(sf);
	}
}
