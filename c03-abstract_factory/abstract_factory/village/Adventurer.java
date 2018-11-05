package c03.abstractfactory.village;

import c03.abstractfactory.factory.Clothes;
import c03.abstractfactory.factory.Weapon;

/**
 * 冒險者
 */
public abstract class Adventurer {
	protected Weapon weapon;	//武器
	protected Clothes clothes; //衣服
	/**
	 * 看冒險者的狀態
	 */
	public abstract void display();

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Clothes getClothes() {
		return clothes;
	}

	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}
}

/**
 * 鬥士
 */
public class Warrior extends Adventurer {
	@Override
	public void display() {
		System.out.println("我是弓箭手，裝備:");
		weapon.display();
		System.out.println();
		clothes.display();
		System.out.println();
	}
}

/**
 * 弓箭手
 */
public class Archer extends Adventurer {
	@Override
	public void display() {
		System.out.println("我是弓箭手，裝備:");
		weapon.display();
		System.out.println();
		clothes.display();
		System.out.println();
	}
}
