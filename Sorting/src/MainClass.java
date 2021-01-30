import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
			Sorting : 정렬
					오름, 내림
		*/
		
		/*
		int number[] = { 5, 9, 1, 8, 2,  6, 4, 7, 3, 10 };
		int temp;
		for(int i = 0;i < number.length - 1; i++) {	// 0 ~ 9
			
		//	System.out.println("i = " + i);
			for(int j = i + 1;j < number.length; j++) {				
		//		System.out.println("\tj = " + j);
				
				if(number[i] > number[j]) {	// i번지의 숫자 j번지의 숫자보다 클 경우 교환 
					// swap
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}				
			}			
		}
		
		System.out.println(Arrays.toString(number));
		
		*/
		
		/*     sorting method
		 *     입력 ------------>1
		 *     		몇개
		 *     		숫자들
		 *     		오름/내림		
		 *     정렬------------>1
		 *     		swap--------------->1
		 *     결과출력 ------------------>1
		 * 
		 */
		
		
		int number[] = null;		
		boolean updown;
				
		// 1. 숫자 몇개를 정렬?
		// 2. 숫자 갯수에 맞도록 입력
		// 3. 오름/내림
		
		
		number = HowNumber(number);
		System.out.println(Arrays.toString(number));
	  
	  	updown = updown();
	   
			
		// 4. 정렬
		Sorting(number, updown);
		
		
		// 5. 결과 출력
		result(number);
		
		
		
		
	}

	 static void result(int number[]) {
		System.out.println(Arrays.toString(number));
		
	}
	 
	 static void Sorting(int number[],boolean updown) {
		
		 
		int temp;
	
		
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				// 오름
				if(updown == true) {
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
				// 내림
				else {
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
			}	
		}
	}


	 static int[] HowNumber(int number[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자의 갯수 = ");
		int count = sc.nextInt();
		number= new int[count];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		return number;
	 }
	 
	 static boolean updown () {
		 Scanner sc = new Scanner(System.in);
		 boolean updown;
		 System.out.print("오름(1) 내림(2) = ");
			int ud = sc.nextInt();
			if(ud == 1)	updown = true;
			else		updown = false;
			
			return updown;
	 }
	
}







