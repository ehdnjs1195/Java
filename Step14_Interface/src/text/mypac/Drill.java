package text.mypac;		
/*
 *  메소드를 1개만 정의하도록 강제하는 어노테이션(@##)
 */
@FunctionalInterface	//functional interface를 붙이면 메소드를 강제로 하나만 만들수 있게 된다.
public interface Drill {
	//구멍을 뚫는 기능
	public void hole();
}
