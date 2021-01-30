import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		//입력 
		Scanner scan = new Scanner(System.in);
		
		// console 입력 
		

		// boolean true/false 
//		boolean b; 
//		System.out.print("b = ");
//		b = scan.nextBoolean();
//		System.out.println(b);
		

		// integer 정수 
//		int number; 
//		System.out.print("number = ");
//		number = scan.nextInt();
//		System.out.println(number);
		
		
		// double 실수 
//		double d;
//		System.out.print("d = ");
//        d = scan.nextDouble();
//        System.out.println(d);
		
		// String 문자열 
//        String str;        
//        System.out.print("str = ");
//        str = scan.next();        
//        System.out.println(str);
        
		
		//java 문자열 입력 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       // 저장공간  읽기
        System.out.print("str = ");
		String str = br.readLine(); // 띄어쓰기를 인정 
		
		System.out.println(str);

	}

}
