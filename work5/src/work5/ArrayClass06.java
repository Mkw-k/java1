package work5;

import java.util.Scanner;

public class ArrayClass06 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("숫자입력");
		str = sc.next();
		
		boolean b = false;
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			int asc = (int)c; //48 <= &&  57 >=
			if(asc < 48 || asc >57) {
				b = true;				//1a2
				break;
			}
			
		}
		
		if(b == true) {
			System.out.println("숫자가 아닙니다");
			
		}
		else {
			System.out.println("숫자입니다");
		}
	}
	
	
	
	
	
	
	
	public static void main01(String[] args) {
//		String 입력 
		Scanner sc = new Scanner (System.in);
	
		
		String result ="";
		int idx = 0;
	
loop : for(;;) {
	String txt = sc.nextLine();
		for(int i = 0; i < txt.length(); i++) {
			char c = txt.charAt(i);
				if((int)c>=48 && (int)c <= 57)	{
					idx = (int)c;
					System.out.println("숫자가 맞습니다");
					System.out.println("result :" +result);
					break loop;
			}
				else {
					idx = (int)c;
					
					result = result + (char)idx;
				}
			
		}
		System.out.println("숫자가아닙니다");
		System.out.println("result :" +result);
	
	}
		
		// 모두 숫자?
		// 문자가 있는지?

		//숫자입니다
		//숫자가 아닙니다 .

		// ->123a3 -> 숫자가 아닙니다 
		// -> 345 -> 숫자입니다


	}

}
