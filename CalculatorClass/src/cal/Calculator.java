package cal;

import java.util.Scanner;

public class Calculator {
	int num1, num2;				// 계산용
	String oper;				// 입력용		
	int result;				// 결과 출력용 동적할당하면 자동초기화 0으로 
	
	public	int numberInput(String title) {
			Scanner sc = new Scanner(System.in);
			String numStr = "";
			
			while(true) {
				System.out.print(title + " = ");
				numStr = sc.next();	
				
				// 숫자만으로 되어 있는지?
				
				boolean b = isNumber(numStr);
				
				
				if(b == true) {	// 숫자를 정상으로 입력했음
					break;
				}
				
				System.out.println("숫자가 아닌 문자가 포함되어 있습니다. 다시 입력하세요");
			}
			
			int number = Integer.parseInt(numStr);
			
			return number;
		}
		
	public	boolean isNumber(String str) {
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
	
	public String operatorInput() {
		Scanner sc = new Scanner(System.in);
//		String oper = "";
		
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
	
	
	public void processing(int n1, int n2, String oper) {
		num1 = n1;
		num2 = n2;
		
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
		
		
	}
	
	public void resultPrint() {
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
	}


}//end class
