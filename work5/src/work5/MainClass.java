package work5;

import java.util.Scanner;

public class MainClass {

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
	Scanner sc = new Scanner(System.in);
	
	int randNum, userNum;
	boolean clear;
	
	clear = false;
	
	randNum = (int)(Math.random()*100)+1;
	System.out.println(randNum);
	
	int w = 0;
	while(w < 10) {
	System.out.println((w +1)+"회 숫자입력 = ");
	userNum = sc.nextInt();
	
	int msg = 0;
	if(userNum > randNum) {
		msg = 1;
	}
	else if(userNum < randNum) {
		msg = 2;
	}
	else {
		clear = true;
		break;
	}
		
		
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
	
	if(clear) {
		System.out.println("Game clear!!!");
	}
	else {
		System.out.println("Game Over~");
	}
	
}//end main
}//end class
