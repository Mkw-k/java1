package work3;

public class student {
	String name;
	int ban; 
	int no;
	int kor;
	int eng;
	int math;
	int total;
	
	int getTotal(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
		
		total = kor + eng +math;
		
		return total;
	}
	
	double getAverage() {
		
		double avg = (double)getTotal(kor, eng, math)/3;
		
		return avg;
	}
}
