package c13.proxy.game;
public interface GameDisplay {
	/**
	 * 顯示畫面
	 */
	void display();
}

/**
 * 被代理的類別
 */
public class RealGameDisplay implements GameDisplay{
	@Override
	public void display() {
		System.out.println("顯示遊戲畫面");
	}
}

/**
 * 代理類別
 */
public class ProxyGameDisplay implements GameDisplay{
	private RealGameDisplay realGameDisplay;
	
	public ProxyGameDisplay(RealGameDisplay realGameDisplay){
		this.realGameDisplay = realGameDisplay;
	}
	
	@Override
	public void display() {
		System.out.println("遊戲讀取中...");
		realGameDisplay.display();		//println("顯示遊戲畫面")
	}
}