package c01.simpleFactory.village;
/**
 * 冒險者
 */
public interface Adventurer {
	/**
	 * 告訴別人你是哪種冒險者
	 */
	String getType();
}

/**
 * 鬥士
 *
 */
public class Warrior implements Adventurer {
	@Override
	public String getType() {
		System.out.println("我是鬥士");	
		return this.getClass().getSimpleName();
	}
}

/**
 * 弓箭手
 *
 */
public class Archer implements Adventurer {
	@Override
	public String getType() {
		System.out.println("我是弓箭手");
		return this.getClass().getSimpleName();
	}
}

