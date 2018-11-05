package c07.command.coffeShop;
/**
 * 廚房人員(Receiver)
 */
public interface KitchenWorker {
	/**
	 * 完成訂單
	 */
	void finishOrder();
}

/**
 * 搖飲料小弟(ConcreteReceiver)
 */
public class Barkeep implements KitchenWorker{
	@Override
	public void finishOrder() {
		System.out.print("拿出杯子->加滿冰塊->把飲料倒進杯子->飲料完成");
		System.out.println();
	}
}

/**
 * 點心廚師(ConcreteReceiver)
 */
public class Chef implements KitchenWorker {
	@Override
	public void finishOrder() {
		System.out.print("取出麵包->美乃滋塗上滿滿的麵包->丟進烤箱->灑上可以吃的裝飾->點心完成");
		System.out.println();
	}
}
