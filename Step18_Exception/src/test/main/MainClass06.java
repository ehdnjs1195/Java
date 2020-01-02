package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import test.mypac.Heater;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  날씨가 춥다. 어떻게 할까?
		 *  난방을 한다!
		 */
		Heater heater=null;	//밖에서 선언하여 try,catch,finally에서 각각 사용할 수 있다.	(try문 안에서만  new 하게 되면 지역변수는 try 안에서만 사용할 수 있기 때문에 빈 지역변수를 미리 만들어 둔다)
		try {
			heater=new Heater();
			heater.heat();//난방을 뜨끈하게 하고 일을 시작!
			
			Scanner	scan=new Scanner(System.in);
			System.out.print("정수 입력: ");
			int num=scan.nextInt();			//여기서 Exception이 발생할 수 있다. 불날 가능성이 있으므로 예외를 잡아야 한다.
			System.out.println("입력한 정수: "+num);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
		} finally { //Exception 발생과 상관없이 실행이 보장되는 블럭
			//무언가 마무리 작업은 여기서 하면 된다.	예외가 발생하지 않아도 들어오고, 발생해도  catch작업 후 들어온다.
			heater.off();//작업을 다했으면 히터를 꺼요!
		}
		
	}
}	
