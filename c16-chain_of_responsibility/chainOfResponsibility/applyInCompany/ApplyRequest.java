package c16.chainOfResponsibility.applyInCompany;
/**
 * 提出申請(Request)
 */
public class ApplyRequest {
	/**
	 * 申請類別
	 */
	private String requestType;
	
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	/**
	 * 申請內容
	 */
	private String requestContent;
	
	public String getRequestContent() {
		return requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	/**
	 * 申請數
	 */
	private int requestCount;

	public int getRequestCount() {
		return requestCount;
	}
	public void setRequestCount(int requestCount) {
		this.requestCount = requestCount;
	}
}
