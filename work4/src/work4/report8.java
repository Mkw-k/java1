package work4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class report8 {
	/*
  	입력받은 숫자들의 합계를 구하라
  	>>숫자 몇개?
  	>> 5 
  	>>입력 
  	>> 5개 숫자 
  	>> 합계출력 
*/
	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("###,###"); //3자리마다 콤마
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자몇개? ");
		int c = 1;
		int result = 0;
		int Amou = sc.nextInt();
		int[] number = new int[Amou];
		
		for(int i =0; i < number.length; i++) {
			System.out.println(c+"번째 수를 입력하세요.");
			int val = sc.nextInt();
			number[i] = val;
			result = result + number[i];
			++c;
		}
		System.out.println("총 합계는 "+formatter.format(result)+" 입니다");
		
		
	}
	
	

}