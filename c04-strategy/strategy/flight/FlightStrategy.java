package c04.strategy.flight;

/**
 * 戰鬥策略(Strategy)
 */
public interface FlightStrategy {
	/**
	 * 執行戰鬥策略
	 */
	void execute();
}

public class NormalAttack implements FlightStrategy {

	@Override
	public void execute() {
		System.out.println("使用一般攻擊");		
	}

}

/**
 * 使用道具(ConcreteStrategy)
 */
public class UseItem implements FlightStrategy {
	@Override
	public void execute() {
		System.out.println("使用道具，丟火把");
	}
}

/**
 * 使用技能(ConcreteStrategy)
 */
public class UseSkill implements FlightStrategy {
	@Override
	public void execute() {
		System.out.println("使用超級痛的技能攻擊");		
	}
}
