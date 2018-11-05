package c17.interpreter.numberInterpreter;
/**
 * 共用解譯器類別(Expression)
 */
public abstract class Expression {
	public void interpret(String str){
		if(str.length() > 0){
			String text = str.substring(1, str.length());
			Integer number = Integer.valueOf(text);
			excute(number);
		}
	}
	
	/**
	 * 
	 * @param text 要解譯的內容
	 */
	protected abstract void excute(Integer number);
}

/**
 * 如果第一個字為A，數字*2(ConcreteExpression)
 */
public class UpExpression extends Expression {
	@Override
	public void excute(Integer number) {
		System.out.print(number*2 + " ");
	}
}

/**
 * 如果第一個字為B，數字/2(ConcreteExpression)
 */
public class DownExpression extends Expression {
	@Override
	public void excute(Integer number) {
		System.out.print(number/2 + " ");
	}
}
