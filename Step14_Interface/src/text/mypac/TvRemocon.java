package text.mypac;
/*
 *  인터페이스는 implements(구현) 하는 것이다. 매우중요함 ☆★★★★★★★★★★★★★★★★★★★★!
 */
public class TvRemocon implements Remocon{
	@Override
	public void down() {
		System.out.println("볼륨을 내려요");
	}
	@Override
	public void up() {
		System.out.println("볼륨을 올려요");
	}
}
