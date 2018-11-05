package c06.observer.association;

import java.util.ArrayList;
import java.util.List;

/**
 * 被觀察者介面
 */
public abstract class Subject {
	protected List<Adventurer> list = new ArrayList<>();
	/**
	 * 觀察者想被通知
	 * @param observer
	 */
	public void add(Adventurer observer){
		list.add(observer);
	};
	
	/**
	 * 觀察者不想接到通知
	 * @param observer
	 */
	public void remove(Adventurer observer){
		list.remove(observer);
	}
	
	/**
	 * 貼出任務公告
	 * @param questions
	 */
	public abstract void sendQuestions(String questions);
}

/**
 * 冒險者協會(ConcreteSubject)
 */
public class Association extends Subject {

	@Override
	public void sendQuestions(String questions) {
		for(Adventurer adventurer : list){
			adventurer.getQuestions(questions);
		}
		
	}
}
