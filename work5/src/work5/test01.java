package work5;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("숫자입력");
		str = sc.next();
		
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			int asc = (int)c; //48 <= &&  57 >=
			if(asc < 48 || asc >57) {
				b = true;				//1a2
				break;
			}
			
		}

	}

}
