package main;

public class MyClass {
	
	int number;

	public void method() {
		System.out.println("MyClass method()");
	}
	
	public static void staticmethod() {
		System.out.println("static method()");
	}
	
	public static MyClass getObject(){
		
		int num;
		MyClass cls = new MyClass();
		//cls 초기화
		//필요한 처리 
		
//		number =1; //멤버변수 접근 안됨 
// 		method();
//		this.
//		super
		return cls;
	}
}
