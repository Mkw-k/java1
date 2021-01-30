import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
			Baseball
			
			1 ~ 10 -> 3개
			
			random	   user	
			7 1 6	-> 1 4 5	= 1 ball
			 		-> 7 3 4	= 1 strike
					-> 7 2 1	= 1 strike 1 ball
					-> 7 6 1 
			
			1 2 2   -> 1 2 3    = 2 strike 1 ball
			2 2 2   -> 1 2 3    = 1 strike 2 ball 
					
			rnum1 != rnum2 != rnum3		
		*/
		
		int r_num[] = null;
		int u_num[] = null;
		boolean clear;
		
		// initialize
		r_num = new int[3];
		u_num = new int[3];
		clear = false;
		
		// 1. random -> 3개	rnum1 != rnum2 != rnum3
		/*
		while(true) {
			r_num[0] = (int)(Math.random() * 10) + 1;
			r_num[1] = (int)(Math.random() * 10) + 1;
			r_num[2] = (int)(Math.random() * 10) + 1;			
			
			if(r_num[0] != r_num[1] 
					&& r_num[0] != r_num[2]
							&& r_num[1] != r_num[2]) {
				break;
			}
		}
		*/
		
		/*
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };		
		for(int i = 0;i < 1000; i++) {
			int x = (int)(Math.random() * 10);	// 0 ~ 9
			int y = (int)(Math.random() * 10);	// 0 ~ 9
			
			int temp;
			temp = array[x];
			array[x] = array[y];
			array[y] = temp;			
		}
		
		r_num[0] = array[0];
		r_num[1] = array[1];
		r_num[2] = array[2];
		*/
		
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
				
		/*
		for(int i = 0;i < r_num.length; i++) {
			System.out.println("r_num[" + i + "] = " + r_num[i]);
		}
		*/
	//	System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(r_num));
		
		
		//////////////////////////////////// loop
		int loop = 0;
		
		while(loop < 10) {
			// 2. user input -> 3개
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
			
			// 3. 비교
			int strike = 0, ball = 0;
			
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
			
			if(strike > 2) {
				// 맞췄을 때
				clear = true;
				break;
			}		
			
			// 4. 메시지 			? strike ? ball
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
			
			loop++;
		}
		////////////////////////////////////
		
		// 5. 결과 출력
		if(clear) {
			System.out.println("Game Clear!!!");
		}
		else {
			System.out.println("Game Over~");
		}
	}
}




