package sort;

import java.util.Scanner;

public class Sort {

	// 클래스내에서 접근 언제 어디든지 접근가능
	int number[];
	boolean updown;
			
	public void userInput() {
		Scanner sc = new Scanner(System.in);
				
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
		
	}
	public void sorting() {
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				// 오름
				if(updown == true) {
					if(number[i] > number[j]) {
						swap(i, j);						
					}
				}
				// 내림
				else {
					if(number[i] < number[j]) {
						swap(i, j);						
					}
				}
			}
		}
	}
	public void swap(int i, int j) {	
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	public void resultPrint() {
		if(updown) {
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




