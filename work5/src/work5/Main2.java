package work5;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	   /*
	       Random number 찾기 
	       
	       random -> 1~100  -> 78
	       
	       >>10번의 기회 
	       user input -> 50     너무 작습니다 
	       user input -> 75     너무 작습니다
	       user input -> 85     너무 큽니다
	       user input -> 80     너무 큽니다
	       user input -> 77     너무 작습니다
	       user input -> 78     정답입니다 or Game Clear
	       
	   */
	
		for(;;) {
		System.out.println("랜덤숫자를 맞추세요 (범위 : 1~100)");
		int ran = (int)((Math.random()*100)+1);
		String chk = "";
		Scanner sc = new Scanner(System.in);
		////////////////////////////////////// loop 10번 
		
		
		try {
			for(int i =0; i<10; i++) {
	
			System.out.print((i+1)+"번째 기회"+"숫자 입력 = ");
			int input = sc.nextInt();
			if(input <0 || input >100) {
				System.out.println("1~100의 수로 다시 입력하세요.");
				continue;
			}
			
	
			if(input > ran) {
				System.out.println("너무 큽니다");
				chk = "up";
			}
			else if(input < ran) {
				System.out.println("너무 작습니다");
				chk = "down";
			}
			else if(input == ran) {
				System.out.println("정답입니다");
				chk = "correct";
				break;
			}
			
}//end for 1
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요");
			continue;
		}


		
		
	
		if(chk.equals("correct")) {
			System.out.println("Game Clear!");
		}
		else {
			System.out.println("Game Over!");
		}
	
		System.out.println("게임을 다시 하시겠습니다(Y/N)");
		
		String replay = sc.next();
		replay = replay.toUpperCase();
		replay = replay.replace(" ", "");
		System.out.println(replay);
		
		if(replay.equals("Y")) {
			System.out.println("게임을 다시 실행하겠습니다");
		}
		else {
			System.out.println("게임을 종료합니다");
			break;
		}
		
	}//end for;;
}//end main
}//end class
