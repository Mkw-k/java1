package dice;

public class Dice {
	
	int number;
	
	public void setRandom() {
		number = (int)(Math.random() * 6) + 1;
	}
	
	public int getNumber() {
		return number;
	}
	
}
