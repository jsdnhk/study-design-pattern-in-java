package c15.builder.robotBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 機器人建造器抽像類別(AbstractBuilder)
 *
 */
public abstract class RobotBuilder {
	/**
	 * 建造機器人外型
	 */
	public abstract Form buildForm();
	/**
	 * 建造機器人動力系統
	 */
	public abstract Power buildPower();
	/**
	 * 建造機器人武器系統
	 */
	public abstract Weapon buildWeapon();
}


/**
 * 鋼彈建造者類別(ConcreteBuilder)
 */
public class GundamBuilder extends RobotBuilder{
	/**
	 * 建造機器人外型
	 */
	public Form buildForm(){
		// 這邊可以想像成用工廠類別可以創造很多種不同的外型
		return new Form("鋼彈");
	};
	/**
	 * 建造機器人動力系統
	 */
	public Power buildPower(){
		// 這邊可以想像成用工廠類別可以創造不同的動力系統
		return new Power("亞哈反應爐","Beta發電機","氫電池");
	};
	/**
	 * 建造機器人武器系統
	 */
	public Weapon buildWeapon(){
		// 這邊可以想像成用工廠類別可以創造不同的武器
		return new Weapon(new String[]{"60mm火神砲","突擊長矛","薩克機槍","光束劍"});
	};
}
/**
 * 機器人組件-外型(Product Part)
 */
public class Form {
	private String formName; 
	
	public Form(String formName){
		this.formName = formName;
	}
	
	public String toString(){
		return this.formName;
	}
}

/**
 * 機器人組件-動力(Product Part)
 */
public class Power {
	private String mainPower; // 主動力
	private String subPower; // 副動力
	private String battery; // 電池

	public Power(String mainPower, String subPower, String battery) {
		this.mainPower = mainPower;
		this.subPower = subPower;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "{主動力：" + mainPower + " , 副動力:" + subPower + " ,電池：" + battery + "}";
	}
}

/**
 * 機器人組件-武器(Product Part)
 */
public class Weapon {
	List<String> list = new ArrayList<>();
	public Weapon(String[] weaponList){
		list.addAll(Arrays.asList(weaponList));
	}
	@Override
	public String toString(){
		return list.toString();		
	}
}