import java.util.Scanner;

public class MainClass {
//숫자가 아니면 다시입력하십시오 하고 올리고 
//연산자도 연산자가 아니면 다시입력하십시오 하고 올리고 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 계산기 
		String numStr1, numStr2;
		int num1, num2; 	// 입력용
		String oper;		 //입력용
		int result= 0;   	  // 결과 출력용 
		boolean b = true;
		
		// 1. 입력 
		// 숫자1 
		
	while(true) {
		System.out.print("숫자1 = ");
		numStr1 = sc.next();
		
		for(int i =0; i<numStr1.length(); i++) {
//			char c = num1.charAt(i);
//			int asc = (int)c;
			int asc = (int)numStr1.charAt(i);
			
		
			if(asc < 48 || asc > 57) { //숫자가 아니다
				b = false;
				break;
			}
			else {
				b = true;
			}
			
		}
		
		if(b==true) { //숫자를 정상적으로 입력했음 
			break;
		}
		
		System.out.println("숫자가 아닌 문자가 포함되어있습니다. 다시 입력하세요");
	}//end while
		
		
		//연산자(+ - * /)
	while(true) {
		System.out.print("(+ - * /) = ");		
		oper = sc.next();
		
		if( oper.equals("+") == true || oper.equals("-") == true 
				|| oper.equals("*") == true ||oper.equals("/") == true) {
			break;
		}
	System.out.println("연산자(+ - * /)를 입력해 주십시오 ");	
	}//end while
	
//		for(int i =0; i<oper.length(); i++) {
//			char c = oper.charAt(i);
//			int asc = (int)c;
//		
//			if(asc < 42 || asc > 47) {
//				b = false;
//				System.out.println("연산자로 다시 입력하세요");
//				continue;
//			}
//			else {
//				b = true;
//			}
//		}
		
		// 숫자2
	while(true) {
		System.out.print("숫자2 = ");
		numStr2 = sc.next();
		
		for(int i = 0; i< numStr2.length(); i ++) {
			int asc = (int)numStr2.charAt(i); 
			
				if(asc <48 || asc>57) {
					b = false;
					break;	
				}
				else {
					b = true;
		}
	}
		if(b == true) {
		break;
		}
		System.out.println("숫자가 아닌 문자가 포함되어있습니다. 다시 입력하세요");
	}//end while
	
		
		//문자열 -> 숫자 
		num1 = Integer.parseInt(numStr1);
		num2 = Integer.parseInt(numStr2);
		
	
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
	}
}
        


		// if
//		if(oper.equals("+")) {
//			result = num1 + num2;
//		}
//		else if (oper.equals("-")) {
//			result = num1 - num2;
//		}
//		else if (oper.equals("*")) {
//			result = num1 * num2;
//		}
//		else if (oper.equals("/")) {
//			result = num1 / num2;
//		}
//		else {
//			System.out.println("연산자를 찾을수 없습니다.");
//		}
		
		
		
		// 3.출력
//		System.out.println(num1 + " "+oper+ " "+num2+ " = "+ result);
		
		
		
		
		
		
		
		// 2. 출력
		// +
		
	
	
	
	
	
	
//	public static void main01(String[] args) {
//		// 계산기 
//		
//		// 1. 입력 
//		// 숫자1 
//		//연산자(+ - * /)
//		// 숫자2
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("첫번째 숫자 >> ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("연산자 입력 >> ");
//		int kb1 = sc.nextInt();
//		
//		System.out.print("두번째 숫자 >> ");
//		int num2 = sc.nextInt();
//		
//		System.out.println(num1*kb1*num2);
//		
//		
//		
//	switch (kb1) {
//	case '+' :
//		System.out.println(num1+ " + " + num2 + " = " + (num1+num2) );
//		break;
//	case '-' :
//		System.out.println(num1+ " - " + num2 + " = " + (num1-num2) );
//		break;
//	case '/' :
//		System.out.println(num1+ " / " + num2 + " = " + (num1/num2) );
//		break;
//	case '*' :
//		System.out.println(num1+ " * " + num2 + " = " + (num1*num2) );
//		break;
//	
//	}
//		
//		
//		
//		
//		
//		
//		// 2. 출력
//		// +
//		// -
//		// *
//		// /
//		
//	}

