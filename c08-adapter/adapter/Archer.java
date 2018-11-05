package c08.adapter;
/**
 * 弓箭手介面(Adpatee) 
 * 等等要被轉接成法師介面
 */
public interface Archer {
	// 射弓箭
	void shot();
}

/**
 * 具體的弓箭手
 */
public class NormalArcher implements Archer{
	@Override
	public void shot() {
		System.out.println("射箭");
	}
}
