
public class MainClass {

	public static void main(String[] args) {
/*
 * 
 * Operator : 연산자 
 * 
 *     + - * 
 *     /   9/2 -> 4몫
 *     %   9/2 -> 1 나눈 나머지
 *     
 *     	   3/0 -> 0 나누는 값이 0이 되면 안된다. 
 * 
 */
		
		int num1, num2;
		int result;
		

		// 입력 
		num1 = 25;
		num2 = 7;
		
		result = num1 + num2; 
		System.out.println(num1+ " + " + num2 + " = " + result);
		
		System.out.println(num1+ " - " + num2 + " = " + (num1-num2));
		
		result = num1 * num2;
		System.out.println(num1+ " X " + num2 + " = " + result);
		
//		num2 = 0;
		result = num1 / num2;
		System.out.println(num1+ " / " + num2 + " = " + result);
		
		result = num1 % num2;
		System.out.println(num1+ " % " + num2 + " = " + result);
		
		//자기 자신(변수)을 갱신
		num1 = 0;
		// +1 
		num1 = num1 + 1;
		System.out.println("num1 = "+num1);
		
		num1 += 1;
		System.out.println("num1 = "+num1);
		
		//increment (증가연산)  ++  	== +1
		//decrement (감소연산)  -- 	== -1
		
		num1++;
		System.out.println("num1 = "+num1);
		
		++num1;
		System.out.println("num1 = "+num1);
		
		num1--;
		System.out.println("num1 = "+num1);
		
		--num1;
		System.out.println("num1 = "+num1);
		
		
		int a, b; 
		
		a = 0;
		b = 0;
		
		b = a++; // 대입이 먼저 되고 나서 증가됨 
		System.out.println("a = "+a+ " b = " + b);
		
		b = ++a; // 먼저 증가되고 나서 대입이 됨 
		System.out.println("a = "+a+ " b = " + b);
		
		b=(a++); // 괄호도 소용없음 대입이 먼저됨 
		System.out.println("a = "+a+ " b = " + b);
		
		a++;
		b=a;
		//위와 같이 따로 쓰는 편이 좋음 
	}

}
