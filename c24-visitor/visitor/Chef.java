package c24.visitor;

/**
 * 廚師介面-被操作的元素
 */
public abstract class Chef {
	private String name;
	public Chef(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// visitor代表裁判指定的料理
	public abstract void accept(Visitor visitor);
}

/**
 * 特級廚師-被操作的元素
 */
public class SuperChef extends Chef {

	public SuperChef(String name) {
		super(name);
	}

	// 如何實現做料理的工作已經移交給visitor
	@Override
	public void accept(Visitor visitor) {
		visitor.cook(this);
	}

}

/**
 * 黑暗料理界廚師-被操作的物件
 */
public class DarkChef extends Chef {
	
	public DarkChef(String name) {
		super(name);
	}

	// 如何實現做料理的工作已經移交給visitor
	@Override
	public void accept(Visitor visitor) {
		visitor.cook(this);
	}

}

/**
 * 特級麵點師傅-被操作的物件
 */
public class SuperNoodleChef extends Chef {

	public SuperNoodleChef(String name) {
		super(name);
	}

	// 如何實現做料理的工作已經移交給visitor
	@Override
	public void accept(Visitor visitor) {
		visitor.cook(this);
	}

}

