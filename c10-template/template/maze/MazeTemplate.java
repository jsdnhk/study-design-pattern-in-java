package c10.template.maze;

import c10.template.adventurer.Adventurer;

/**
 * 迷宮樣版(Template)-規範迷宮冒險的演算法
 */
public abstract class MazeTemplate {
	protected int difficulty ; // 迷宮難度
	protected Adventurer adventurer; // 進入迷宮的冒險者
	protected boolean isDoubleMaze = false ; // hook，決定是否有隱藏的迷宮
	
	/** 
	 * @param adventurer 進入迷宮的冒險者
	 * @return 
	 */
	public Adventurer adventure(Adventurer adventurer){
		this.adventurer = adventurer;
		
		// 確認冒險者等級
		if(!checkLevel(adventurer.getLevel())) {
			System.out.println("冒險者等級不足，請提升等級至 " + difficulty  + " 後開放迷宮");
		} else {
			System.out.println("---" + adventurer.getType()  + "開始進行困難度 " + difficulty + " 的迷宮");
			createMaze();		// 產生迷宮
			start();  			// 冒險者闖迷宮
			
			if(isDoubleMaze){
				hiddenMaze(); 		// 由掛勾hook決定是否有隱藏迷宮，有的話可以進入隱藏關卡
			}
			showResult();		// 結算冒險結果
		}
		return this.adventurer; 
	}
	
	/**
	 * 冒險者等級是否足夠
	 * @param level
	 * @return
	 */
	private boolean checkLevel(int level){
		if(level < difficulty){
			return false;
		} 
		return true;
	}
	
	/**
	 * 產生迷宮內容(由子類別實作)
	 * @return
	 */
	abstract void createMaze();
	
	/**
	 * 冒險者進入迷宮(由子類別實作)
	 * @return
	 */
	abstract void start();
	
	/**
	 * 進入隱藏迷宮(隱藏迷宮，由hook觸發)
	 * @return
	 */
	void hiddenMaze(){
		System.out.println("進入隱藏迷宮");
	};
	
	/**
	 * 顯示冒險結果
	 */
	Adventurer showResult(){
		this.adventurer.setLevel(adventurer.getLevel() + 50*difficulty);  // 完成迷宮後冒險者等級增加
		System.out.println("---" + adventurer.getType() + "完成困難度 " + difficulty + " 迷宮!!!");
		return this.adventurer;
	};
}

/**
 * 簡單的迷宮(ConcreteTemplate)
 */
public class EazyMaze extends MazeTemplate{

	public EazyMaze() {
		super.difficulty = 1; // 沒限制等級
	}

	@Override
	void createMaze() {
		System.out.println("準備100*100的迷宮");
		System.out.println("安排10隻小怪物");
		System.out.println("安排等級10的BOSS");
		System.out.println("拔草整理場地");
		System.out.println("簡易迷宮準備完成!!!");
	}

	@Override
	void start() {
		System.out.println("冒險者開始進行簡單迷宮的冒險");
	}

}

/**
 * 困難的迷宮(ConcreteTemplate)
 */
public class DifficultMaze extends MazeTemplate{

	public DifficultMaze() {
		super.isDoubleMaze = true; // 困難模式有隱藏關卡
		super.difficulty = 50; // 50級以上才能進入困難迷宮
	}

	@Override
	void createMaze() {
		System.out.println("準備1000*1000的迷宮(包刮隱藏迷宮)");
		System.out.println("安排打不完的小怪物");
		System.out.println("安排等級50的中BOSS，100隻");
		System.out.println("安排等級120的超級BOSS，放隱藏迷宮的保物");
		System.out.println("拔草整理場地，重新油漆牆壁，擺放各種陷阱，擺放假屍體");
		System.out.println("困難迷宮準備完成!!!");
	}

	@Override
	void start() {
		System.out.println("冒險者開始進行困難迷宮的冒險");
	}

}
