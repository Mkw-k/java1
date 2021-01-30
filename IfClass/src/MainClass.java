
public class MainClass {

	public static void main(String[] args) {
		
		/*
		 	제어문 
		 	
		 	 -조건
	
		 	 if 
		 	 
		 	 if 
		 	 else
		 	 
		 	 if
		 	 else if 
		 	 else
		 	 
		     switch 
		     
		     형식 : 
		     if(조건) {  조건-> 논리연산(true/false)
		              처리
		      }
		      
		      조건 -> == > < >= <= != 
		      	  논리 연산자 : &&(and) ||(or) !(not)
		     
		 */
		
		int number = 5; 
		
		if(number > 0) {
			System.out.println("number는 0보다 크다");		
		}
		
		if(number >0 && number <10) 
			System.out.println("number는 0보다 크고 10보다 작다");
		
		if(number == 5) {
			System.out.println("number는 5입니다");
		}
		if(number != 9) {
			System.out.println("number는 9가 아닙니다");
		}
		
		
		
		/*
		  python 
		  if 조건 : 
		  	   처리1
		  	   처리2
		  
		//	if else문 
			형식 : 
				if( 조건) {
				    처리 1 
				} 
				else {
				    처리 2
				}
		 		
		 		삼항연산자 
		 		값 = ( 조건)? 값1 : 값2;
		 		
		 */
		
		if(number > 5) {
			System.out.println("number는 5보다 크다");
		}
		else {
			System.out.println("number는 5보다 작거나 같다");
		}

		/*
		 조건 분기 
		 if( 조건1 ) {
		         처리1
		 }
		 else if( 조건 2) {
		         처리2 
		 }
		  else if( 조건 3) {
		          처리3
		 }
		 else {   <--- 선택
		          처리4
		 }
		 
		 */
		
		number = 95;
		if(number ==100) {
			System.out.println("A+입니다");
		}
		else if (number >= 90) {
			System.out.println("A입니다");
		}
		else if (number >= 80) {
			System.out.println("B입니다");
		}
		else if (number >= 70) {
			System.out.println("C입니다");
		}
		else {
			System.out.println("재시험입니다");
		}
		
		if(number ==100) {
			System.out.println("A+입니다");
		}
		else if (number >= 90 && number <100) {
			System.out.println("A입니다");
		}
		else if (number >= 80 && number <90) {
			System.out.println("B입니다");
		}
		
		/*
		    조건 안에 조건 
		   if( 조건 1 ) {
		   
		       if( 조건2 ) {
		                    처리1
		       }
		       else {
		                    처리2
		       }
		     }
		 */
		
		number = 94;
		
		// 95 <= A+ 
		// 95 > A 
		
		if(number >= 90 && number <= 100) {
			if(number >=95) {
				System.out.println("A+입니다");
			}
			else {
				System.out.println("A입니다");
			}
		}
		
		boolean b; // true(1)/false(0)
		b = false;
		
		if(b == false) {
			System.out.println("b는 false입니다");
		}
		
		if(!b) {
			System.out.println("b는 false입니다");
		}
		
		b=true;
		
		if(b == true) {
			System.out.println("b는 true입니다");
		}
		if(b) {
			System.out.println("b는 true입니다");
		}
		
		String str1 = "안녕하세요";
		String str2 = "안녕";
	      str2 = str2 + "하세요";
		
	//	System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("같은문자열입니다");
			
		}else {
			System.out.println("다른문자열입니다");
		}
		
//		if(str1.equals(str2) == true){   // 문자열을 정상 비교하기 위해서는 equals를 써야함 
			if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다");
		}else {
			System.out.println("다른문자열입니다");
		}
		
	   String str3 = "나는 성공할 수 있습니다";
	   
//	   if(str3.contains("성공") == true) {
		   if(str3.contains("성공")) {
		   System.out.println("'성공'의 문자열을 포함하고 있습니다");
		}
	   else {
		   System.out.println("'성공'의 문자열은 없습니다");
	   }
		   
		   
			
	}

}





