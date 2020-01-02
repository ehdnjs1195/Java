package test.main;

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
import javax.swing.JTextArea;

public class FrameExample extends JFrame implements ActionListener{
	//필드
	JTextArea area;
	//생성자
	public FrameExample(String title) {
		super(title);
		//메뉴 아이템 만들기
		JMenuItem item=new JMenuItem("Open");
		//메뉴 아이템을 감싸줄 메뉴 만들기
		JMenu menu=new JMenu("File");
		menu.add(item);
		
		//메뉴를 감싸줄 메뉴바 만들기
		JMenuBar bar=new JMenuBar();
		bar.setBounds(0, 0, 500, 20);
		bar.add(menu);
		//프레임에 메뉴바 추가하기
		add(bar);
		
		//텍스트 파일의 내용을 출력할 UI
		area=new JTextArea();
		area.setBounds(0, 20, 500, 480);
		//프레임에 추가하기
		add(area);
		
		//Open 메뉴 아이템을 눌렀을때 동작하기 위해
		item.addActionListener(this);
		item.setActionCommand("open");
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
			JFileChooser fc=new JFileChooser();
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
		}//if
	}//actionPerformed()
}//class
