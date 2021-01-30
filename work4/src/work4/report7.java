package work4;

public class report7 {

	public static void main(String[] args) {
		int sumEv, sumOd;
		sumEv = sumOd = 0;
//		int sumEv = 0;
//		int sumOd = 0;
		
		
		for(int i = 0; i <= 100; i++) {
				if(i%2 == 0) {
					sumEv = sumEv + i; 
				}
				else {
					sumOd = sumOd + i;
				}
		}
		System.out.println("1부터 100사이 짝수의 합은 : "+sumEv);
		System.out.println("1부터 100사이 홀수의 합은 : "+sumOd);

	}

}
