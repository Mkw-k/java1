package main;

public class MyClass {

	public static void main(String[] args) {
		/*
		  절차지향 : 변수선언, 함수 -> 연산 
		  			(순서지향) -> line 50000 넘어가면 헤맨다
		  			유지보수 X, 재사용성 떨어짐
		  객체지향 : 하나의 object -> 주사위 
		  		유지보수O, 재사용성 
		  		가독성 
		  		
		  class 클래스명 {
		  		변수(멤버변수)
		  		
		  		메소드(멤버메소드)
		  }
		  
		  
		  클래스명  변수 = new 클래스명();
		 (자료형) (instance, object)
		 
		 변수.변수(멤버); 
		 변수.메소드();
		 
		 delete 변수; //안지우면 쌓인다 heap영역에 메모리 leak현상   자바에서는 Garbage Collector가 대신해줌 
		 
		 */
		
		/*
		   constructor : 	생성자 
		   					함수(메소드)
		   					클래스명과 같다 
		   					return값이 없다  //사실은 있다 this를 넘겨주는거임
		   					Over Load가 가능하다
		   					class 생성시에 자동 호출
		   					별도의 호출이 불가능
		   					초기화 안됨 (초기화가 아니다)
		   					생략이 가능하다
		   
		   
		   destructor :		 소멸자 <- 가비지(쓰레기) 콜렉터
		   					반드시 1개 
		   			
		   Array  :  같은 자료형의 묶음
		   					
		   struct AAA{  : 다른 자료형의 묶음 . 구조체 
		   		int i;
		   		float f;
		   		char c;
		   }
		   
		   int array[] = {1, 2, 3};
		   AAA aaa = {1, 2.1, 'A'};
		   
		   class MyClass {
		   		int n;
		   		char c;
		   }
		   
		   MyClass cls = {1, 'B'}; //에러남 안됨 . 그래서 나온게 Constructor
		
		   MyClass cls1 = new MyClass();
		   MyClass cls2 = new MyClass();
		
		   this : 객체 생성시에 Heap영역의 주소 
		   		  (자기 자신의 주소) 
		 */	

		TestClass tc = new TestClass(); 
		
		TestClass tc1 = new TestClass('A');
		
		TestClass tc2 = new TestClass(23, "hello");
		
		System.out.println(tc);
		tc.method(12);
		
		TestClass tc3 = new TestClass('A');
		
//		tc3.TestClass('A');  안됨
		
		TestClass tc4 = new TestClass(123, "world");// 생성자 3개 다호출 
	}

}
