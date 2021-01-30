import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {		
	//	Scanner sc = new Scanner(System.in);
		
		// 계산기
	//	String numStr1, numStr2;	// 입력용
		int num1, num2;				// 계산용
		String oper;				// 입력용		
		int result = 0;				// 결과 출력용
				
		// 1.숫자입력
		
		num1 = numberInput("숫자1");
		/*
		while(true) {
			System.out.print("숫자1 = ");
			numStr1 = sc.next();	
			
			boolean b = true;			
			for(int i = 0;i < numStr1.length(); i++) {
				int asc = (int)numStr1.charAt(i);
				
				// 48 ~ 57 <- ascii
				if(asc < 48 || asc > 57) {	// 숫자가 아니다
					b = false;
					break;
				}			
			}				
			
			if(b == true) {	// 숫자를 정상으로 입력했음
				break;
			}
			
			System.out.println("숫자가 아닌 문자가 포함되어 있습니다. 다시 입력하세요");
		}
		*/
		
		// 연산자(+ - * /)	
		oper = operatorInput();		
		/*
		while(true) {
			System.out.print("(+ - * /) = ");
			oper = sc.next();
			
			if(oper.equals("+") == true || oper.equals("-") == true
				|| oper.equals("*") == true || oper.equals("/") == true ) {
				break;
			}
			System.out.println("연산자(+ - * /)를 입력해 주십시오.");
		}
		*/
		
		// 숫자2
		num2 = numberInput("숫자2");
		
	//	System.out.print("숫자2 = ");
	//	numStr2 = sc.next();
		
		
		// 문자열 -> 숫자
	//	num1 = Integer.parseInt(numStr1);
	//	num2 = Integer.parseInt(numStr2);
		
		
		// if switch
		// 2.연산
		/*
		if(oper.equals("+")) {
			result = num1 + num2;			
		}
		else if(oper.equals("-")) {
			result = num1 - num2;
		}
		else if(oper.equals("*")) {
			result = num1 * num2;
		}
		else if(oper.equals("/")) {
			result = num1 / num2;
		}
		*/
		
		result = processing(num1, num2, oper);
		/*
		switch( oper ) {
			case "+":
				result = num1 + num2;				
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}*/
		
		// 3.출력
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
		
		
		/*
		// +
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		// -	
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		
		// *
		// / 		  
		 */
	}
	
	static int numberInput(String title) {
		Scanner sc = new Scanner(System.in);
		String numStr = "";
		
		while(true) {
			System.out.print(title + " = ");
			numStr = sc.next();	
			
			// 숫자만으로 되어 있는지?
			
			boolean b = isNumber(numStr);
			/*
			boolean b = true;
			for(int i = 0;i < numStr.length(); i++) {
				int asc = (int)numStr.charAt(i);
				
				// 48 ~ 57 <- ascii
				if(asc < 48 || asc > 57) {	// 숫자가 아니다
					b = false;
					break;
				}			
			}
			*/				
			
			if(b == true) {	// 숫자를 정상으로 입력했음
				break;
			}
			
			System.out.println("숫자가 아닌 문자가 포함되어 있습니다. 다시 입력하세요");
		}
		
		int number = Integer.parseInt(numStr);
		
		return number;
	}
	
	static boolean isNumber(String str) {
		boolean b = true;
		for(int i = 0;i < str.length(); i++) {
			int asc = (int)str.charAt(i);
			
			// 48 ~ 57 <- ascii
			if(asc < 48 || asc > 57) {	// 숫자가 아니다
				b = false;
				break;
			}			
		}	
		return b;
	}
	
	static String operatorInput() {
		Scanner sc = new Scanner(System.in);
		String oper = "";
		
		while(true) {
			System.out.print("(+ - * /) = ");
			oper = sc.next();
			
			if(oper.equals("+") == true || oper.equals("-") == true
				|| oper.equals("*") == true || oper.equals("/") == true ) {
				break;
			}
			System.out.println("연산자(+ - * /)를 입력해 주십시오.");
		}
		
		return oper; 
	}
	
	static int processing(int num1, int num2, String oper) {
		int result = 0;
		switch( oper ) {
			case "+":
				result = num1 + num2;				
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}
		
		return result;
	}
	

}











