package dice;

import java.util.Scanner;

public class dice {
	int user;
	int com;
	int bat;
	int result;
	int coin;
	
	private void  u_input() {
		Scanner sc = new Scanner(System.in);
	while(true) {
		
		System.out.println("현재코인수:"+coin+"개");
		System.out.print("배팅할 코인수를 입력하세요>>");
		bat = sc.nextInt();
		
		if(coin>=bat) {
			break;
		}else {
			System.out.println("코인이 부족합니다");
			System.out.println("배팅할 코인의 갯수를 다시 입력하세요");
		}
	}
	
		System.out.println("3~11 사이의 숫자만 인정됩니다");
		System.out.print("두 주사위의 합은?>>");
		user = sc.nextInt();
	}
	
	private void  c_input() {
		int dNum1;
		int dNum2;
		dNum1 = (int)(Math.random()*6)+1;
		dNum2 = (int)(Math.random()*6)+1;
		
		com = dNum1+dNum2;
		System.out.println("컴퓨터 :"+com);
	}
	
	public void loop() {
		coin = 20;
		System.out.println("연산시작");
		System.out.println("현재 코인은"+coin+"개 입니다");
		
		
		while(coin >0) {
			u_input();
			c_input();
			
			if(com == user) {
				if(user==2 || user==12) {
					System.out.println("2와 12는 입력할수 없습니다");
					System.out.println("다시 입력하세요");
					coin--;
					continue;
				}
				else if(user==3 || user ==11) {
					System.out.println("정답!");
					result = 1;
				}
				 else if(user==4 || user ==10) {
					System.out.println("정답!");
					result = 2;
				}
				 else if(user==5 || user ==9) {
					System.out.println("정답!");
					result = 3;
				}
				 else if(user==6 || user ==8) {
				 	System.out.println("정답!");
					result = 4;
				
				 } else if (user == 7) {
					System.out.println("정답!");
					result = 5;
				}
			}else {
				System.out.println("틀렸습니다");
				result = 6;
			}
			resultPrint();
		}
		System.out.println("Game Over!");
	}
	
	private void resultPrint() {
		switch (result) {
			case 1: 
				System.out.println("코인X18배");
				coin = coin+(bat *18);
				break;
			case 2: 
				System.out.println("코인X12배");
				coin = coin+(bat *12);
				break;
			case 3: 
				System.out.println("코인X9배");
				coin = coin+(bat *9);
				break;
			case 4: 
				System.out.println("코인X7배");
				coin = coin + (bat * 7);
				break;
			case 5: 
				System.out.println("코인X6배");
				coin = coin + (bat * 6);
				break;
			case 6: 
				System.out.println("코인: -"+bat+"만큼 감소");
				coin = coin - bat;
				break;
		}
	}

	
}
