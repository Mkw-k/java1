package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	static == 정적 <==> dynamic : 동적  
		 	
		 	
		 
		 */
		
//		MyClass cls = new MyClass();
//		cls.number = 1;

//		MyClass.staticVar = 12;
		
		MyClass cls = new MyClass();
		cls.function();
		cls.function();
		cls.function();
		
		MyClass cls1 = new MyClass();
		cls1.function();
		cls1.function();
		
	}

}
