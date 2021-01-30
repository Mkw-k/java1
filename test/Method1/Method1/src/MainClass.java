
public class MainClass {
	public static void main(String[] args) {
		/*
			function 함수. 독립적 	
			method	 함수. class에 소속되어 있는 함수.
			
			형식:	return == 돌아오는 값
			
			return값의 자료형 함수명(parameter(매개변수), 인수, 인자){
				
				처리코드
			
				return 값;
			}
			
			void -> 자료형이 없는 것
			
			구성요소
			parameter(매개변수)
			return 값
		*/
		
		methodName();
		
		int r = method1( 7 );	// 7 == argument 실인수
		System.out.println("r = " + r);
		
		
		method2(" a g ain ");
		
		int r1 = method3();
		System.out.println(r1);
		
	//	int array[] = new int[5];
		int array[] = method4();
		
		double d = Math.random();
		
		int r2 = method5('Z', "hello world");
		System.out.println(r2);
		
		
		// ACSII code -> 알파벳
		char c = ascToChar(65);
		System.out.println("c = " + c);
		
		// 알파벳 -> ACSII code
		int a = charToAsc('a');
		System.out.println("a = " + a);
		
		// 소수/정수 -> ture/false	
		double dnum = 1234.567;
		boolean b = isDouble(dnum + "");	// .5654   342342.
		if(b) {
			System.out.println("소수입니다");
		}else {
			System.out.println("정수입니다");
		}
		
	}
	
	static char ascToChar(int asc) {
		return (char)asc;
	}
	
	static int charToAsc(char c) {		
		int asc = (int)c;
		return asc;
	}
	
	static boolean isDouble(String snum) {		
		boolean b = false;
		for (int i = 0; i < snum.length(); i++) {
			char c = snum.charAt(i);
			if(c == '.') {
				b = true;
				break;
			}
		}
		return b; 
	}
	
	
	static void methodName() {
		System.out.println("void methodName() 호출");		
	}
	
	/*
		함수명 : method1
		매개변수 : int - 2배로 하고 싶은 값
		return : int
	*/
	static int method1(int p) {	// p == parameter 가인수
		System.out.println("int method1(int p) 호출");		
		
		p = p * 2;		
		return p;
	}
	
	static void method2(String s) {
		System.out.println("int method2(String s) 호출");
		
		String str = s.replace(" ", "");
		str = str.toUpperCase();
		
		System.out.println("str = " + str);
	}
	
	static int method3() {
		int r = 123;
		return r;
	}
	
	static int[] method4() {
		int num[] = new int[10];		
		return num;
	}
	
	static int method5(char c, String str) {
		System.out.println("c = " + (int)c);
		int len = str.length();		
		return len;
	}
	
}











