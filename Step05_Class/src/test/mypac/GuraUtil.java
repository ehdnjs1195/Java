package test.mypac;

import java.io.PrintStream;
import java.util.Random;

public class GuraUtil {
	//PrintStream type 의 static 필드, 필드명은 out
	public static PrintStream out=System.out;	//System.out => PrintStream type 의 static 필드 라는 키값을 가져온다.
	//Random type 의 static 필드, 필드명은 ran
	public static Random ran=new Random();		//new Random() => Random type 의 static 필드라는 키값을 가져온다.
}
