package ball;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {
	
	int r_num[];
	int u_num[];
	boolean clear;
	
	public void init() {
		r_num = new int[3];
		u_num = new int[3];
		clear = false;		
	}
	
	public void bRandom() {			
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
	}
	
	void userInput() {
		Scanner sc = new Scanner(System.in);			
		
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
	}
	
	int Ball() {
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
	int Strike() {
		int strike = 0;
		for(int i = 0;i < r_num.length; i++) {
			if(u_num[i] == r_num[i]) {
				strike++;
			}				
		}		
		return strike;
	}
	
	public void loop() {
		int loop = 0;			
		while(loop < 10) {
			// TODO:2. user input -> 3개
			userInput();			
			
			// TODO:3. 비교			
			// ball
			int ball = Ball();
			
			// strike
			int strike = Strike();
			
			if(strike > 2) {
				// 맞췄을 때
				clear = true;
				break;
			}		
			
			// TODO:4. 메시지 			? strike ? ball
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
			
			loop++;
		}		
	}
	
	public void resultPrint() {
		if(clear) {
			System.out.println("Game Clear!!!");
		}
		else {
			System.out.println("Game Over~");
		}
	}
	
	
}
