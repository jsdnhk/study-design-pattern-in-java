package c24.visitor.description;

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
	
	abstract void cookTofu(); 	//廚師要會做豆腐
	abstract void cookSaoMai(); //廚師要會做燒賣
}

// 特級廚師
public class SuperChef extends Chef {

	public SuperChef(String name) {
		super(name);
	}

	@Override
	void cookTofu() {
		System.out.println(this.getName() + " : 宇宙大燒賣");		
	}

	@Override
	void cookSaoMai() {
		System.out.println(this.getName() + " : 熊貓豆腐");		
	}
}

//特級麵點師傅
public class SuperNoodleChef extends Chef {
	public SuperNoodleChef(String name) {
		super(name);
	}

	@Override
	void cookTofu() {
		System.out.println(this.getName() + " : 鐵桿臭豆腐");								
	}

	@Override
	void cookSaoMai() {
		System.out.println(this.getName() + " : 鐵桿50人份燒賣");					
	}
}

 //黑暗料理界廚師
public class DarkChef extends Chef {
	public DarkChef(String name) {
		super(name);
	}

	@Override
	void cookTofu() {
		System.out.println(this.getName() + " : 魔幻鴉片燒賣");
	}

	@Override
	void cookSaoMai() {
		System.out.println(this.getName() + " : 豆腐三重奏");		
	}
}
