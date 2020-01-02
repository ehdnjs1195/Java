package test.dto;
/*
 * 	Data Transfer Object 클래스 정의하기
 */
public class MemberDto {
	//1. private 접근 지정자로  필드를 정의한다.
	private int num;
	private String name;
	private String addr;
	
	//2. default 생성자를 정의한다.
	public MemberDto() {}
	
	//3. 생성자의 인자로 모든 필드의 값을 전달받는 생성자를 만든다.

	public MemberDto(int num, String name, String addr) {	//생성자를 만들때 필드값을 정의할 수 있다.
		super();	//Object
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	//4. 필드의 접근 메소드를 만든다. (setter, getter 메소드)
	public int getNum() {			//객체의 값을 가져올 때
		return num;
	}

	public void setNum(int num) {	//객체에 값을 전달할 때
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
