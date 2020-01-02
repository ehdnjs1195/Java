package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		MainClass04.showSum(1,2);
		int a=30;
		int b=20;
		MainClass04.showSum(a, b);
	}
	
	public static void showSum(int num1, int num2 ) {
		int sum=num1+num2;
		System.out.println(num1+" + "+num2+"="+sum);
	}
}
