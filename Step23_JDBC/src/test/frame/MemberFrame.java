package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.teacherVer.MemberDao;
import test.teacherVer.MemberDto;

public class MemberFrame extends JFrame implements ActionListener{
	//필드
	JTextArea area;
	JTextField inputNum, inputName, inputAddr;
	
	
	//생성자
	public MemberFrame(String title) {
		super(title);
		initUI();	//UI초기화
		printMember();//회원 정보 출력하기
	}
	//UI 초기화 하는 메소드
	public void initUI() {
		setBounds(100, 100, 800, 500);
		setLayout(new BorderLayout());//레이아웃 법칙 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		area=new JTextArea();
		JScrollPane scPane=new JScrollPane(area);
		add(scPane, BorderLayout.CENTER);
		//수정이나 포커스를 받지 못하도록 문자열 출력용으로 사용하기
		area.setEditable(false);
		area.setFocusable(false);
		
		//회원 정보 입력 UI 만들기
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		
		inputNum=new JTextField(10);
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		
		JButton saveBtn=new JButton("저장");
		JButton updateBtn=new JButton("수정");
		JButton deleteBtn=new JButton("삭제");

		
		//패널을 만들고
		JPanel panelTop=new JPanel();
		//패널에 UI 나열하고
		panelTop.add(label1);
		panelTop.add(inputNum);
		panelTop.add(label2);
		panelTop.add(inputName);
		panelTop.add(label3);
		panelTop.add(inputAddr);
		panelTop.add(saveBtn);
		panelTop.add(updateBtn);
		panelTop.add(deleteBtn);

		//패널을 프레임의 상단에 배치
		add(panelTop, BorderLayout.NORTH);
		
		//버튼에 액션 리스너 등록
		saveBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);

		//버튼 액션 command 설정
		saveBtn.setActionCommand("save");
		updateBtn.setActionCommand("update");
		deleteBtn.setActionCommand("delete");

		
		
		setVisible(true);
	}
	//회원 정보를 출력하는 메소드
	public void printMember() {
		//JTextArea 에 문자열 모두 지우기
		area.setText("");
		//회원 목록 출력하기
		MemberDao dao=new MemberDao();
		List<MemberDto> list=dao.getList();
		for(MemberDto tmp:list) {
			//출력할 문자열을 구성하고
			String info=tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getAddr();
			//출력하기
			area.append(info+"\r\n");
		}
	}
	
	
	//app 을 처음 launching(실행) 할 때 호출되는 메소드
	public static void main(String[] args) {
		new MemberFrame("회원정보");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();	//눌려진 버튼의 command 문자열 읽어오기
		if(command.equals("save")) {
			int num=Integer.parseInt(inputNum.getText());
			String name=inputName.getText();
			String addr=inputAddr.getText();
			//MemberDto 객체에 담고
			MemberDto dto=new MemberDto(num, name, addr);
			//MemberDao 객체를 이용해서 DB에 저장하기
			MemberDao dao=new MemberDao();
			//작업 성공 여부가 리턴된다.
			boolean isSuccess=dao.insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "저장했습니다.");
				printMember();
			}else {
				JOptionPane.showMessageDialog(this, "저장 실패!");
			}
		}else if(command.equals("update")) {
			int num=Integer.parseInt(inputNum.getText());
			String name=inputName.getText();
			String addr=inputAddr.getText();
			MemberDto dto=new MemberDto(num, name, addr);
			boolean isSuccess=new MemberDao().update(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "수정했습니다.");
				printMember();
			}else {
				JOptionPane.showMessageDialog(this, "수정 실패!");
			}
		}else if(command.equals("delete")) {
			int num=Integer.parseInt(inputNum.getText());
			boolean isSuccess=new MemberDao().delete(num);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "삭제했습니다.");
				printMember();
			}else {
				JOptionPane.showMessageDialog(this, "삭제 실패!");
			}
		}
	}
}
