package test.mypac;

public class NoteBook {
	//필드
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	//생성자
	public NoteBook(Cpu cpu, Memory memory, HardDisk hardDisk) {	//객체를 생성하기 위해 Cpu 타입, Memory 타입, HardDisk 타입의 참조값을 넣어주어야 한다.
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
		
	}
}
