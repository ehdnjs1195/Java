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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.util.DBConnect;

public class MemberTable extends JFrame implements ActionListener{
	private JTextField inputTextNum;
	private JTextField inputTextName;
	private JTextField inputTextAddr;
	private JTextArea ta;
	private MemberDao dao=new MemberDao();
	
	public MemberTable(String title) {
		super(title);
		
		initUI();
	}
	
	public void initUI() {
		setLayout(new BorderLayout());
		setBounds(100, 100, 600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panelNorth=new JPanel();
		inputTextNum=new JTextField(10);
		inputTextName=new JTextField(10);
		inputTextAddr=new JTextField(10);
		JButton insertBtn=new JButton("Insert");
		JButton updateBtn=new JButton("Update");
		JButton deleteBtn=new JButton("Delete");
		panelNorth.add(insertBtn);
		panelNorth.add(updateBtn);
		panelNorth.add(deleteBtn);
		panelNorth.add(inputTextNum);
		panelNorth.add(inputTextName);
		panelNorth.add(inputTextAddr);
		insertBtn.setActionCommand("insert");
		updateBtn.setActionCommand("update");
		deleteBtn.setActionCommand("delete");
		insertBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		ta=new JTextArea();
		add(ta, BorderLayout.CENTER);
		add(panelNorth, BorderLayout.NORTH);
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
			select();
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "Insert 성공했습니다!!");
			}else {
				JOptionPane.showMessageDialog(this, "사용중인 번호 입니다..");
			}
		}else if(command.equals("delete")) {
			int num=Integer.parseInt(inputTextNum.getText());
			boolean isSuccess=dao.delete(num);
			ta.setText("");
			select();
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
			select();
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, num+"번 행을 수정했습니다!!");
			}else {
				JOptionPane.showMessageDialog(this, "수정할 행을 찾지 못했습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		new MemberTable("Member Table");
	}
	
	public void select() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;				//이 세 객체들은 작업이 끝나면 모두 닫아주는것이 좋다.
		try {
			////Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();	
			String sql="select * from member"
					+ " order by num asc";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);	
			//sql 문 수행하고 select 결과값을 ResultSet 으로 받아오기
			rs=pstmt.executeQuery();	
			
			while(rs.next()) {								
				int num=rs.getInt("num");					
				String name=rs.getString("name");				
				String addr=rs.getString("addr");
				String info=num+" | "+name+" | "+addr;
				
				ta.append(info);
				ta.append("\r\n");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
}
