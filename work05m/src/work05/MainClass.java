package work05;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
			Random number 찾기
			
			random -> 1 ~ 100	-> 78
			
			>> 10번 기회
			user input -> 50	너무 작습니다
			user input -> 75	너무 작습니다
			user input -> 85	너무 큽니다
			user input -> 80	너무 큽니다
			user input -> 77	너무 작습니다
			user input -> 78	정답입니다 or Game Clear
		*/
		Scanner sc = new Scanner(System.in);
		
		int randNum, userNum;
		boolean clear;
		
		// 초기화
		clear = false;
		
		// 1. random 산출 (1 ~ 100)
		randNum = (int)(Math.random() * 100) + 1;
		System.out.println("randNum:" + randNum);
		
		///////////////////////////////// loop 10번
		int w = 0;
		
		while(w < 10) {
			
			// 2. user input
			System.out.print((w + 1) + "회 숫자입력 = ");
			userNum = sc.nextInt();
			
			// 3. 비교
			int msg = 0;
			if(userNum > randNum) {
				msg = 1;
			}
			else if(userNum < randNum) {
				msg = 2; 
			}
			else {
				// 맞췄을 때
				clear = true;
				break;
			}
			
			// 4. 메시지
			switch(msg) {
				case 1:
					System.out.println("너무 큽니다");
					break;
				case 2:
					System.out.println("너무 작습니다");
					break;
			}
			
			w++;
		}
		/////////////////////////////////
		
		// 5. 결과 출력
		if(clear) {
			System.out.println("Game Clear!!!");
		}
		else {
			System.out.println("Game Over~");
		}

		
	}
}








