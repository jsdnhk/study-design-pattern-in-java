package c03.abstractfactory.village;

import c03.abstractfactory.village.Adventurer;

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
 * 鬥士訓練營(Con)
 */
public class WarriorTrainingCamp implements TrainingCamp {
	private static EquipFactory factory = new WarriorEquipFactory();
	
	@Override
	public Adventurer trainAdventurer() {
		Warrior warrior = new Warrior();
		// ...進行基本訓練
		// ...鬥士訓練課程
		// 訓練完成配發裝備
		warrior.setWeapon(factory.productWeapon());
		warrior.setClothes(factory.productArmor());
		return warrior; 
	}
}
/**
 * 實體工廠-弓箭手訓練營
 */
public class ArcherTrainingCamp implements TrainingCamp {
	private static EquipFactory factory = new ArcherEquipFactory();

	@Override
	public Adventurer trainAdventurer() {
		Archer archer = new Archer();
		// ...進行基本訓練
		// ...弓箭手訓練課程
		// 訓練完成配發裝備
		archer.setWeapon(factory.productWeapon());
		archer.setClothes(factory.productArmor());
		return archer; 
	}

}
