package c12.state.warrior;
/**
 * 隨著HP變化的狀態(State)
 */
public interface State {
	/**
	 * 狀態不同，行為模式不同(傳入warrior所以狀態可以取得warrior的資料)
	 * @param warrior 
	 */
	void move(Warrior warrior);
}

/**
 * 隨著HP變化的狀態(ConcreteState)，HP > 70% ， 一般狀態　
 */
public class NormalState implements State{
	/**
	 * 狀態不同，行為模式不同(傳入warrior所以狀態可以取得warrior的資料)
	 * @param warrior 
	 */
	@Override 	
	public void move(Warrior warrior) {
		if(warrior.getHP() > 70){
			System.out.println("HP=" + warrior.getHP() + " , 一般狀態 ");	
		} else {
			warrior.setState(new FuryState());
			warrior.move();
		}
	}
}

/**
 * 隨著HP變化的狀態(ConcreteState)，HP < 70% ， 狂怒狀態　
 */
public class FuryState implements State{
	/**
	 * 狀態不同，行為模式不同(傳入warrior所以狀態可以取得warrior的資料)
	 * @param warrior 
	 */
	@Override 	
	public void move(Warrior warrior) {
		int hp = warrior.getHP();
		if( hp > 70){
			warrior.setState(new NormalState());
			warrior.move();
		} else if (hp <= 30) {
			warrior.setState(new DesperateState());
			warrior.move();
		} else {
			System.out.println("HP=" + warrior.getHP() + " ,狂怒狀態 傷害增加30%");	
		}
	}
}

/**
 * 隨著HP變化的狀態(ConcreteState)，HP小於30%，背水一戰狀態
 */
public class DesperateState implements State{
	/**
	 * 狀態不同，行為模式不同(傳入warrior所以狀態可以取得warrior的資料)
	 * @param warrior 
	 */
	@Override 	
	public void move(Warrior warrior) {
		int hp = warrior.getHP();
		if(hp == 0){
			warrior.setState(new UnableState());
			warrior.move();
		} else if ( hp > 30 ) {
			warrior.setState(new FuryState());
			warrior.move();
		} else {
			System.out.println("HP=" + warrior.getHP() + " ,背水一戰 傷害增加50%, 防禦增加50%");	
		} 
	}
}

/**
 * 隨著HP變化的狀態(ConcreteState)，HP = 0% ， 無法戰鬥狀態　
 */
public class UnableState implements State{
	/**
	 * 狀態不同，行為模式不同(傳入warrior所以狀態可以取得warrior的資料)
	 * @param warrior 
	 */
	@Override 	
	public void move(Warrior warrior) {
		System.out.println("HP=" + warrior.getHP() + " , 無法戰鬥");	
	}
}
