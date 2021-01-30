import java.util.Scanner;

public class MainClass1 {
	/*
    Baseball
    
     1~10  -> 3개
     
     random	user
     7 1 6 -> 1 4 5   = 1 ball
     		 -> 7 3 4   = 1 strike
     		 -> 7 2 1   = 1 strike 1 ball	
			 -> 7 6 1   = 1 strike 2 ball
	rnum1 != rnum2 != rnum3
	
	1 2 2 -> 1 2 3  = 2 strike 1 ball 말이 안됨 
	2 2 2 -> 1 2 3  = 1 strike 2 ball 
*/
	
	public static void main(String[] args) {
		int r1, r2, r3;
		Scanner sc = new Scanner(System.in);
		int u1, u2, u3;
		int random[] = new int[3];
		int input[] = new int[3];
		int sCount, bCount, cCount;
		sCount = bCount = 0;
		cCount = 1;
		
		//1. random -> 3개  다만 3개의 숫자가 다 달라야 한다 
		
		r1 = (int)(Math.random()*9)+1;
		random[0] = r1;
		while(true) {
			r2 = (int)(Math.random()*9)+1;
				if(r2 != r1) {
					random[1] = r2;
					break;
				}
//				System.out.println("다시생성");
		}
		
		while(true) {
			r3 = (int)(Math.random()*9)+1;
				if(r3 != r2 && r3 !=r1) {
					random[2] = r3;
					break;
				}
//				System.out.println("다시생성");
		}
		
		System.out.println(random[0]+" "+random[1]+" "+random[2]);
		
	
		//////////////////////////////////////////////// loop 10번 
for(int k = 0; k<10; k++) {
		sCount = 0;
		bCount = 0;
		System.out.println(cCount+"번째 기회 (총 10번중)");
	
		//2. user input -> 3개 
		System.out.println("첫번째 숫자 입력");
		u1 = sc.nextInt();
		
		input[0] = u1;
		
		
		while(true) {
			System.out.println("두번째 숫자 입력");
			u2 = sc.nextInt();
				if(u2 != u1) {
					input[1] = u2;
					break;
				}
				System.out.println("중복숫자입니다 다시 입력하세요");
		}
		
		while(true) {
			System.out.println("세번째 숫자 입력");
			u3 = sc.nextInt();
				if(u3 != u2 && u3 !=u1) {
					input[2] = u3;
					break;
				}
				System.out.println("중복숫자입니다 다시 입력하세요");
		}
		
		System.out.println(input[0]+" "+input[1]+" "+input[2]);
		
		
		
		//3. 비교 (판정)
		for(int i = 0; i < input.length; i ++) {
			for(int j =0; j<random.length ; j++ ) {
				if(input[i] == random[j]) {
					if(i == j) {
						System.out.println("strike");
						sCount++;
					}
					else {
						System.out.println("ball");
						bCount++;
					}
				}
			}
		}
		
		//4. 메시지    ? strike ? ball 
		System.out.println(sCount+" Strike "+bCount+" ball ");
		
		if(sCount == 3) {
			break;	
		}
		
		cCount++;
}//total for	
		
		//////////////////////////////////////////////////////////
		                                                                                            
		//5. 결과 출력 
		if(sCount == 3) {
			System.out.println("Game Clear!");
		}
		else if(cCount == 11){
			System.out.println("Game over");
		}
		
				
	
		
	
		

	}//end main

}//end class
