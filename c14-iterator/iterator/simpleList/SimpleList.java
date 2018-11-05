package c14.iterator.simpleList;

import java.util.Iterator;
/**
 * 自己做一個簡單的list
 */
public interface SimpleListInterface {
	
	// simpleList 要有增加元素的方法
	public void add(String string);
}

/**
 * 自己做一個簡單的list
 */
@SuppressWarnings("rawtypes")		//rawtypes，抑制與使用 raw 類型相關的警告
public class SimpleList implements SimpleListInterface  {
	private int index = 0;
	private int size = 0;				
	private String[] carList = new String[1000]; // 可以裝1000個，在範例中已經太夠用了
	
	public SimpleList(){
	}

	@Override
	public void add(String car){
		carList[size] = car;
		size++;
	}
	
	/**
	 * 取得Iterator
	 * @return 
	 */
	public SimpleIterator getIterator(){
		return new SimpleIterator();
	}
	
	private class SimpleIterator implements Iterator{		//private class!!
		@Override
		// 實作hasNext
		public boolean hasNext() {
			if(index >= size){
				return false;
			}
			return true;
		}

		@Override
		// 實作next
		public String next() {
			if(hasNext()){
				return carList[index++];	//not reach orig. object		
			}
			throw new IndexOutOfBoundsException();
		}
	}
}