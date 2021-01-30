package forClass;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	순환문, loop문, 반복문 
		 	
		 	for : 지정 횟수에 따라서 반복하는 제어문 
		 	
		 	형식 : 
		 		for( (선언)초기화 ; 조건식 ; 연산식  ){
		 		
		 		}
		 			
		 		for( (1)  ; (2)(5)(8)(11)  ; (4)(7)(10)  ) {
		 		
		 		처리 (3)(6)(9) 		-> 3번 
		 		
		 		}	
		 		
		 		(12)
		 
		 */
//		
//		  int n;  
//		  for( n = 0; n < 3; n++) { System.out.println("for문 안의 처리"); }
//		 
//	
//		for(int i = 0; i < 10; i++)	{   //더 선호하는 사용법
//			System.out.println(i);
//		}

		
		//1~100
//		for(int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 10; i >0 ; i--) {
//			System.out.println(i);
//		}
		
//		for(int i = 0; i <10; i = i + 2) {
//			System.out.println(i);
//		}
		
		//무한 loop
//		for(int i = 0;   ; i++)	{
//			System.out.println(i);
//		}
		
		
	
		//for문 안에 for 문 = 이중 for문 ->2차원 배열
		for(int i =0; i < 10; i++) {   //0 1 2 3 4 5 6 7 8 9
			System.out.println("i = "+i);
		for(int j = 0; j <5; j++)	 { //0 1 2 3 4 
			System.out.println("   j  = "+j);
		}
	}
		
		int array2[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};

		for( int i =0; i<array2[0].length; i++) {
			System.out.println(array2[0][i]);
		}
		
		for( int i =0; i<3 ; i++) {
			for (int j =0; j<4; j++) {
				System.out.println(array2[i][j]);
			}
		}


		
		
	}

}
