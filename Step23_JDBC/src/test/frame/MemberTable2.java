package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.util.DBConnect;

public class MemberTable2 extends JFrame implements ActionListener{
	private JTextField inputTextNum;
	private JTextField inputTextName;
	private JTextField inputTextAddr;
	private JTextField inputTextTable;
//	private JTextField inputText3;
	private JTextArea ta;
	private JPanel panelNorth;
	private MemberDao dao=new MemberDao();
	private EmpDao eDao=new EmpDao();

	
	
	public MemberTable2(String title) {
		super(title);
		
		initUI();
	}
	
	public void initUI() {
		setLayout(new BorderLayout());
		setBounds(100, 100, 700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panelNorth=new JPanel();
		JPanel panelNorth2=new JPanel();
		panelNorth2.setBounds(0, 0, 500, 10);
		inputTextNum=new JTextField(10);
		JLabel lbNum=new JLabel("Num");
		inputTextName=new JTextField(10);
		JLabel lbName=new JLabel("Name");
		inputTextAddr=new JTextField(10);
		JLabel lbAddr=new JLabel("Addr");
		inputTextTable=new JTextField(10);
		JLabel lbTable=new JLabel("Table");
//		inputText3=new JTextField(10);
		
		
		JButton insertBtn=new JButton("Insert");
		JButton updateBtn=new JButton("Update");
		JButton deleteBtn=new JButton("Delete");
		JButton selectBtn=new JButton("Select");
		JButton allBtn=new JButton("All");
		panelNorth.add(lbTable);
		panelNorth.add(inputTextTable);
		panelNorth.add(lbNum);
		panelNorth.add(inputTextNum);
		panelNorth.add(lbName);
		panelNorth.add(inputTextName);
		panelNorth.add(lbAddr);
		panelNorth.add(inputTextAddr);

		panelNorth2.add(insertBtn);
		panelNorth2.add(updateBtn);
		panelNorth2.add(deleteBtn);
		panelNorth2.add(selectBtn);
		panelNorth2.add(allBtn);
		insertBtn.setActionCommand("insert");
		updateBtn.setActionCommand("update");
		deleteBtn.setActionCommand("delete");
		selectBtn.setActionCommand("select");
		allBtn.setActionCommand("all");
		insertBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		selectBtn.addActionListener(this);
		allBtn.addActionListener(this);

		ta=new JTextArea();
		add(panelNorth, BorderLayout.NORTH);
		add(panelNorth2, BorderLayout.AFTER_LAST_LINE);
		add(ta, BorderLayout.CENTER);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("insert")) {
			int num=Integer.parseInt(inputTextNum.getText());
			String name=inputTextName.getText();
			String addr=inputTextAddr.getText();
			boolean isSuccess=dao.insert(num, name, addr);
			ta.setText("");
			ta.append(dao.select());
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "Insert 성공했습니다!!");
			}else {
				JOptionPane.showMessageDialog(this, "사용중인 번호 입니다..");
			}
		}else if(command.equals("delete")) {
			int num=Integer.parseInt(inputTextNum.getText());
			boolean isSuccess=dao.delete(num);
			ta.setText("");
			ta.append(dao.select());
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, num+" 번 행을 삭제했습니다.");
			}else {
				JOptionPane.showMessageDialog(this, "삭제할 행이 없습니다.");
			}
		}else if(command.equals("update")) {
			int num=Integer.parseInt(inputTextNum.getText());
			String name=inputTextName.getText();
			String addr=inputTextAddr.getText();
			boolean isSuccess=dao.update(name, addr, num);
			ta.setText("");
			ta.append(dao.select());
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, num+"번 행을 수정했습니다!!");
			}else {
				JOptionPane.showMessageDialog(this, "수정할 행을 찾지 못했습니다.");
			}
		}else if(command.equals("all")) {
			ta.setText("");
			ta.append(dao.select());
		}else if(command.equals("select")) {
			MemberDto1 mem=dao.getData(Integer.parseInt(inputTextNum.getText()));
			int num=mem.getNum();
			String name=mem.getName();
			String addr=mem.getAddr();
			String info = num+" | "+name+" | "+addr+"\r\n";
			ta.setText("");
			ta.append(info);
		}
	}
	
	public static void main(String[] args) {
		new MemberTable2("Member Table");
	}
}
