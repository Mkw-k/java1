
public class MainClass {

	public static void main(String[] args) {
		/*
		      switch : if문과 비슷하다               속도 빠르고 코드가 깔끔하다 
		       		    값이 명확해야 한다
		       		   실수를 사용할 수 없다 
		       		   범위를 지정할 수 없다
		       		   
		       		   if(num ==1 {
		       		   }
		       		   else if(num == 2) {
		       		   }
		       		   
		           형식 : 
		           switch( 대상이 되는 변수) {
		                case 값1:
		                                    처리1
		                   break; <---탈출 
		           		case 값1:
		              		처리2
		                   break;
		                    :
		                default :     ==else
		                                     처리n
		            }
		           
		  
		 */
		
		int number =4 ;
		
		switch (number) {
			case 1:			//if(number == 1)			
				System.out.println("number는 1입니다");
				break;    //탈출구문  절대 잊으면 안됨 잊으면 그 다음 구문 까지 진행이 되어버림 
			case 2:			//if(number == 2)   
				System.out.println("number는 2입니다");
				break;
			case 3:			//if(number == 3) 
				System.out.println("number는 3입니다");
				break;
			default:
				System.out.println("number는 1, 2, 3도 아닙니다");
				break; // 사실 의미가 없음 여기에 break는 조건문으로 따지면 else문 이기 때문 
		}//end switch
		
//		switch(number) {
//		case number > 0:    범위를 지정할수 없다
//		}
		

		double d = 1.23;
		if ( d == 1.23) {
			
		}
		
//		switch( d ) {    --> double형 변수는 사용할수 없다.
//		}
		
		char c = 'B';
		switch ( c ) {
			case 'A' : 
				System.out.println("A입니다");
				break;
			case 'B' :
				System.out.println("B입니다");
				break;
		}
		
		String str = "he";
		str = str + "llo";
		
		if(str == "hello") {
			System.out.println("str은 hello입니다");
		}
		
		if(str.equals("hello")) {
			System.out.println("str은 hello입니다 2");
		}
		
		switch (str) {
			case "hello" :   //  str.equal("hello")
				System.out.println("hello");
				break;
		}
		
		
		
		
	}

}




