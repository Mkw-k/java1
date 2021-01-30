
public class MainClass {

	public static void main(String[] args) {
		/*
		  Object Oriented Programming
		  
		  1.은닉성(캡슐화)
		  2.상속성
		  3.다형성
		  
		  AOP
		  
		  
		     class 클래스명{
		     	변수
		     	메소드
		     }
		     
		     주사위 게임
		     number -> 3
		     random -> 3
		     
		     주사위 -> 3
		     number
		     random
		     
		     학생               학생 ->
		     변수들 ->    변수
		     함수->		   함수 ->
		     
		     
		 */
		
		int number[] = new int[5];
		int lang[] = new int[5];
		int math[] = new int[5];
		int eng[] = new int[5];
		String name[] = new String[5];
		
		number[0] = 1;
		
		student st[] = new student[5]; //배열생성 
		student st1, st2, st3, st4, st5;
		st1 = new student();
		
		
		for (int i = 0; i < st.length; i++) {
			st[i] = new student();
		}
	
		st[0].number = 1;
		
//		student st = new student();
		// student :클래스명     st:객체(object)(=변수), instance(주체)
//		st.number = 1;
		
		MyClass cls1 = new MyClass(); //동적할당은 꼭 해줘야한다.
		cls1.x = 1;
		cls1.y = 2;
		cls1.z = 3;
		cls1.method();
	
		MyClass cls2 = null;
		cls2 = new MyClass();
		cls2.x = 3;
		cls2.y = 4;
		cls2.z = 5;
		cls2.method();
		
	}

}


class student{
	int lang;	//member 변수 
	int math;
	int eng;
	int number;
	String name;
}

class MyClass {
	//변수 
	int x, y, z;
	
	//메소드 
	void method() {
		System.out.println("MyClass method() 호출");
		
	}
}


