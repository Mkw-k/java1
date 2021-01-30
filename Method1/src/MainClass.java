
public class MainClass {

	public static void main(String[] args) {
		/*
		   function	함수 , 독립적
		   method 	함수, class 에 소속되어있는 함수.   // 자바는 모두 클래스로 되어있어서 자바는 함수를 메소드라 부름 
		   
		   
		   형식 : return == 돌아오는 값
		   
		    return 값의 자료형 함수명 (parameter(매개변수), 인수, 인자) {
		    	 처리코드 
		    	 
		    	 return 값;
		    }
		    
		    void -> 자료형이 없는 것
		    
		    구성요소
		    parameter(매개변수)
		    return 값
		   
		   
		 */
		methodName();
		
		int p =method1(7); // 7 == argument 실인수
		System.out.println(p);
		System.out.println("r =");
		int r1 = method3();
		System.out.println(r1);
		int array[] = method4();
		
		double d = Math.random();
		
		int r2 = method5('Z',"hello world");
		System.out.println(r2);
		
	//	int array[] = new int[5];
		
	}	
		
		/*
		   함수명 : method1
		   매개변수 : int - 2배로 하고 싶은 값
		  return :int
		 */
		static void methodName() {
			System.out.println("void methodName() 호출 ");
		}
		
		
		
		static void method2(String s) {
			System.out.println("int method2(String s) 호출");
			
			String str = s.replace(" ", "");
			str = str.toUpperCase();
			
			System.out.println("str = " + str);
		}
				

	

	private static int method1(int p) {// parameter 가인수 
		System.out.println("int method(int p) 호출");
		
		p=p*2;
		return p;
		
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
	
}//end class















