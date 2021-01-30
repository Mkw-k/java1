package work3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		   입력 -> 10진수 
		   출력 -> 2진수 
		   출력 -> 8진수 
		   출력 -> 16진수 
		 */
		
		Scanner kb = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		
//		Integer dec = kb.nextInt();
//		String bin = Integer.toString(dec,2);
//		System.out.println(bin);
//		String oct = Integer.toString(dec,8);
//		System.out.println(oct);
//		String hex = Integer.toString(dec,16);
//		System.out.println(hex);

		int number10 = 127;
		String number2 = Integer.toBinaryString(number10);
		String number8 = Integer.toOctalString(number10);
		String number16 = Integer.toHexString(number10);
		
		System.out.println(number2);
		System.out.println(number8);
		System.out.println(number16);
		
		int num = 0xA2;
		System.out.println(num);
		System.out.printf("0x%x\n",num);
		
		
		
		
		/*
		 * 입력 -> 2진수 
		 * 출력 -> 10진수 
		 * 
		 */
		System.out.println("값을 입력하세요.");
		String by = kb.next();	
		
//		String dec2 = Integer.toString(by, 10); 안됨 오류남 ㅠ 
//		System.out.println(dec2);
		
		Integer decimal=Integer.parseInt(by,2);  
		System.out.println(decimal);  
		
		number2 = "10101100";
		number10 = Integer.parseInt(number2); // 들어가는 값이 한개면 무조건 십진수로 나옴 
		System.out.println("10진수 : "+number10);
	
		/*
		 * 입력 -> 16진수 
		 * 출력 -> 10진수 
		 * 
		 */
		System.out.println("값을 입력하세요.");
		String inHex = kb.next();
		int hToI = Integer.parseInt(inHex,16);
		System.out.println(hToI);
		
		number16 = "AC";
		number10 = Integer.parseInt(number16, 16);
		System.out.println("10진수 : "+number10);
		
		
		

	}

}
