package c05.decorator.title;

/**
 * 稱號介面(Decorator)
 */
public interface Adventurer {	
	/**
	 * 攻擊
	 */
	 void attack();
}
 
public abstract class Title implements Adventurer{
	/**
	 * 被裝飾的冒險者(Component)
	 */
	protected Adventurer adventuerer;	
	
	public Title(Adventurer adventuerer){
		this.adventuerer = adventuerer;
	}
	
	@Override
	public void attack(){
		adventuerer.attack();
	}
}

/**
 * 稱號-敏捷 (ConcreteDecorator)
 */
public class TitleAgile extends Title{	

	public TitleAgile(Adventurer adventuerer) {
		super(adventuerer);
	}

	// 稱號讓攻擊變快
	@Override
	public void attack(){
		System.out.print("快速 ");
		super.attack();
	}

	// 取得稱號後獲得新的技能
	public void useFlash(){
		System.out.println("使用瞬間移動");
	}
}

/**
 * 稱號-燃燒(ConcreteDecorator)
 */
public class TitleInFire extends Title{
	public TitleInFire(Adventurer adventurer) {
		super(adventurer);
	}
	
	// 稱號讓攻擊增加燃燒
	@Override
	public void attack(){
		System.out.print("燃燒 ");
		super.attack();
	}
	
	public void fireball(){
		System.out.println("丟火球");
	}
}

/**
 * 稱號-強壯(ConcreteDecorator)
 */
public class TitleStrong extends Title{	
	public TitleStrong(Adventurer adventurer) {
		super(adventurer);
	}
	
	// 稱號讓攻擊力增加
	@Override
	public void attack(){
		System.out.print("猛力 ");
		super.attack();
	}
}
