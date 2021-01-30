
public class MainClass {

	public static void main(String[] args) {
	
		/*
		   Wrapper Class
		      일반 자료형(char, int)을 객체(class)화 한것.
		      
		         일반 자료형 					wrapper class 
		    boolean     			Boolean 
		    
		    byte					Byte
		    short					Short
		    int						Integer ---------------
		    long 					Long 
		    
		    float					Float 
		    double					Double  -----------------
		    
		    char					Character
		    char[]					String  ----------------
		 
		 */
		
		//Integer == int 
		int i = 123;
		Integer in = 234;
		
		System.out.println(i);
		System.out.println(in);
		
//		Integer iobj = new Integer(345);
		Integer iobj = 345;
		
//		String str = new String("Hello");
		String str = "Hello";    //자동 동적할당 
		
//		int arr[] = new int[3];
		int arr[] =  {1,2,3};
		
		/*
		 class = 변수 + 함수(기능)
		  동적할당을 해야한다. 사용시  
		 
		 */
		
		//숫자(number) -> 문자열(String) 
//		int n = 123;
//		String s = "" +n;
		Integer n = 234;
		String s = n.toString();
		System.out.println(s);
		
	
		//문자열(String) -> 숫자(number) 
		String s1 = "1234";
		int num = Integer.parseInt(s1);
		
		System.out.println(num);
		
		//숫자(number) -> 문자열(String) 
		double d = 123.456;
		String s2 = "" + d;//일반 자료형은 가능 
		
		Double d1 = new Double(234.567);
		String s3 = d1.toString();		
		
		//문자열(String) -> 숫자(number) 
		String s4 = "459.789";
		double d2 = Double.parseDouble(s4);
		System.out.println(d2);
	}
	

}
