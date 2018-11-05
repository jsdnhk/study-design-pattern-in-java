package c24.visitor;
/**
 * 指定的菜餚-拜訪者
 */
public interface Visitor {
	// 利用overload來實現每種不同廚師煮出不同的指定菜餚
	void cook(DarkChef superChef);
	void cook(SuperChef superChef);
	void cook(SuperNoodleChef superNoodleChef);
}

/**
 * 指定做燒賣(Concrete Visitor)
 */
public class Visitor_saoMai implements Visitor {
	@Override
	public void cook(DarkChef chef) {
		System.out.println(chef.getName() + " : 魔幻鴉片燒賣");
	}

	@Override
	public void cook(SuperChef chef) {
		System.out.println(chef.getName() + " : 宇宙大燒賣");
	}

	@Override
	public void cook(SuperNoodleChef chef) {
		System.out.println(chef.getName() + " : 鐵桿50人份燒賣");
	}
}

/**
 * 指定做豆腐(Concrete Visitor)
 */
public class Visitor_tofu implements Visitor {
	@Override
	public void cook(DarkChef chef) {
		System.out.println(chef.getName() + " : 豆腐三重奏");
	}

	@Override
	public void cook(SuperChef chef) {
		System.out.println(chef.getName() + " : 熊貓豆腐");
	}

	@Override
	public void cook(SuperNoodleChef chef) {
		System.out.println(chef.getName() + " : 鐵桿臭豆腐");
	}
}