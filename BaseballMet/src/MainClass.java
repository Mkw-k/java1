import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	
	
		
	
	public static void main(String[] args) {
		
	
		int r_num[] = null;
		int u_num[] = null;
		boolean clear;
		
		r_num = new int[3];
		u_num = new int[3];
		
		clear = false;
		
		ranNumMaker(r_num);
		System.out.println(Arrays.toString(r_num));
		
		//////////////////////////////////// loop
		clear = GameLoop(u_num, r_num, clear);
		////////////////////////////////////
		
		// TODO :1 . 결과 출력
		if(clear) {
			System.out.println("Game Clear!!!");
		}
		else {
			System.out.println("Game Over~");
		}
	}
		
		

	private static boolean GameLoop(int u_num[],int r_num[],boolean clear) {
		int loop = 0;
	
		
		while(loop < 10) {
			// 2. user input -> 3개
			uInput(u_num);
			// 3. 비교
			compare(r_num, u_num);
			if(strike > 2) {
				// 맞췄을 때
				clear = true;
				break;
			}		
			// 4. 메시지 			? strike ? ball
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
			loop++;
		}
		return clear;
		
	}



	static void resultInput(boolean clear) {
		if(clear) {
			System.out.println("Game Clear!!!");
		}
		else {
			System.out.println("Game Over~");
		}
	}
		
	

	static void compare(int r_num[],int u_num[]) {
		int strike = 0; 
		int ball = 0;
		
		// ball
		for(int i = 0;i < r_num.length; i++) {
			for(int j = 0;j < r_num.length; j++) {
				if(u_num[i] == r_num[j] && i != j) {
					ball++;
				}
			}			
		}
		
		// strike
		for(int i = 0;i < r_num.length; i++) {
			if(u_num[i] == r_num[i]) {
				strike++;
			}				
		}
		
	}

	private static void uInput(int u_num[]) {
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

	static void ranNumMaker(int r_num[]) {
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
	}
}





