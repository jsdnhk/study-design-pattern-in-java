package c11.composite.organizationTree;
/**
 * 部門單位抽項類別(Leaf)
 */
public abstract class Department extends AbstractAssociation {

	public Department(String name) {
		super(name);
	}

	@Override
	public void add(AbstractAssociation a) {
		System.out.println("Leaf無法增加子節點");
	}

	@Override
	public void remove(AbstractAssociation a) {
		System.out.println("Leaf無子節點可以移除");
	}

	@Override
	public void display(int depth) {
		for(int i = 0 ; i < depth ; i++){
			System.out.print('-');
		}
		System.out.println(name);
	}

	/**
	 * 部門實際的工作由子類別決定
	 */
	@Override
	abstract public void lineOfDuty();
}

/**
 * 人力支援部門(Leaf)
 */
public class HumanResouce extends Department {

	public HumanResouce(String name) {
		super(name);
	}

	/**
	 * 部門實際的工作由子類別決定
	 */
	@Override
	public void lineOfDuty() {
		System.out.println(name +  ":想辦法拐騙冒險者來完成任務");
	}

}

/**
 * 客服部門(Leaf)
 */
public class ServiceDepartment extends Department {

	public ServiceDepartment(String name) {
		super(name);
	}

	/**
	 * 部門實際的工作由子類別決定
	 */
	@Override
	public void lineOfDuty() {
		System.out.println(name +  ":處理客訴，告訴客戶，這肯定是冒險者的錯，不是協會的錯");
	}

}
