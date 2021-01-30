package dto;

public class BatterDto extends HumanDto {
	
	int batCount;
	int Hit;
	double HitAvg;
	
	
	public BatterDto(int number, String name, int age, int height, int batCount, int hit, double hitAvg) {
		super(number, name, age, height);
		this.batCount = batCount;
		Hit = hit;
		HitAvg = hitAvg;
	}

	@Override
	public String toString() {
		return "PitcherDto [batCount=" + batCount + ", Hit=" + Hit + ", HitAvg=" + HitAvg + ", Number=" + Number
				+ ", Name=" + Name + ", Age=" + Age + ", height=" + height + "]";
	}


	public int getBatCount() {
		return batCount;
	}
	public void setBatCount(int batCount) {
		this.batCount = batCount;
	}
	public int getHit() {
		return Hit;
	}
	public void setHit(int hit) {
		Hit = hit;
	}
	public double getHitAvg() {
		return HitAvg;
	}
	public void setHitAvg(double hitAvg) {
		HitAvg = hitAvg;
	}
	
	
}
