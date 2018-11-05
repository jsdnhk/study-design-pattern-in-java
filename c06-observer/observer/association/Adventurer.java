package c06.observer.association;
/**
 * 冒險者(Observer)
 */
public abstract class Adventurer {
	protected String name;
	
	public Adventurer(String name){
		this.name = name;
	}
	/**
	 * 冒險者接受任務
	 */
	public abstract void getQuestions(String questions);
}

/**
 * 吟遊詩人(Concrete Observer)-繼承冒險者
 */
public class Bard extends Adventurer {

	public Bard(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
		if(questions.length() > 10){
			System.out.println(name + ":任務太難了，我只會唱歌跳舞，不接不接");
		} else {
			System.out.println(name + ":當街頭藝人太難賺了，偶爾也是要解任務賺點錢的");
		}

	}
}

/**
 * 槍手(Concrete Observer)-繼承冒險者
 */
public class Gunman extends Adventurer {

	public Gunman(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
		if(questions.length() < 10){
			System.out.println(name + ":任務太簡單了，我不想理他");
		} else {
			System.out.println(name + ":只要我的手上有槍，誰都殺不死我，出發執行任務賺獎金拉!!!");
		}
	}
}

/**
 * 槍兵(Concrete Observer)-繼承冒險者
 */
public class Lancer extends Adventurer {
	public Lancer(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
		System.out.println(name + ":單來就改，任務來就接，沒在怕的");		
	}
}