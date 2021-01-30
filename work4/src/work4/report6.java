package work4;

import java.util.Scanner;

public class report6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.println("입력 범위는 1~9입니다.");
		int result = 0;
		int mul = sc.nextInt();
		
		if(mul > 0 && mul <10) {
			for(int i = 1; i <10; i++) {
				result = mul *i; 
				System.out.println(mul + " * "+ i + " = "+result);
			}
		}
		else {
			System.out.println("숫자가 범위를 초과하였습니다");
			System.out.println("입력 범위는 1~9입니다.");
		}

	}

}
