package c04.strategy.example;
/**
 * 村莊類別，等等拿來做排序用
 */
import java.util.Comparator;
 
public class Village {
	public int id;
	public String name;
	public int population;
	public double area;
	
	public Village (int id, String name, int population, double area){
		this.id = id; 
		this.name = name;
		this.population = population;
		this.area = area;
	}
	
	@Override
	public String toString(){
		return id + "." + name + "(人口: " + population + " 面積: "+ area + ")";
	}
}

/**
 * 人口做排序(ConcretStrategy)
 */
public class SortVillageByPopulation implements Comparator<Village>{
	@Override
	public int compare(Village o1, Village o2) {
		if(o1.population > o2.population){
			return 1;
		} 
		
		if(o1.population < o2.population){
			return -1;
		}
		return 0;
	}
}

/**
 * 用村莊面積做排序(ConcretStrategy)
 */
public class SortVillageByArea implements Comparator<Village>{
	@Override
	public int compare(Village o1, Village o2) {
		if(o1.area > o2.area){
			return 1;
		} 
		
		if(o1.area < o2.area){
			return -1;
		}
		return 0;
	}
}

/**
 * 使用ID排序(ConcretStrategy)
 */
public class SortVillageById implements Comparator<Village>{
	@Override
	public int compare(Village o1, Village o2) {
		if(o1.id > o2.id){
			return 1;
		} 
		
		if(o1.id < o2.id){
			return -1;
		}
		return 0;
	}
}

/**
 * 村莊名稱做排序(ConcretStrategy)
 */
public class SortVillageByName implements Comparator<Village>{
	@Override
	public int compare(Village o1, Village o2) {
		if(o1.name.charAt(0) > o2.name.charAt(0)){
			return 1;
		} 
		
		if(o1.name.charAt(0) < o2.name.charAt(0)){
			return -1;
		}
		return 0;
	}
}