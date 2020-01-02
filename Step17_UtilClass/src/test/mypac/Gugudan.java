package test.mypac;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("구구단 할 수를 입력하시오: ");
		int a=scan.nextInt();
		//while 문으로
		int count=0;
		while(true) {
			count++;
			System.out.println(a+"X"+count+"="+a*count);
			if(count==9) {
				break;
			}
		}
		System.out.println("구구단 끝");
		//for 문으로
		for(int i=1; i<10;i++) {
			System.out.println(a+"X"+i+"="+a*i);
		}
	}
}
