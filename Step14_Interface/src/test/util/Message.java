package test.util;

import java.util.Set;

public class Message {
	private String target;
	private String content;
	//setter 메소드 
	public void setContent(String content) {
		this.content = content;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	//getter 메소드
	public String getContent() {
		return content;
	}
	public String getTarget() {
		return target;
	}
	
	
}
