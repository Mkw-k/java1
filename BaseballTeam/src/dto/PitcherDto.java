package dto;

public class PitcherDto extends HumanDto{
	int Win;
	int Lose; 
	double defense;
	
	
	
	
	
	public PitcherDto(int number, String name, int age, int height, int win, int lose, double defense) {
		super(number, name, age, height);
		Win = win;
		Lose = lose;
		this.defense = defense;
	}
	@Override
	public String toString() {
		return "BatterDto [Win=" + Win + ", Lose=" + Lose + ", defense=" + defense + ", Number=" + Number + ", Name="
				+ Name + ", Age=" + Age + ", height=" + height + "]";
	}
	public int getWin() {
		return Win;
	}
	public void setWin(int win) {
		Win = win;
	}
	public int getLose() {
		return Lose;
	}
	public void setLose(int lose) {
		Lose = lose;
	}
	public double getDefense() {
		return defense;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	
	
}
