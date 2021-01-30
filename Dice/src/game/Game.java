package game;

import java.util.Scanner;

import dice.Dice;

public class Game {
	Scanner sc = new Scanner(System.in);

	int coin = 20;
	int batting;
	int userNumber;
	
	Dice diceOne = new Dice();	// composition(합성)
	Dice diceTwo = new Dice();
	
	public void init() {
		diceOne.setRandom();
		diceTwo.setRandom();
		
//		System.out.println("주사위1:" + diceOne.getNumber());
//		System.out.println("주사위2:" + diceTwo.getNumber());		
	}
	
	public void userInput() {
		
		// 베팅 금액
		System.out.print("금액 = ");
		batting = sc.nextInt();
		
		coin = coin - batting;			
		
		// 숫자
		System.out.print("두개 주사위의 합 = ");
		userNumber = sc.nextInt();
	}
	
	public void finding() {
		// 랜덤 주사위의 값
		int diceNum1 = diceOne.getNumber();
		int diceNum2 = diceTwo.getNumber();
		
		int diceSum = diceNum1 + diceNum2;
		
		if(userNumber == diceSum) {
			if(diceSum == 3 || diceSum == 11) {
				batting = batting * 18;
			}
			else if(diceSum == 4 || diceSum == 10) {
				batting = batting * 12;
			}
			else if(diceSum == 5 || diceSum == 9) {
				batting = batting * 9;
			}
			else if(diceSum == 6 || diceSum == 8) {
				batting = batting * 7;
			}
			else if(diceSum == 7){
				batting = batting * 6;
			}
			
			System.out.println("축하합니다");
			coin = coin + batting;
		}
		else {
			System.out.println("아쉽습니다. 다시 도전하십시오");
		}			
	}
	
	public void result() {
		System.out.println("랜덤 주사위1:" + diceOne.getNumber());
		System.out.println("랜덤 주사위2:" + diceTwo.getNumber());
		
		System.out.println("합계:" + (diceOne.getNumber() + diceTwo.getNumber()));
		System.out.println("현재 금액:" + coin);
	}
	
	public void gamePlay() {
		
		while(true) {		
			init();
			userInput();
			finding();
			result();
			
			System.out.print("한판 더(y/n)? = ");
			String again = sc.next();
			
			if(again.equals("n")) {
				System.out.println("안녕히 가십시오");
				break;
			}
			
			System.out.println("다시 시작합니다");
		}
	}
	
	
}






