package test.teacherVer;
/*
 * 	Data Trasfer Object 	
 *  
 *  회원 한명의 정보를 하나의 객체에 담아서 사용하겠다!
 */
public class MemberDto {
	//데이터를 저장할 필드를 private 로 선언
	private int num;
	private String name;
	private String addr;
	
	//디폴트 생성자
	public MemberDto() {}
	//모든 필드의 값을 생성자의 인자로 전달 받는 생성자 generate!
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	//접근 메소드 만들기 setter / getter
	public int getNum() {		
		return num;
	}
	public void setNum(int num) {
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
