package dto;

public class accountDto {
	
	private String dateTime;
	private String use;
	private String classify;
	private int money;
	private String memo;
	
	
	
	public accountDto(String dateTime, String use, String classify, int money, String memo) {
		super();
		this.dateTime = dateTime;
		this.use = use;
		this.classify = classify;
		this.money = money;
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "accountDto [dateTime=" + dateTime + ", use=" + use + ", classify=" + classify + ", money=" + money
				+ ", memo=" + memo + "]";
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
