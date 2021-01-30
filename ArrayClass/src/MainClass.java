
public class MainClass {

	public static void main(String[] args) {
		
		/*
		 
		 Array(배열) : 같은 자료형 변수들의 묶음, <- 변수들 
		     		 목적 : 변수 관리. 
		 
		 int num1, num2; //
		 
		  형식 : 
		  	  자료형 배열변수명[] = new 자료형[배열의 총수];
		  	  
		  	  int Array[] = new int[5];   int num1, num2, num3, num4, num5;   내부적으론 다르지만 외부적으론 같다 
		  	  					//동적할당 : 자신의 마음에 드는 개수만큼 변경가능, 배열수가 정해지면 정적으로 써야된다 
		                                                	    
		  	    자료형은 동일해야한다                   
		  	     정적할당
		  	   Array[0] =11;                        num1 =11; num2 =22;
		  	   Array[1] =22;
		  	   Array[2] =33;
		  	   Array[3] =44;
		  	   Array[4] =55;
		  	   
               0 -> index number
               	           
		 int num1, num2 ... num10.........num100; 
		 
		 변수의 연장 엄청많은 수를 관리하기 위한 목적 
		 
		       동적 -> 설정후 -> 정적 
		 
		 */
		
		//  배열변수  == 변수들명     
//		int Array[] = new int[5];
//		int []Array = new int[5];
		int[] Array = new int[5];
		
		//            dynamic(동적) allocation(할당)
		
		// 배열의 Heap영역의 주소  
		System.out.println( Array );
		// 15db9742 -> 4 byte 
		
		// 배열의 길이
		System.out.println(Array.length);
		
		// 배열을 접근 
		
//		int num1;
//		System.out.println(num1)    초기화가 안되어 있어서 오류남 
		
		System.out.println(Array[0]);
		//동적할당을 한 변수의 영역은 자동초기화 된다. 00000
		
		//index number는 배열 총수의 -1 번지까지가 범위이다. 
		Array[0] = 11;
		Array[1] = 22;
		Array[2] = 33;
		Array[3] = 44;
		Array[4] = 55;
		
	   System.out.println(Array[1]);
	  
	   //변수의 선언 + 초기화
	   int number = 0;
	   
	   //배열 초기화 (initialize) 
	   int Array1[] = { 11, 22, 33, 44, 55 }; 
	   
//	   int Array1[];
//	   Array1 =  { 11, 22, 33, 44, 55 }; //이거는 안됨 선언과 동시에 초기화 해야함 배열은 
	   
	   System.out.println(Array1.length);
	   
	   System.out.println( Array[1]);
		
	   // char 배열 "hello" 길이, [0]~[4]
	   char cArray[] = new char[5];
	   cArray[0] = 'h';
	   cArray[1] = 'e';
	   cArray[2] = 'l';
	   cArray[3] = 'l';
	   cArray[4] = 'o';
	   System.out.println(cArray.length);
	  
	   
	   // char 배열 "world" 초기화 
	   char cArray1[] = {'w', 'o', 'r', 'l', 'd'};
	  
	  System.out.println(""+cArray1[0]+cArray1[1]+cArray1[2]+cArray1[3]+cArray1[4]);
	  
	  System.out.println(cArray[0]+cArray[1]+cArray[2]+cArray[3]+cArray[4]);
	  
	  System.out.println(cArray1);
	  
	  char c = 'A';
	  char a = 'B';
	  System.out.println("확인");
	  System.out.println(c + a);
	  System.out.println((int)c);   //아스키코드 값 
	  
	  System.out.println("캐스팅");
	  System.out.println(c);
	
	  
	  //Wrapper class 기본자료형 -> 객체화 
	  String str = "world";
	 
	  /*
	   다음은 소문자를 대문자로 변경해서 출력하고 대문자면 소문자로 출력하는 코드를 작성하라.
	   문자코드는 소문자가 대문자보다 32만큼 더 크다 
	   예를들어 'A'의 코드는 65이고 'a의 코드는 97이다  +32
	   */
	  System.out.println("과제");
	  char ch = 'c';	 
	  //대문자로 변경해서 출력 
	 int ascii1 = (int)ch;
	 System.out.println(ascii1);
	 ascii1 = ascii1 -32;
	 ch = (char)ascii1;
	 System.out.println(ch);
	  
	 

	  
	  ch = 'D';
	  //소문자로 변경해서 출력 
	  int ascii2 = (int)ch;
	  int cast2 = ascii2 + 32;
	  ch = (char)cast2;
	  System.out.println(ch);
	    
	  
	  
	  
	  
	  // random 0 ~ 99 -> 45 
	  int r = (int)(Math.random()*100);
	  System.out.println(r);
	  
	  // random 11 12 13 14 15 
	  int r1 = (int)(Math.random()*5)+11;
	  System.out.println(r1);
	  
	  // random 3 7 8 9 14 
	  // 배열 초기화 
	  int[] arrRand = {3,7,8,9,14};
	  //           0 ~ 4
	  int rIndex = ((int)(Math.random()*5));
	  System.out.println(rIndex);
	  System.out.println(arrRand[rIndex]);
	  
	  //배열복사
	  int arrayNum[] = {111, 222, 333};
	  int arrayCopy[] = new int[arrayNum.length];
	  
	  //value(값) 복사
	  arrayCopy[0] = arrayNum[0];
	  arrayCopy[1] = arrayNum[1];
	  arrayCopy[2] = arrayNum[2];
	
	  System.out.println(arrayCopy[2]);
	  
	  arrayCopy[2] = 300;
	  System.out.println(arrayNum[2]);
	  
	  int arrayNum2[] = {111, 222, 333};
	  int arrayCopy2[] = arrayNum2; //address 복사 , value를 copy한게 아님  
	  //두변수는 같은 값이다. 분신이 아니라 자기자신 (포인터개념)
	  
	  System.out.println(arrayCopy2[1]);
	  
	  arrayCopy2[1] = 200;
	  
	  System.out.println(arrayNum2[1]);
	  
	  
	  
	  
	  int number1[] = { 11, 22, 33 };
	  int number2[] = { 77, 88, 99 };
	  
	  //하드코딩 이러한 작업은 좋지 않다 처리도 많고 
//	  int temp;
//	  temp = number1[0];
//	  number1[0] = number2[0];
//	  number2[0] = temp;
//	  
//	  temp = number1[1];
//	  number1[1] = number2[1];
//	  number2[1] = temp;
//	  
//	  temp = number1[2];
//	  number1[2] = number2[2];
//	  number2[2] = temp;
	  
	  int numAlias1[] = number1;
	  int numAlias2[] = number2;
	  
	  int temp[];
	  temp = numAlias1;
	  numAlias1 = numAlias2;
	  numAlias2 = temp;
	  
	  System.out.println("" +numAlias1[0] + " "+numAlias1[1] + " " +numAlias1[2]);
	  System.out.println("" +numAlias2[0] + " "+numAlias2[1] + " " +numAlias2[2]);
	  
	  
	  //변수명 재기입하여 사용할수 있다. 
	  int numberArrayPosition[] = {1,2};
	  int numArrPos[] = numberArrayPosition;
	  
	}

}




