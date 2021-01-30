package fibonaci;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// 피보나치 수열
		/*
			피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
			예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
			1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
			피보나치수열의 30번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
			
			0 1 1 2 3 5 8 13
			a b c
			  a b c
			    a b c			
		*/
		
		long a, b, c;
		long arrNum[] = new long[30];
		
		a = 0;
		b = 1;
		
		arrNum[0] = a;
		arrNum[1] = b;
		
		int w = 0;
		while(w < 28) {
			c = a + b;
			arrNum[w + 2] = c;
			
			a = b;
			b = c;
			
			w++;
		}
		
		System.out.println(Arrays.toString(arrNum));
	}
}
