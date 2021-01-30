//calculator base ball sorting 
import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	static int count = 1;
//숫자가 아니면 다시입력하십시오 하고 올리고 
//연산자도 연산자가 아니면 다시입력하십시오 하고 올리고 
	
	public static void main(String[] args) {// 한번밖에 안쓰는 로직같으면 딱히 함수로 안만들어도 된다. 
		// 계산기 
		int num1, num2; 	// 입력용
		String oper;		 //입력용
		int result= 0;   	  // 결과 출력용 
		
		
		// 1. 입력 
		// 숫자1 
		num1 = inputNumbers();
		
		//연산자(+ - * /)
		oper = inputOper();
	
		// 숫자2
		num2 = inputNumbers();
		
		// 2.연산
		//switch
		result = operator(num1, num2, oper);
	
		System.out.println(num1 + " "+oper+ " "+num2+ " = "+ result);
	}

	
	
  static int operator(int num1, int num2, String oper) {
	  int result= 0;   
	 
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
	  
	return result;
}


static String inputOper() {
	 String oper;
	 
	 while(true) {
			System.out.print("(+ - * /) = ");		
			oper = sc.next();
			
			if( oper.equals("+") == true || oper.equals("-") == true 
					|| oper.equals("*") == true ||oper.equals("/") == true) {
				break;
			}
		System.out.println("연산자(+ - * /)를 입력해 주십시오 ");	
		}//end while
	 
		return oper;
	}

 
private static int inputNumbers() {
	boolean b = true;
	String numStr;
	int num;
	
	
	while(true) {
		System.out.print("숫자"+count+" = ");
		numStr = sc.next();
		
		for(int i =0; i<numStr.length(); i++) {
			int asc = (int)numStr.charAt(i);
			
			if(asc < 48 || asc > 57) { //숫자가 아니다
				b = false;
				break;
			}
		}
		
		if(b==true) { //숫자를 정상적으로 입력했음 
			break;
		}
		
		System.out.println("숫자가 아닌 문자가 포함되어있습니다. 다시 입력하세요");
	}//end while
	count++;
	num = Integer.parseInt(numStr);
	return num;
}



}//end class
        


	
