package c16.chainOfResponsibility.applyInCompany;

/**
 * 管理者(Handler)
 */
public abstract class Manager {
	protected String name;
	
	//上一級管理者
	protected Manager superior;
	
	public Manager(String name){
		this.name = name;
	}
	
	//設定上一級的管理者
	public void setSuperior(Manager superior){
		this.superior = superior;
	}
	/**
	 * 提出申請
	 * @param request
	 */
	abstract public void apply(ApplyRequest request);
}

/**
 * 總經理(Concretehandler)
 *
 */
public class GeneralManager extends Manager {
	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void apply(ApplyRequest request) {
		if(request.getRequestType().equals("請假")){
			System.out.print(request.getRequestType() + ":" + request.getRequestContent());
			System.out.println(" " + request.getRequestCount()  + "天 被" + name + "批准");
		} else {
			if(request.getRequestCount() <= 1000){
				System.out.print(request.getRequestType() + ":" + request.getRequestContent());
				System.out.println(" " + request.getRequestCount() + "元 被"  + name + "批准");
			} else {
				System.out.print(request.getRequestType() + ":" + request.getRequestContent());
				System.out.println(" " + request.getRequestCount() + "元 被"  + name + "駁回");
			}
		}
	}
}

/**
 * 總監(Concretehandler)
 *
 */
public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void apply(ApplyRequest request) {
		//5天以下的假就批准，其他丟給上級
		if(request.getRequestType().equals("請假") && request.getRequestCount() <= 5){
			System.out.print(request.getRequestType() + ":" + request.getRequestContent());
			System.out.println(" " + request.getRequestCount() + "天 被" + name + "批准");
		} else {
			if(superior != null){
				superior.apply(request);
			}
		}
	}
}

/**
 * 經理(Concretehandler)
 */
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void apply(ApplyRequest request) {
		//2天以下的假就批准，其他丟給上級
		if(request.getRequestType().equals("請假") && request.getRequestCount() <= 2){
			System.out.print(request.getRequestType() + ":" + request.getRequestContent());
			System.out.println(" " + request.getRequestCount() + "天 被" + name + "批准");
		} else {
			if(superior != null){
				superior.apply(request);
			}
		}
	}
}