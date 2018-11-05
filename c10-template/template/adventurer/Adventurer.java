package c10.template.adventurer;
/**
 * 進入迷宮的冒險者介面
 */
public abstract class Adventurer {
	protected int level ; //冒險者等級
	protected String type ; // 冒險者類別
	
	public String getType(){
		return this.type;
	};
	
	public int getLevel(){
		return this.level;
	};
	
	public void setLevel(int level){
		this.level = level;
	};
}

/**
 * 冒險者-鋼彈Justice
 */
public class GundamJustice extends Adventurer {
	public GundamJustice(){
		super.type = "Gundam-Justice";
		super.level = 100;	//鋼彈等級很高的
	}
}

/**
 * 冒險者-劍士
 */
public class Sabar extends Adventurer {
	public Sabar(){
		super.type = "Sabar";
		super.level = 10;	//劍士等級就普普
	}
}