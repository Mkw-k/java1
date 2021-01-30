import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		int a = 115;
		System.out.println((int)a);
	}
	
	
	public static void main01(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 계산기 
		String num1; 	// 입력용
				 //입력용
		 	  // 결과 출력용 
		boolean b = false;
		
		// 1. 입력 
		// 숫자1 
		
	while(true) {
		System.out.print("숫자1 = ");
		num1 = sc.next();
		for(int i =0; i<num1.length(); i++) {
			char c = num1.charAt(i);
			int asc = (int)c;
		
			if(asc <= 47 && asc >= 58) {
				b = true;
				System.out.println(b);
				break;
				
			}
			else {
				b = false;
			}
			
		}
		
		if(b==true) {
			System.out.println("숫자로 다시 입력하세요");
			continue;
		}
		else {
			break;
		}
	}//end while
	
	System.out.println(num1);
		

	}

}
