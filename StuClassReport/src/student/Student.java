package student;

public class Student {

	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	public int getTotal(int kor2, int math2, int eng2) {
		int result = kor2 + math2 + eng2;
		return result;
	}

	public double getAverage() {
		double Avg = ((double)(kor+eng+math)/3);
		Avg = (Math.round(Avg*10)/10.0);
		return Avg;
	}
	
}
