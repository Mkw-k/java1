
public class MainClass {

	public static void main(String[] args) {
		
		// 변수(그릇)의 자료형 종류
		// 수치형 
		// 정수 
		byte by; // 1 byte == 8 bit   0000 0000(0) -> 1111 1111(255) -> 256 개 담을수 있음
				 //				0000 0000 (맨 앞에 숫자는 부호비트) -> 0(+) 1(-)
		by = -128;	// -128 ~ 127
		//by = -129;
		System.out.println(by);
		
		short sh; // 2 byte 0000 0000 0000 0000
		sh = 12345;
		System.out.println(sh);
		
		int i; 			//4 byte     short int     long int    -->short int long  
		i = 232131231;
		System.out.println(i);
		
		long l; //8 byte 
		l=231321321515115L;
		
		//실수 
		float f;  //4 byte
		f = 123.456F;
		System.out.println(f);
		
		double d; // 8 byte 
		d = 234.5656565656;
		System.out.println(d);
		
		
		// 문자형 
		char c;		//2 byte   character 
					// a~z, A~Z, 0 ~ 9, !@#$%
		c = 'A';
		c = 'a';
		c = '+';
		c = '한';
		System.out.println(c);
		
		//c = 'ab';
		
		//문자열(String) "sbds" "hello" "안녕하세요"
		//String(class)
		String str; 
		str = "hello";
		System.out.println(str);
		
		str = "world";
		System.out.println(str);
		
		System.out.println(str+1+2);
		System.out.println(1+2+str);
		
		
		// 논리형 
		boolean b; 	// 1 byte  =  true(1), false(0)
		b = true; 
		System.out.println(b);
		b = false;
		System.out.println(b);
		
		// \n(개행), \t(띄어쓰기), \"(따옴표) 
		System.out.println("\\"); // \를 쓰려고 할땐 하나 더 쓰면 된다. 
		

	}

}
