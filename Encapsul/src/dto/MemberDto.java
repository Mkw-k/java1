package dto;

// Data Transfer Object ==DTO 
// Value Object ==VO
public class MemberDto {

	private String name; 
	private int age;
	private String adress;
	private String phone;
	private String content;
	
	public MemberDto() {
		
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "MemberDto [name=" + name + ", age=" + age + ", adress=" + adress + ", phone=" + phone + ", content="
				+ content + "]";
	}

	public MemberDto(String name, int age, String adress, String phone, String content) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.phone = phone;
		this.content = content;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
