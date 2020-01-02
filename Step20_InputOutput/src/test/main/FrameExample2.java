package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FrameExample2 extends JFrame implements ActionListener{
	//필드
	JTextArea area;
	JFileChooser fc=new JFileChooser();
	//생성자
	public FrameExample2(String title) {
		super(title);
		setLayout(new BorderLayout());
		//메뉴 아이템 만들기
		JMenuItem itemOpen=new JMenuItem("Open");
		JMenuItem itemSave=new JMenuItem("Save");
		JMenuItem itemDelete=new JMenuItem("Delete");
		//메뉴 아이템을 감싸줄 메뉴 만들기 
		JMenu menu=new JMenu("File");
		menu.add(itemOpen);
		menu.add(itemSave);
		menu.add(itemDelete);
		//메뉴를 감싸줄 메뉴바 만들기
		JMenuBar bar=new JMenuBar();
		bar.setBounds(0, 0, 500, 20);
		bar.add(menu);
		//프레임에 메뉴바 추가 하기 
		add(bar, BorderLayout.NORTH);
		
		//텍스트 파일의 내용을 출력할 UI
		area=new JTextArea();
		
		//Scroll 계층에 JTextArea 를 넣고   
		JScrollPane scrollPane=new JScrollPane(area);
		scrollPane.setBounds(0, 20, 480, 480);
		
		//스크롤 계층을 프레임에 추가 하기
		add(scrollPane, BorderLayout.CENTER);
		
		//Open 메뉴 아이템을 눌렀을때 동작하기 위해
		itemOpen.addActionListener(this);
		itemSave.addActionListener(this);
		itemDelete.addActionListener(this);
		//액션 command 지정하기 
		itemOpen.setActionCommand("open");
		itemSave.setActionCommand("Save");
		itemDelete.setActionCommand("Delete");
	}
	
	public static void main(String[] args) {
		FrameExample2 frame=new FrameExample2("예제");
		frame.setSize(500, 500);
		frame.setLocation(100,100);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 어떤 ActionCommand 를 가지고 왔는지 읽어온다.
		String command=e.getActionCommand();
		if(command.equals("open")) {	//만일 open 이라는 command라면
			
			int result=fc.showOpenDialog(this);
			//만일 정상적으로 파일을 선택하고 확인을 눌렀다면
			if(result==JFileChooser.APPROVE_OPTION) {	//확인 버튼을 눌렀을때 (APPROV_OPTION 은 0)
				//선택한 파일을 Access 할수 있는 File 객체의 참조값 얻어오기
				File selectedFile=fc.getSelectedFile();
				FileReader fr=null;
				BufferedReader br=null;
				try {
					//파일에서 문자열을 읽어들일 객체 생성하기
					fr=new FileReader(selectedFile);
					br=new BufferedReader(fr);
					while(true) {
						//한줄씩 읽어낸다.
						String line=br.readLine();
						if(line==null) break;
						//읽은 내용을 JTextArea 객체에 추가하기
						area.append(line);
						area.append("\r\n");//개행기호
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				} finally {
					try {
						//마무리 작업
						if(br!=null)br.close();
						if(fr!=null)fr.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}//try
			}//if
		}else if(command.equals("Save")) {
			//선택된 File 객체를 얻어온다.
			File selectedFile=fc.getSelectedFile();
			if(selectedFile==null) {
				JOptionPane.showMessageDialog(this, "파일을 열어주세요");
				return;	//메소드 끝내기
			}
			//현재 입력한 문자열 읽어오기
			String content=area.getText();
			FileWriter fw=null;
			try {
				//파일에 문자열을 출력할 객체
				fw=new FileWriter(selectedFile);
				//문자열 출력
				fw.write(content);
				fw.flush();
				JOptionPane.showMessageDialog(this, "저장 되었습니다.");
			}catch(Exception e1) {
				e1.printStackTrace();
			}finally {
				try{
					if(fw!=null)fw.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}else if(command.equals("Delete")) {
			File selectedFile=fc.getSelectedFile();
			if(selectedFile==null)return;
			//정말 삭제할 것인지 확인하기
			int isDelete=JOptionPane.showConfirmDialog(this, "삭제 하시겠습니까?");
			if(isDelete==JOptionPane.YES_OPTION) {
				selectedFile.delete();
				JOptionPane.showMessageDialog(this, "삭제 되었습니다.");
			}
		}
	}//actionPerformed()
}//class
