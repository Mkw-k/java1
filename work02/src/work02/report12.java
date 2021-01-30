package work02;

import java.util.Scanner;

public class report12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  값 = ( 조건 ) ? 값1 : 값2 
//		int n;
//		
//		n = (num > 0)? 100:200;  //0보다 크면 100 0보다 작으면 200 
//		System.out.println("n = " + n);
		
		Scanner kb = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int var = kb.nextInt();
		
		
		String n;
		n = (var >= 0) ? "양수입니다" : "음수입니다";
		System.out.println(n);
		
		
		
	}

}
