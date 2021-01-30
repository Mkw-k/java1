package work4;

import java.util.Scanner;

public class report2 {

	public static void main(String[] args) {
		
		//하나의 수(1~100)를 입력받고 입력 받은 수는 어느 범위에 있는지 출력되는 프로그램을 작성하라. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 = ?");
		int number = sc.nextInt();
		int boundNum = 0;
		
		for(int i = 0; i <10; i++ ) {
			if(number >=0 + boundNum && number < 10 + boundNum) {
				System.out.println("입력한 수는 "+ boundNum+"보다 크고 "+(boundNum+10)+" 보다 작거나 같다");
}//end if
			boundNum = boundNum+10;
//			n = n * 10;
			
			if (number > boundNum && number <= (boundNum + 10)) {
			System.out.println("입력한 수는 "+ boundNum+"보다 크고 "+(boundNum+10)+" 보다 작거나 같다");
}//end for
		
		
		
		}
		
		
}//end main
}//end class

		
	