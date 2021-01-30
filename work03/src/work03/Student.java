package work03;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
		
	//	int total = kor + eng + math;		
	//	return total;
		
		return (kor + eng + math);
	}
	
	double getAverage() {		
		double avg = (double)getTotal(kor, eng, math) / 3;		
		return avg;
	}
	
	
	
}



