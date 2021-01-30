import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		/*	입력	---> 1
				몇개?
				숫자들입력
				오름/내림 		*/			
			
		//	정렬 ---> 1
		//		swap ---> 1
			
		//	결과출력 ---> 1		
			
		Scanner sc = new Scanner(System.in);
		
		/*
		int number[] = null;		
		boolean updown;
				
		// 1. 숫자 몇개를 정렬?
		System.out.print("숫자의 갯수 = ");
		int count = sc.nextInt();
		
		number = new int[count];
		
		// 2. 숫자 갯수에 맞도록 입력
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}		
		
		// 3. 오름/내림
		System.out.print("오름(1) 내림(2) = ");
		int ud = sc.nextInt();
		if(ud == 1)	updown = true;
		else		updown = false;
		*/
		
		
		boolean updown[] = new boolean[1];
		int number[] = userInput(updown);
		
		sorting(number, updown[0]);		
		
		
		
				
		// 입력
		/*
		int number[] = userNumberInput();
		boolean updown = userUpdownInput();
		*/
		
		
		
		/*
		// 4. 정렬
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
		}*/
		
		// 정렬
	
//		sorting(number, updown);
		
		// 5. 결과 출력
	//	System.out.println(Arrays.toString(number));
		
		resultPrint(number, updown);
		
		
	}
	
	
	static int[] userInput(boolean updown[]) {
		Scanner sc = new Scanner(System.in);
		int number[] = null;	
		
		// 1. 숫자 몇개를 정렬?
		System.out.print("숫자의 갯수 = ");
		int count = sc.nextInt();
		
		number = new int[count];
		
		// 2. 숫자 갯수에 맞도록 입력
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 3. 오름/내림
		System.out.print("오름(1) 내림(2) = ");
		int ud = sc.nextInt();
		if(ud == 1)	updown[0] = true;
		else		updown[0] = false;
		
		return number;
	}
	
	
	static int[] userNumberInput() {
		Scanner sc = new Scanner(System.in);
		int number[] = null;	
		
		// 1. 숫자 몇개를 정렬?
		System.out.print("숫자의 갯수 = ");
		int count = sc.nextInt();
		
		number = new int[count];
		
		// 2. 숫자 갯수에 맞도록 입력
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		return number;
	}
	
	static boolean userUpdownInput() {
		Scanner sc = new Scanner(System.in);
		boolean updown = false;
		
		// 3. 오름/내림
		System.out.print("오름(1) 내림(2) = ");
		int ud = sc.nextInt();
		if(ud == 1)	updown = true;
		else		updown = false;
		
		return updown;
	}
	
	static void sorting(int []number, boolean updown) {
		
		
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				// 오름
				if(updown == true) {
					if(number[i] > number[j]) {
						swap(number, i, j);
						
						/*
						temp = number[i];
						number[i] = number[j];
						number[j] = temp; */
					}
				}
				// 내림
				else {
					if(number[i] < number[j]) {
						swap(number, i, j);
						/*
						temp = number[i];
						number[i] = number[j];
						number[j] = temp; */
					}
				}
			}
		}
	}
	
	static void swap(int number[], int i, int j) {
		int temp;
		temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	
	static void resultPrint(int number[], boolean[] updown) {
		if(updown[0]) {
			System.out.println("오름차순 정렬입니다");
		}else {
			System.out.println("내름차순 정렬입니다");
		}
		
		System.out.println("숫자의 갯수는 총 " + number.length + "개입니다");
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number(" + (i + 1) + "):" + number[i]);
		}
	}
	
}









