
import java.util.Scanner; 




public class report1 {

	
	public static void main(String[] args) {
		for(;;) {
		Scanner sc = new Scanner(System.in);
		// 계산기 
	
		int num1, num2; // 입력용
		num1 = num2 = 0;
		
		String oper;		 //입력용
		int result= 0;   	  // 결과 출력용 
		
		// 1. 입력 
		// 숫자1 
		try {
		System.out.print("숫자1 = ");
		num1 = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("숫자만 입력해야합니다.(숫자1)");
			break;
		}
		//연산자(+ - * /)
		try {
		System.out.print("(+ - * /) = ");		
		oper = sc.next();
		}
		catch (Exception e) {
			System.out.println("연산자만 입력해야합니다.");
			break;
		}
		
		// 숫자2
		try {
		System.out.print("숫자2 = ");
		num2 = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("숫자만 입력해야합니다.(숫자2)");
			break;
		}
		
		// 2.연산
		//switch
		switch (oper) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			default : 
				System.out.println("연산자를 찾을수 없습니다.");
		}
		System.out.println(num1 + " "+oper+ " "+num2+ " = "+ result);
		
		}//end for
 }//end main
	
}//end class
	
	
