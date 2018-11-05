package c02.factory.village;

import c02.factory.village.Adventurer;

/**
 *  工廠介面-冒險者訓練營(這只是一個概念或規範，要訓練什麼，怎麼訓練留給子類別實作)
 */
public interface TrainingCamp {
	/**
	 * 訓練冒險者的過程，訓練後請給我一個冒險者
	 */
	public Adventurer trainAdventurer();
}

/**
 * 實體工廠-弓箭手訓練營
 */
public class ArcherTrainingCamp implements TrainingCamp {
	@Override
	public Adventurer trainAdventurer() {
		System.out.println("訓練一個弓箭手");
		return new Archer(); 
	}
}

/**
 * 實體工廠-鬥士訓練營
 */
public class WarriorTrainingCamp implements TrainingCamp {
	@Override
	public Adventurer trainAdventurer() {
		System.out.println("訓練一個鬥士");
		return new Warrior(); 
	}
}
