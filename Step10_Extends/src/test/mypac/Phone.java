package test.mypac;
/*
 *  extends 클래스명을 정성하지 않으면 자동으로 extends Object 된다.
 *  즉, 자동으로 Object 클래스를 상속받게 되는 것이다. 
 */
public class Phone extends Object{	//Object 클래스를 확장해서(상속받아서) Phone 클래스를 만들겠다. extends Object는 생략가능(어차피 자동으로 생기기 때문에)
	
	//전화하는 기능
	public void call() {
		System.out.println("전화를 걸어요");
	}
	
}
