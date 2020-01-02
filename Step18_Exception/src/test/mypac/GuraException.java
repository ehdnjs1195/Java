package test.mypac;

public class GuraException extends RuntimeException{
	//생성자
	public GuraException(String msg) {
		super(msg);	//부모 생성자(RuntimeException)에 msg 전달	
	}
}
