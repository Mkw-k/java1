import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);

		int r_num[] = null;
		int u_num[] = null;
		boolean clear;
		
		// initialize
		// r_num = new int[3];
		// u_num = new int[3];
		//clear = false;
				
		// TODO: 1. random(1 ~ 10) -> 3개		
		r_num = bRandom();
		
		/*
		boolean swit[] = new boolean[10];
		int r, w;
		
		w = 0;		
		while(w < 3) {
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r + 1;			// 1 ~ 10
				w++;
			}			
		}
					
		System.out.println(Arrays.toString(r_num));
		*/		
		//////////////////////////////////// loop
		
		clear = loop(u_num, r_num);
		
		/*	
		int loop = 0;		
		while(loop < 10) {
			// TODO:2. user input -> 3개
			u_num = userInput();
			
//			while(true) {				
//				for(int i = 0;i < u_num.length; i++) {
//					System.out.print((i + 1) + "번째 수 = ");
//					u_num[i] = sc.nextInt();
//				}
//				if(u_num[0] == u_num[1] 
//						|| u_num[0] == u_num[2] 
//								|| u_num[1] == u_num[2]) {
//					System.out.println("같은 숫자가 있습니다. 다시 입력해 주세요");
//					continue;
//				}
//				break;
//			}
			
			
			// TODO:3. 비교
		//	int strike = 0, ball = 0;
			
			// ball
			int ball = Ball(u_num, r_num);
			
//			for(int i = 0;i < r_num.length; i++) {
//				for(int j = 0;j < r_num.length; j++) {
//					if(u_num[i] == r_num[j] && i != j) {
//						ball++;
//					}
//				}			
//			}
			
			
			// strike
			int strike = Strike(u_num, r_num);
			
//			for(int i = 0;i < r_num.length; i++) {
//				if(u_num[i] == r_num[i]) {
//					strike++;
//				}				
//			}
			
			
			if(strike > 2) {
				// 맞췄을 때
				clear = true;
				break;
			}		
			
			// TODO:4. 메시지 			? strike ? ball
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
			
			loop++;
		}
		*/
		////////////////////////////////////
		
		// TODO:5. 결과 출력
		
		resultPrint(clear);
				
		/*
		if(clear) {
			System.out.println("Game Clear!!!");
		}
		else {
			System.out.println("Game Over~");
		}
		*/		
	}
	/*
	static void bRandom(int r_num[]) {
		
	}
	*/
	static int[] bRandom() {
		int r_num[] = new int[3];		
		boolean swit[] = new boolean[10];
		int r, w;
		
		w = 0;		
		while(w < 3) {
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r + 1;			// 1 ~ 10
				w++;
			}			
		}
					
		System.out.println(Arrays.toString(r_num));
		
		return r_num;
	}
	
	static int[] userInput() {
		Scanner sc = new Scanner(System.in);		
		
		int u_num[] = new int[3];
		while(true) {				
			for(int i = 0;i < u_num.length; i++) {
				System.out.print((i + 1) + "번째 수 = ");
				u_num[i] = sc.nextInt();
			}
			if(u_num[0] == u_num[1] 
					|| u_num[0] == u_num[2] 
							|| u_num[1] == u_num[2]) {
				System.out.println("같은 숫자가 있습니다. 다시 입력해 주세요");
				continue;
			}
			break;
		}
		
		return u_num;
	}
	
	static int Ball(int u_num[], int r_num[]) {
		int ball = 0;
		for(int i = 0;i < r_num.length; i++) {
			for(int j = 0;j < r_num.length; j++) {
				if(u_num[i] == r_num[j] && i != j) {
					ball++;
				}
			}			
		}
		return ball;
	}
	
	static int Strike(int u_num[], int r_num[]) {
		int strike = 0;
		for(int i = 0;i < r_num.length; i++) {
			if(u_num[i] == r_num[i]) {
				strike++;
			}				
		}		
		return strike;
	}
	
	static boolean loop(int u_num[], int r_num[]) {
		int loop = 0;	
		boolean clear = false;
		while(loop < 10) {
			// TODO:2. user input -> 3개
			u_num = userInput();			
			
			// TODO:3. 비교			
			// ball
			int ball = Ball(u_num, r_num);
			
			// strike
			int strike = Strike(u_num, r_num);
			
			if(strike > 2) {
				// 맞췄을 때
				clear = true;
				break;
			}		
			
			// TODO:4. 메시지 			? strike ? ball
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
			
			loop++;
		}
		
		return clear;
	}
	
	static void resultPrint(boolean clear) {
		if(clear) {
			System.out.println("Game Clear!!!");
		}
		else {
			System.out.println("Game Over~");
		}
	}
	
	
	
}







