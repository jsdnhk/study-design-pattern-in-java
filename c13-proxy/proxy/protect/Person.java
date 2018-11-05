package c13.proxy.protect;
/**
 * 個人資料介面
 */
public interface Person {
	void setLikeCount(int like);
	int getLikeCount();
	String getName();
	void setName(String name);
}

/**
 * 一般使用的個人資料Bean
 */
public class PersonBean implements Person{
	private String name ;
	private int likeCount;
	
	@Override
	public void setLikeCount(int like) {
		this.likeCount = like;
	}

	public int getLikeCount() {
		return this.likeCount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * 個人資料代理-使setLikeCount方法被保護起來不能使用
 */
public class ProxyPersonBean implements Person {
	PersonBean person;

	public ProxyPersonBean(PersonBean personBean){
		this.person = personBean;
	};
	
	public String name ;
	public int likeCount;
	
	@Override
	public void setLikeCount(int like) {
		System.out.println("無權限修改like數");
	}
	
	public int getLikeCount() {
		return this.person.getLikeCount();
	}
	
	public String getName() {
		return this.person.getName();
	}

	public void setName(String name) {
		this.person.setName(name);
	}
}