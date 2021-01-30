package gbbGame;

import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int userNum, comNum;
		int result;	// 결과
		int win, lose, draw;
		
		win= lose= draw=0;
		
	while(true) {
		
		// 1. random ->1
		comNum = (int)(Math.random()*3); // 0, 1, 2
		// 2. user input ->1
		System.out.print("가위(0) 바위(1) 보(2) = ");
		userNum = sc.nextInt();
		
		// 3. 비교 		승/패/무 
		/*
		// win 0-2 1-0 2-1
		if(userNum == 0 && comNum ==2 ) result = 0;
		else if(userNum == 1 && comNum ==0)result = 0;
		else if(userNum == 2 && comNum ==1)result = 0;
		
		// lose 2-0 0-1 1-2
		if(userNum == 2 && comNum ==0 ) result = 1;
		else if(userNum == 0 && comNum ==1)result = 1;
		else if(userNum == 1 && comNum ==2)result = 1;
		
		// draw 0-0 1-1 2-2
		if(userNum == 0 && comNum ==0 ) result = 2;
		else if(userNum == 1 && comNum ==1)result = 2;
		else if(userNum == 2 && comNum ==2)result = 2;
		*/
		
		//user (0)가위 (1)바위 (2)보
		/*
		  0-2 1-0 2-1
		  com		user
		   2    -    0       +2  =  4%3 ->1
		   0    -    1       +2  =  1%3 ->1
		   1    -    2       +2  =  1%3 ->1
		   
		  2-0 0-1 1-2
		   0    -    2 		 +2	 =  0%3 ->0
		   1    -    0       +2  =  3%3 ->0
		   2    -    1       +2  =  3%3 ->0
		   
		  0-0 1-1 2-2
		   0    -    0       +2  =  2%3 ->2
		   1    -    1       +2  =  2%3 ->2
		   2    -    2       +2  =  2%3 ->2
		   
		 
		 */
		
		result = (comNum - userNum +2) %3;
		
		String msg = "";
		
		switch(result) {
			case 1: 
				msg = "승리했습니다";
				win++;
				break;
			case 2: 
				msg = "패배했습니다";
				lose++;
				break;
			case 3: 
				msg = "비겼습니다";
				draw++;
				break;
		}
		
		// 4. result
		String user = "";
		String com = "";
		
		if(userNum ==0) user = "가위";
		else if(userNum == 1)  user="바위";
		else if(userNum == 2)  user="보";
		
		switch (comNum) {
			case 0 : 
				com = "가위";
				break;
			case 1 : 
				com = "바위";
				break;
			case 2 : 
				com = "보";
				break;
			
		}
		
		System.out.println("당신:" + user);
		System.out.println("컴퓨터:" + com);
		System.out.println(msg);
		System.out.println(win + "승 " + lose + "패 " + draw + "무 입니다");
		
		System.out.print("한판 더 하시겠습니까?(y/n) = ");
		String str = sc.next();
		
		if(str.equals("n")||str.equals("N")) {
			System.out.println("안녕히 가십시오");
			break;
		}
		
		System.out.println("게임을 다시 시작합니다");	
	}
}
	
	
	public static void main01(String[] args) {
		/*
		   가위 바위 보 
		    
		   random -> 1 
		   
		   user input  -> 1
		   
		   win/lose/draw 판정  
		   
		   ?승 ?패 ?무 
		   
		   무한 플레이 
		 */
		int defeat, win, draw;
		defeat = win = draw = 0;
		
		
	while(true) {
		int input1[] = new int[1];
		int random[] = new int[1];
		
		int ran = (int)(Math.random()*3);
		
		System.out.println(ran);
		ran = random[0];
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("[0]가위[1]바위[2]보");
		int input = sc.nextInt();
		input = input1[0];
		
		
		if((input!=2 &&input > ran) || (ran-input)==2) {
			System.out.println("승리");
			win++;
		}
		else if((input!=0 &&input < ran) || (ran-input)==-2) {
			System.out.println("패배");
			defeat++;
			
		}
		else if(input == ran) {
			System.out.println("비김");
			draw++;
		}
		System.out.println(win+"승 "+draw+"무 "+defeat+"패");
	 }
		
	}//end main

}
