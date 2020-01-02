package test.util;

public class practice {
	public static void main(String[] args) {
		class MyMessenger implements Messenger{
			@Override
			public void send(Message m) {
				m.setContent("Hi");
				m.setTarget("DOWON");
			}
		}
		useMessenger(new MyMessenger());
	}
	public static void useMessenger(Messenger m) {
		Message a=new Message();
		m.send(a);
		String c=a.getContent();
		String me=a.getTarget();
		System.out.println("msg: "+c+ ", TO: "+me);
	}
}

