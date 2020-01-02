package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Table extends JFrame implements ActionListener {
	private JTextField inputTextNum;
	private JTextField inputTextName;
	private JTextField inputTextAddr;
	public Table(String title) {
		super(title);
		initUI();
	}
	public void initUI() {
		setLayout(new BorderLayout());
		setBounds(100, 100, 600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		String header[]= {"번호","국어","영어","수학"};
		String contents[][]= {
				{"박영수","90","87","98"},
				{"김영희","100","99","100"},
				{"김철수","30","25","9"},
				{"김철수","30","25","9"}
		};
		
		JTable table=new JTable(contents,header);
		JScrollPane scrollpane=new JScrollPane(table);
		add(scrollpane);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		JFrame frame=new Table("Table");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
