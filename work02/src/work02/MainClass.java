package work02;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("###,###"); //3자리마다 콤마
		Scanner kb = new Scanner(System.in);

//		 편의점 	 
//		 지불금액 : 3,210원     입력받기 
		Line();
		System.out.print("가격 = ? ");
		int Price =kb.nextInt();
		System.out.println("제품가격은 "+formatter.format(Price)+"원 입니다.");
		Line();

//		 본인금액  : 10,000원  입력
		System.out.print("지불액 = ? ");
		int Payment =kb.nextInt();
		System.out.println("고객 지불액은 "+formatter.format(Payment)+"원 입니다.");
		Line();
		
//		거스름 돈 -> ?
		int Change = Payment - Price;
		System.out.println("총거스름돈 : "+formatter.format(Change)+"원");
		
		
		Line();
//		5000원 -> ?
		int Cal1=  Change/5000;
		System.out.println("5,000원권 : "+Cal1+"장");
		Change = Change-((Change/5000)*5000);
	
//		1000원 -> ?
		int Cal2=  Change/1000;
		System.out.println("1,000원권 : "+Cal2+"장");
		Change = Change-((Change/1000)*1000);		
//		int m1000 = (Change %5000)/1000;
		
//		500원 -> ?
		int Cal3=  Change/500;
		System.out.println("500원권 :   "+Cal3+"개");
		Change = Change-((Change/500)*500);
//		int m500 = (Change%1000)/500;
		
//		100원 -> ?
		int Cal4=  Change/100;
		System.out.println("100원권 :   "+Cal4+"개");
		Change = Change-((Change/100)*100);
//		int m100 = (Change%500)/100;
		
//		50원 -> ?
		int Cal5=  Change/50;
		Change = Change-((Change/50)*50);
		System.out.println("50원권 :    "+Cal5+"개");
//		int m50 = (Change%100)/50;
		
//		10원 -> ?
		int Cal6=  Change/10;
		System.out.println("10원권 :    "+Cal6+"개");
		Change = Change-((Change/10)*10);
//		int m10 = (Change%50)/10;
		Line();
		TimeData();
		
		
		
		
		
	}

	private static void TimeData() {
		// TODO Auto-generated method stub
		Date Time = new Date();
	    System.out.println("출력시간 : "+Time);
	}

	private static void Line() {
		// TODO Auto-generated method stub
		System.out.println("===================================");
		
	}

}
