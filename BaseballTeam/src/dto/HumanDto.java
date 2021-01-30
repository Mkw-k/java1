package dto;

public class HumanDto {
	 int Number;
	 String Name;
	 int Age;
	 int height;
	
	
	public HumanDto(int number, String name, int age, int height) {
		super();
		Number = number;
		Name = name;
		Age = age;
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "HumanDto [Number=" + Number + ", Name=" + Name + ""
				+ ", Age=" + Age + ", height=" + height + "]";
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
