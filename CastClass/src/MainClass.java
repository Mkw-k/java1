
public class MainClass {

	public static void main(String[] args) {
		/*
		 	(자료형)변환		byte
		 	boolean 		1
		 								우선순위
		 	 byte 			1			낮음
		 	 short 			2			
		 	 int 			4
		 	 long 			8
		 	 
		 	 float 			4
		 	 double			8			높음
		 	
		 	자동 (자료)형 변환 
		 	강제 (자료)형 변환 -> cast 변환 
		 */

		// 자동 변환 
		short sh = 12345;
		int num;
		
		num = sh;
		System.out.println(num);
		
		num = 23456;
		sh = (short)num;  // cast 변환     명시적 형 변환  강제 형 변환 
		System.out.println(sh); 
		
		num = 129; 
		byte by = (byte)num;//범위가 넘쳣을경우 원치 않는 값을 가질수 있다  
		System.out.println(by); //- 128
		
		long l = 123456789;
		float f; 
		f = l;     //자동형변환 
		System.out.println(f);
		
		/*
		 * 1.23456792E8 = 1.23456792 * 10의 8승 100000000
		 */
		
		f = 1.23456792f;
		//l = f; //우선순위는 플롯이 더 높다 
		
		float f1; 
		
		f1 = 3/2;
		System.out.println(f1);
		f1 = (float)3/2; 
		System.out.println(f1);
		
		double value = 1234.56;
		int num1;
		num1 = (int)value;
		System.out.println(num1);
		
	}

}
