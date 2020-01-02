package test.auto;

public class SuperCar extends Car{	//SuperCar가 생성되기전에 Car가 먼저 생성되어야 하는데 Car는 default로 Engine객체를 받아야 하기 때문에 부모객체로 Engine 객체를 전달해야 한다.
	
	//Engine 객체를 생성자의 인자로 전달 받는 생성자
	public SuperCar(Engine engine) {
		//부모 생성자에 전달하기(무조건 가장 첫줄에 작성해야 한다.)
		super(engine);	//new Car(engine);와 비슷,   super() 는 부모 생성자를 의미한다. super.xxx 는 오버라이드 된 부모의 메소드
	}
	
	@Override
		public void drive() {
			if(this.engine==null) {
				System.out.println("Engine 객체가 없어서 달리지 못해요");
			}else {
				System.out.println("겁나게 빠르게 달려요 진짜루다가 레알루다가");
			}
		
		}
}
