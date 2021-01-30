
public class MainClass {

	public static void main(String[] args) {
		
		// 논리 연산자 (true/false)
		/*
		  논리연산자 + 제어문 
		  
		  &&    AND 연산   그리고            
		  ||    OR 연산     또는              
		  !     NOT      ...아닌			true -> false  false -> true
		 */
		int num = 5; 
		
		// AND 
		System.out.println("AND >>");
		System.out.println(num <= 5 );
		System.out.println(num > 0 && num <10);
		System.out.println(num < 5 && num < 6);
		System.out.println();
		
		
		// OR
		System.out.println("OR >>");
		System.out.println(num > 0 || num >10);
		System.out.println(num < 0 || num > 6);
		
		System.out.println(num > 10 && num < 20); // num = 11 ~ 19
		System.out.println(num > 10|| num < 20);
		
		System.out.println(num < 6 );  // ~5
		System.out.println(num > 10 ); // 11~ 
		
		System.out.println(num < 6 || num > 10);
		System.out.println();
		
		// NOT
		System.out.println("NOT >>");
		System.out.println(num > 5 );
		System.out.println(!(num > 5) );   // num <= 5
		
		System.out.println(num > 0 && num < 10);
		System.out.println();
		
		num = 0;
		System.out.println("변수가 0으로 변경 >>");
		System.out.println(!(num > 0 && num < 10));  
		System.out.println(num <= 0 || num >= 10);  //위에 거랑 동일 앤드 연산도 뒤집혀서 or연산으로 바뀜 
		
		System.out.println(num == 5);
		System.out.println(num != 5);

		// NAND == not and  
		/*
			AND			 NAND			OR
		 	T T True     False  	 	T T True
		 	T F False	 True  			T F True
		 	F T False    True 			F T True
		 	F F False    True  			F F False 
		 	
		 */
		
		//삼항 연산자 
		/*
		  값 = ( 조건 ) ? 값1 : 값2 
    	 */
		
		num = -1;
		
		int n;
		
		n = (num > 0)? 100:200;  //0보다 크면 100 0보다 작으면 200 
		System.out.println("n = " + n);
		
		char c;
		
		c = (num < 0)? 'Y' : 'N';
		System.out.println("c = "+c);
	}

}
