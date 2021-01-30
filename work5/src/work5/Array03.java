package work5;

public class Array03 {

	public static void main(String[] args) {
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다. 
		int[] coinUnit = {500, 100, 50, 10};
//		int[] rest = new int[4];
		
//		int reMoney = 2680;
		int money = 2680;
		System.out.println("money = "+ money);
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원 :"+(money/coinUnit[i]));
			money = money % coinUnit[i];
		}
		
		
//		for(int i=0; i<coinUnit.length; i++) {
//			rest[i] = reMoney/coinUnit[i];
//			reMoney = money%coinUnit[i];
//			
//		}
//		
//			System.out.println("500원 : "+rest[0]);
//			System.out.println("100원 : "+rest[1]);
//			System.out.println("50원 : "+rest[2]);
//			System.out.println("10원 : "+rest[3]);
			
			
	/*
	  실행결과 : 머니=2680
	  		500원 : 5
	  		100원 : 1
	  		50원 : 1
	  		10원 : 3
	 */
	
	}//end main

}//end class
